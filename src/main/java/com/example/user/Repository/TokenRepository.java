package com.example.user.Repository;

import com.example.user.Entities.Token;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TokenRepository extends MongoRepository<Token, Integer>{
}
