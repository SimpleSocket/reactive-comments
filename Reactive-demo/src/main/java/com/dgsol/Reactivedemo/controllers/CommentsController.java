package com.dgsol.Reactivedemo.controllers;

import com.dgsol.Reactivedemo.entities.CommentEntity;
import com.dgsol.Reactivedemo.repositories.MongoDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CommentsController {

    @Autowired
    private MongoDb mongoDb;

    @GetMapping("/ping")
    public Mono<String> getDemoMonoResponse(){
        return Mono.just("pong");
    }

    @PostMapping("/comments")
    public Mono<CommentEntity> getAllComments(@RequestBody CommentEntity commentEntity){
        return mongoDb.insert(commentEntity);
    }

    @GetMapping("/comments-collection")
    public Flux<CommentEntity> getAllComments(){
        return mongoDb.findAll();
    }
}
