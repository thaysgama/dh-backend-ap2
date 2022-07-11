package com.dh.catalog.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "catalog")
@Data
@NoArgsConstructor
public class Catalog {
    @Id
    private Long id;
    private Object object;
}
