package ex1;

public class Teacher extends Human {
    private String salary;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getAge() {
        return super.getAge();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(salary);
    }
}
