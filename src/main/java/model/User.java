package model;

public class User {

    protected String user_name,pass,email,phone;

    public User(String user_name, String pass, String email) {
        this.user_name = user_name;
        this.pass = pass;
        this.email = email;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getAdmin(){
        System.out.println("Method not allowed");
        return null;
    }


}

