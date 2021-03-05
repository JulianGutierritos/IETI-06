package edu.escuelaing.edu.TaskPlanner.Services.InMemory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.escuelaing.edu.TaskPlanner.Pojos.User;
import edu.escuelaing.edu.TaskPlanner.Services.UserServices;

@Component
public class UserServiceInMemory implements UserServices {

    private List<User> users;

    public UserServiceInMemory(){
        users = new ArrayList<User>();
        users.add(new User("pruebastina", "pruebastina@mail.com", "1234"));
        users.add(new User("pruebastian", "pruebastian@mail.com", "5678"));
    }

    public List<User> getAll(){
        return this.users;
    }

    public User getById(String userId){
        User user = null;
        for (int i = 0; i < this.users.size(); i++){
            if (userId.equals(this.users.get(i).getEmail())){
                user = this.users.get(i);
            }
        }
        return user;
    }

    public User create(User user){
        this.users.add(user);
        return user;
    }

    public User update(User user){
        for (int i = 0; i < this.users.size(); i++){
            if (user.getEmail().equals(this.users.get(i).getEmail())){
                this.users.set(i, user);
                break;
            }
        }
        return user;
    }

    public void remove(String userId){
        for (int i = 0; i < this.users.size(); i++){
            if (userId.equals(this.users.get(i).getEmail())){
                this.users.remove(i);
                break;
            }
        }
    }
}
