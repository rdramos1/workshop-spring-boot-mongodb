package com.ramos.workshopmongo.service;

import com.ramos.workshopmongo.domain.Post;
import com.ramos.workshopmongo.domain.User;
import com.ramos.workshopmongo.dto.UserDTO;
import com.ramos.workshopmongo.repository.PostRepository;
import com.ramos.workshopmongo.repository.UserRepository;
import com.ramos.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
