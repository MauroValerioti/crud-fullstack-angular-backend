package com.AngularProyect.Fullstack.crudfullstackangular.repository;

import com.AngularProyect.Fullstack.crudfullstackangular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {


}
