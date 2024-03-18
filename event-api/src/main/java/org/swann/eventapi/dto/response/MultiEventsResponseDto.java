package org.swann.eventapi.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MultiEventsResponseDto implements Serializable {
    String name;
    String slug;
    String shortDescription;
}