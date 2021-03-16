import java.util.List;

public interface EmployeeDAO {

    //CRUD Operations
    public List<Employee> getAllEmp();
    public void addEmp(Employee emp);
    public Employee findById(String Id);
    public void updateEmp(Employee employee);
    public void deleteEmp(String Id);
}
