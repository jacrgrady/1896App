package userApp;

public class User {
    // user properties
    private String name;
    private int age,weight,height;
    private int sex;
    // setters
    public User(String name) {
        this.name = name;
    }
    public User(String name, int age, int weight, int height, int sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex= sex;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setSex(int sex) {
        this.sex = sex;
    }
    //getters
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWeight() {
        return this.weight;
    }
    public String getSex() {
        if (this.sex == 1)
            return "male";
        else if (this.sex == 2)
            return "female";
        else
            return "n/a";
    }
}
