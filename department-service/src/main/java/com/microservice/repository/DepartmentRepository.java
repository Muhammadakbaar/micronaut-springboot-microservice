package com.microservice.repository;

import com.microservice.entity.Department;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {
    Department findByDepartmentId(Long departmentId);
}
