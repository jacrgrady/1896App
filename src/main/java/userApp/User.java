package userApp;

public class User {
    // user properties
    private String name;
    private String password;
    private int strengthSetting;
    // setters
    public User() {
    }
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public User(String name, int strengthSetting) {
        this.name = name;
        this.strengthSetting = strengthSetting;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStrengthSetting(int strengthSetting) {
        this.strengthSetting = strengthSetting;
    }
    //getters
    public String getName() {
        return this.name;
    }
    public String getStrengthSetting() {
        if (this.strengthSetting == 0)
            return "Low";
        else if (this.strengthSetting == 1)
            return "Medium";
        else
            return "High";
    }
}
