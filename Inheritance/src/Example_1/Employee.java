package Example_1;

public class Employee  extends  Person{

    int EmployeeNumber ;
    String Position;
    Double Salary;

    public Employee() {
    }

    public Employee(int id, String dni, String firstName, String lastName, String adress,
                    String phoneNummber, int employeeNumber, String position, Double salary) {
        super(id, dni, firstName, lastName, adress, phoneNummber);
        EmployeeNumber = employeeNumber;
        Position = position;
        Salary = salary;
    }

    public int getEmployeeNumber() {
        return EmployeeNumber;
    }

    public String getPosition() {
        return Position;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setEmployeeNumber(int employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }




}


