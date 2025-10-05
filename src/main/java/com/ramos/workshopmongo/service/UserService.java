package com.ramos.workshopmongo.service;

import com.ramos.workshopmongo.domain.User;
import com.ramos.workshopmongo.repository.UserRepository;
import com.ramos.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();

    }

    public User findById(String id) {
        User user = repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));

        return user;
    }

}
