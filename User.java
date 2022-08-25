public class User {
    public String name = "";
    public int age = 0;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printUserInfo() {
        System.out.println("User: " + name + ", " + age + " years old");
    }

}