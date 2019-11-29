package com.josdev27.sample.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "saludos")
public class Saludo implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
 
    @Column(name = "saludo")
    private String saludo;
    
    public Saludo() {
        
    }

    public Saludo(String saludo) {
        this.saludo = saludo;
    }
    
    public String getSaludo() {
        return this.saludo;
    }
    
    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
    
}
