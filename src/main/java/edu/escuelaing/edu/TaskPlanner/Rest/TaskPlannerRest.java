package edu.escuelaing.edu.TaskPlanner.Rest;

import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.edu.TaskPlanner.Pojos.User;
import edu.escuelaing.edu.TaskPlanner.Services.UserServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(userServices.getAll(), HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<?> getAll(@PathVariable String userId){
        return new ResponseEntity<>(userServices.getById(userId), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<?> create(@RequestBody User user){
        return new ResponseEntity<>(userServices.create(user), HttpStatus.OK);
    }

    @PutMapping("/user")
    public ResponseEntity<?> replace(@RequestBody User user){
        return new ResponseEntity<>(userServices.update(user), HttpStatus.OK);
    }

    @DeleteMapping("/user/{userId}")
    public ResponseEntity<?> remove(@PathVariable String userId){
        userServices.remove(userId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
