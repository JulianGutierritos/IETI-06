package edu.escuelaing.edu.TaskPlanner.Services;

import java.util.List;

import org.springframework.stereotype.Component;

import edu.escuelaing.edu.TaskPlanner.Pojos.User;

@Component
public interface UserServices {

    List<User> getAll();
    
    User getById(String userId);
    
    User create(User user);
    
    User update(User user);
    
    void remove(String userId);
    
}
