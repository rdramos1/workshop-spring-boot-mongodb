package com.ramos.workshopmongo.repository;

import com.ramos.workshopmongo.domain.Post;
import com.ramos.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
