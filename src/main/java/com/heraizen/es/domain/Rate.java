package com.heraizen.es.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Rate {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String svcDimensionName;
	private int svcCode;
	private String priceMethod;
	private long minQuantity;
	private long maxQuantity;
	private double unitPrice;
	private double minCharge;
	private double maxCharge;
	private String frequency;
}
