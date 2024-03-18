package org.swann.eventapi.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class CreateEventRequestDto implements Serializable {
    String name;
    String slug;
    String shortDescription;
    String description;
}
