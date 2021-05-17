package model;

public class Admin extends User{

    protected Boolean isAdmin;

    public Admin(String user_name, String pass, String email) {
        super(user_name, pass, email);
        this.isAdmin = true;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }
}
