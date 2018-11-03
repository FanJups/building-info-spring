package com.builder.demo.shared.dto;

import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FloorDto implements Serializable {
    private static final long serialVersionUID = 6835192601898364279L;
    private Long floorId;
    private String floorName;
}
