package com.example.mongoTest.domain;

import lombok.Builder;
import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@Document(collection="user")
public class UserEntity {

    @Id
    private String id;

    private String userName;

    private String email;
}
