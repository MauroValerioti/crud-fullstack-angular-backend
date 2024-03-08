package com.AngularProyect.Fullstack.crudfullstackangular.controller;

import com.AngularProyect.Fullstack.crudfullstackangular.entity.Customer;
import com.AngularProyect.Fullstack.crudfullstackangular.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//permite trabajar con la arquitectura api Rest. con endpoints que intercambiarn JSON.
//convierte el archivo Java a un formato JSON.
@RestController
//http://localhost:8080/api/customers
@RequestMapping("/api/customers")         //identifica un recurso unico en el backend. Una Uri como atributo
public class CustomerController {


    //requiere ser final para poder ser inyectado con contructor
    private final CustomerService customerService;  //objeto de  serivicio

    //inyeccion de dependencia a customerService.
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //URL: localhost:8080/api/customers
    @PostMapping("/create") //este metodo va a manejar una peticion del tipo Post
    public Customer save(@RequestBody Customer customer){ //@RequestBody transforma la peticion del cliente de un JSON a un objeto del tipo Java
        return customerService.save(customer);
    }

    //URL: localhost:8080/api/customers/
    @GetMapping //permite manejar peticiones del tipo GET.
    public List<Customer> findAll(){
        return customerService.findAll();
    }
    //URL: localhost:8080/api/customers/{id}
    @GetMapping("/{idCustomer}")
    public Customer findById(@PathVariable("idCustomer") Integer id){ //@PathVariable me permite mapear el atributo a la uri
        return customerService.findById(id);
    }
    //URL: localhost:8080/api/customers/{id}
    @DeleteMapping("/{id}") //indica que el metodo maneja una peticion del tipo delete para eliminar un elemento en la db
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

    //URL: localhost:8080/api/customers
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        Customer customerDb = customerService.findById(customer.getId());

        customerDb.setFirstname(customer.getFirstname());
        customerDb.setLastname(customer.getLastname());
        customerDb.setEmail(customer.getEmail());

        return customerService.save(customerDb);
    }
}
