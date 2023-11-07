package com.example.springchartsapp.entitiy;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.io.Serializable;

@Data
@Node(labels = "Person")

public class Person implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property
    private String name;
}
