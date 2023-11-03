package programme_26_encapsulation;

public class Encapsulate {
    // Private variables declared, these can only be accessed by public methods of the class
    private String name;
    private int rollNo;
    private int age;

    // Set method for 'name' to access the private variable 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Get method for 'name' to access the private variable 'name'
    public String getName() {
        return name;
    }

    // Set method for 'rollNo' to access the private variable 'rollNo'
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // Get method for 'rollNo' to access the private variable 'rollNo'
    public int getRollNo() {
        return rollNo;
    }

    // Set method for 'age' to access the private variable 'age'
    public void setAge(int age) {
        this.age = age;
    }

    // Get method for 'age' to access the private variable 'age'
    public int getAge() {
        return age;
    }
}

