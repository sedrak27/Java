package ex1;

public abstract class Human {
    protected int age;
    protected String firstName;
    protected String lastName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printInfo(){
        System.out.println("ahe: " + age);
        System.out.println("firstname: " + firstName);
        System.out.println("lastname: " + lastName);
    }
}
