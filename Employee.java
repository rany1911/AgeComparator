public class Employee {
    public String name;
    public String email = "not specified";
    public int phone;

    public Employee(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + ((phone > 0) ? phone : "not specified"));
        System.out.println();
    }
}
