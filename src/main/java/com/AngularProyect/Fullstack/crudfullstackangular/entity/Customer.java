package com.AngularProyect.Fullstack.crudfullstackangular.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name="customers")
public class Customer {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) //autoincremental.
    private Integer id;
    private String firstname;
    private String lastname;
    @Column(unique = true, nullable = false) //solo puede existir 1 con este dato. no se puede usar el mismo email 2 veces y no puede ser vacio.
    private String email;


}
