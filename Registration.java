package project02;

public class Registration {
    /*Create Registration Class in which you would have variables as
    email, userName and password that have an access scope only
    within its own class. After creating an object of the class user should
            be able to call methods and in each method separately pass values
            to set users email, username and password.
    Requirements:
    A. Valid email consider to be only yahoo
    B. Valid userName and password cannot be empty and should be of
    length larger than 6 characters. Also valid password cannot contain
    userName.*/
    private String email;
    private String userName;
    private String password;

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        if (email.equals("yahoo")) {
            this.email = email;
        } else {
            System.out.println("Enter valid email");
        }
    }

    String getUserName() {
        return userName;
    }

    void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username");
        }
    }

    String getPassword() {
        return password;
    }

    void setPassword(String password) {
        if (!password.isEmpty() && !password.equals(userName) && password.length() > 6) {
            this.password = password;
        } else {
            System.out.println("Invalid password");

        }
    }
}
class RegistrationTester{
    public static void main(String[] args) {
        Registration obj=new Registration();
        obj.setEmail("yahoo");
        System.out.println(obj.getEmail());
        obj.setUserName("fatima192");
        System.out.println(obj.getUserName());
        obj.setPassword("pass@123");
        System.out.println(obj.getPassword());
    }

}