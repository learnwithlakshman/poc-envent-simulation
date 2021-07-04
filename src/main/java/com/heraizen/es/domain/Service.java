package com.heraizen.es.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Service {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String name;
        private String description;
        
        @OneToMany(cascade = CascadeType.ALL,mappedBy = "service")
        private List<ServiceDimenstion> serviceDimenstions=new ArrayList<>();

        public void addService(ServiceDimenstion serviceDimenstion){
            this.serviceDimenstions.add(serviceDimenstion);
        }
}
