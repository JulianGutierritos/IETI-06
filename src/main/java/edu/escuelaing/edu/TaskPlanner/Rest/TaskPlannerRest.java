package edu.escuelaing.edu.TaskPlanner.Rest;

import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.edu.TaskPlanner.Pojos.User;
import edu.escuelaing.edu.TaskPlanner.Services.UserServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TaskPlannerRest {

    @Autowired
    UserServices userServices;
    
    @GetMapping("/users")
    public List<User> getAll(){
        List<User> list =  userServices.getAll();
        return list;
    }

    @GetMapping("/user/{userId}")
    public User getAll(@PathVariable String userId){
        User user =  userServices.getById(userId);
        return user;
    }

    @PostMapping("/user")
    public User create(@RequestBody User user){
        return userServices.create(user);
    }

    @PutMapping("/user")
    public User replace(@RequestBody User user){
        return userServices.update(user);
    }

    @DeleteMapping("/user/{userId}")
    public void remove(@PathVariable String userId){
        userServices.remove(userId);
    }
    
}
