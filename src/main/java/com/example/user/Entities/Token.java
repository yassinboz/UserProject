package com.example.user.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Token {
    @Id
    @GeneratedValue
    private Integer id ;
    private String token;
    private LocalDateTime   createdAt;
    private LocalDateTime   expiresAt;
    private LocalDateTime validatedAt;
    @DBRef
    private User user;
}
