package com.example.jpaguia;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> { //entidad y tipo de id

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
