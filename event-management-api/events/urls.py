from django.urls import path

from events import views

urlpatterns = [
    path('api/v1/events/', views.event_list, name='event_list'),
    path('api/v1/events/<uuid:pk>/', views.event_detail, name='event_detail'),
    path('api/v1/events/create/', views.create_event, name='create_event'),
]
