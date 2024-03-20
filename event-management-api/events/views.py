from rest_framework.decorators import api_view
from rest_framework.response import Response

from events.models import Event
from events.serializers.serializers import EventSerializer, CreateEventSerializer


@api_view(['GET'])
def event_list(request):
    events = Event.objects.all()
    serializer = EventSerializer(events, many=True)
    return Response(serializer.data)


@api_view(['GET'])
def event_detail(request, pk):
    try:
        event = Event.objects.get(pk=pk)
        serializer = EventSerializer(event)
        return Response(serializer.data)
    except Event.DoesNotExist:
        return Response(status=404)


@api_view(['POST'])
def create_event(request):
    serializerRequest = CreateEventSerializer(data=request.data)
    if serializerRequest.is_valid():
        serializerRequest.save()
        serializerResponse = EventSerializer(serializerRequest.instance)
        return Response(serializerResponse.data, status=201)
    return Response(serializerRequest.errors, status=400)
