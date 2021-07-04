package com.heraizen.es.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Picklist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String label;
    private String value;
    @ManyToOne
    @JoinColumn(name = "service_dimenstion_id",referencedColumnName = "id")    
    private ServiceDimenstion serviceDimenstion;
}
