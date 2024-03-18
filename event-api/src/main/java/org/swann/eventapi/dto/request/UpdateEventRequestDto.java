package org.swann.eventapi.dto.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class UpdateEventRequestDto implements Serializable {
    String name;
    String shortDescription;
    String description;
}