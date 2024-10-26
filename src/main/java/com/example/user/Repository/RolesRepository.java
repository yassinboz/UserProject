package com.example.user.Repository;

import com.example.user.Entities.Roles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RolesRepository extends MongoRepository<Roles, Integer> {
}
