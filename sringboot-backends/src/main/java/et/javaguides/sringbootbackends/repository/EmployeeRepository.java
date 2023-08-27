package et.javaguides.sringbootbackends.repository;

import et.javaguides.sringbootbackends.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface  EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}