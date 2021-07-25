package userApp;

public class App {
    User[] users;
    User currUser = new User("user1", "test");
    int strengthSetting = 1;

    public App() {
        this.users = new User[5];
        users[0].setName("Olivia");
        users[1].setName("Courtney");
        users[2].setName("Ashley");
        users[3].setName("Rachel");
        users[4].setName("Slamantha");
        Home app = new Home();
    }
    public User getCurrUser() {
        return this.currUser;
    }
    public boolean switchUser(User currUser) {
        this.currUser = currUser;
        return true;
    }
    public int getStrengthSetting() {
        return this.strengthSetting;
    }
    public boolean sendStrengthSetting() {
        return false;
    }
}