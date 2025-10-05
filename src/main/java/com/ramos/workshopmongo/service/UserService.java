package com.ramos.workshopmongo.service;

import com.ramos.workshopmongo.domain.User;
import com.ramos.workshopmongo.dto.UserDTO;
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
        return repo.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User fromDTO(UserDTO obj){
        return new User(obj.getId(), obj.getName(), obj.getEmail());
    }
}
