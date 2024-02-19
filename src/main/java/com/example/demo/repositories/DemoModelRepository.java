package com.example.demo.repositories;

import com.example.demo.model.DemoModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemoModelRepository extends MongoRepository<DemoModel, String> {
}
