package com.AngularProyect.Fullstack.crudfullstackangular.service;

import com.AngularProyect.Fullstack.crudfullstackangular.entity.Customer;
import com.AngularProyect.Fullstack.crudfullstackangular.exception.ResourceNotFoundExeption;
import com.AngularProyect.Fullstack.crudfullstackangular.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.lang.module.ResolutionException;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    //metodo de inyeccion opcional al Autowired.
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        //contiene todos los metodos que ya vienen de JPARepository para evitar tener que cargar todo de cero.
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        Customer customer = customerRepository.findById(id).orElseThrow(
                ()->{
                    throw new ResourceNotFoundExeption();
                }
        );
        return customerRepository.findById(id).get(); //como retorna un optinal tengo que usar el metodo get
    }

    @Override
    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer); //JPA no tiene metodos del tipo "update" en su lugar actualiza el registro con save
    }
}
