package edu.escuelaing.edu.TaskPlanner.Pojos;

public class User {

    private String name; 
    private String email; 
    private String password;

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(){

    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public String getPassword(){
        return this.password;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString(){
        return "User [name=" + this.name + ", email= " + this.email + ", password= " + this.password + "]";
    }
}
