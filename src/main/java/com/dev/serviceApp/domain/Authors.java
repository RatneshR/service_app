package com.dev.serviceApp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// This class represents the Authors entity in the application.
public class Authors {
    private Long id;
    private String name;
    private Integer age;

}
