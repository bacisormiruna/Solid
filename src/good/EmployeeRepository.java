package good;

public class EmployeeRepository {

    public EmployeeRepository(){

    }
    public void save(GoodEmployee employee) {
        System.out.printf("%s saved to database.\n", employee.getName());
    }
}
