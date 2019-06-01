package com.ytakai.flightplannerapi.api.provider.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Provider {

    @Id
    private String id;
    private String name;
    private String rateId;
    private String providerType;
    private List<String> tagIds;
}
