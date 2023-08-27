package et.javaguides.sringbootbackends;

import et.javaguides.sringbootbackends.model.Employee;
import et.javaguides.sringbootbackends.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SringbootBackendsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SringbootBackendsApplication.class, args);
	}
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public void run(String... args) throws Exception {
//          Employee employee = new Employee();
//          employee.setFirstName("karim");
//          employee.setLastName("haj salah");
//          employee.setEmailId("karim@gmail.com");
//          employeeRepository.save(employee);
//
//        Employee employee1 = new Employee();
//        employee1.setFirstName("marwa");
//        employee1.setLastName("smida");
//        employee1.setEmailId("marwa@gmail.com");
//        employeeRepository.save(employee1);
    }
}
