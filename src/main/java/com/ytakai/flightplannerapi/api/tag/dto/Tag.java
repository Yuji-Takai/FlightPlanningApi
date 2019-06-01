package com.ytakai.flightplannerapi.api.tag.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag {
    @Id
    private String id;
    private String name;
    private String value;
}
