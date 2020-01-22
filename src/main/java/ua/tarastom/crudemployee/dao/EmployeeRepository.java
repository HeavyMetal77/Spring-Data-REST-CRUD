package ua.tarastom.crudemployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.tarastom.crudemployee.entity.Employee;

//optinal, give another path - http://localhost:8080/magic-api/members
@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //Var.3 using REST API with Spring Data JPA Repository
}
