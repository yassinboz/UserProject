package com.example.user.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Document(collection = "Roles")
@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Roles {
    @Id
    @GeneratedValue
    private Integer id ;
    private String name;
    @DBRef
    @JsonIgnore
    private Set<User> userIds = new HashSet<>();
}
