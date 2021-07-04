package com.heraizen.es.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ServiceDimenstion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private DimenstionType dimenstionType;
    
    @OneToMany(mappedBy = "serviceDimenstion")
    private List<Picklist> picklist=new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "service_id",referencedColumnName = "id")
    private Service service;

    public void addPicklist(Picklist picklist){
        this.picklist.add(picklist);
    }
}
