package com.example.demo.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document(DemoModel.DEMO_MODEL)
public class DemoModel {
    public static final String DEMO_MODEL = "demo_model";
    @Id
    private String id;

    private String name;

    private Integer number;
}
