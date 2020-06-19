package com.example.demo;


import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class UserService {
     
    @Autowired
    UserRepository repo;
    
    List<User> getUsers(){
        return (List<User>) repo.findAll();
    }
     
    void addUser(User user) {
        repo.save(user);
    }
 
    public Optional<User> getUserByID(int id) {
        return repo.findById(id);
    }
 
    public void updateUser(User user) {
         
        repo.save(user);
         
    }
 
    public void deleteUser(int id) {
     
        repo.deleteById(id);
         
    }
 
    public User getUserByName(String name) {
        return repo.findByName(name);
    }
     
     
     
     
     
     
}