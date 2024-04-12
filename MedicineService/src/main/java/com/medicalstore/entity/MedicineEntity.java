package com.medicalstore.entity;

import java.time.LocalDate;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.persistence.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name="medicine")
public class MedicineEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    private String name;

   
    private String dosage;

    
    private double price;

  
    private LocalDate expirationDate;

    private String manufacturer;

  
    private String batchNumber;

  
    private LocalDate manufacturingDate;

    private String description;
  
    private int quantity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getBatchNumber() {
		return batchNumber;
	}
	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}
	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", dosage=" + dosage + ", price=" + price + ", expirationDate="
				+ expirationDate + ", manufacturer=" + manufacturer + ", batchNumber=" + batchNumber
				+ ", manufacturingDate=" + manufacturingDate + ", description=" + description +  ", quantity=" + quantity + "]";
	}
	
	public MedicineEntity() {
		super();
		
	}
	public MedicineEntity(Long id, String name, String dosage, double price, LocalDate expirationDate,
			String manufacturer, String batchNumber, LocalDate manufacturingDate, String description, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.dosage = dosage;
		this.price = price;
		this.expirationDate = expirationDate;
		this.manufacturer = manufacturer;
		this.batchNumber = batchNumber;
		this.manufacturingDate = manufacturingDate;
		this.description = description;
		this.quantity = quantity;
	}
	

   

}