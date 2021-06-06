package userApp;

public class App {
    User currUser = new User("User1");

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
    public String getGreeting() {
        return "Welcome";
    }
    public User getCurrUser() {
        return this.currUser;
    }
    public boolean switchUser(User currUser) {
        this.currUser = currUser;
        return true;
    }
}
