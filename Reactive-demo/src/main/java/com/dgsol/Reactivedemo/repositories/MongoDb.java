package com.dgsol.Reactivedemo.repositories;

import com.dgsol.Reactivedemo.entities.CommentEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDb extends ReactiveMongoRepository<CommentEntity, String> {
}
