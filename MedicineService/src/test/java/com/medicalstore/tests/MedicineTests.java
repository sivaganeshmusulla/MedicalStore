package com.medicalstore.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.medicalstore.controller.MedicineController;
import com.medicalstore.entity.MedicineEntity;
import com.medicalstore.service.MedicineService;

@ExtendWith(MockitoExtension.class)
public class MedicineTests {

    @Mock
    private MedicineService medicineService;

    @InjectMocks
    private MedicineController medicineController;

    private MedicineEntity testMedicine;

    @BeforeEach
    public void setUp() {
        testMedicine = new MedicineEntity();
        testMedicine.setId(1L);
        testMedicine.setName("Test Medicine");
        testMedicine.setDosage("Test Dosage");
        testMedicine.setPrice(10.0);
        testMedicine.setExpirationDate(LocalDate.now().plusDays(30));
        testMedicine.setManufacturer("Test Manufacturer");
        testMedicine.setBatchNumber("12345");
        testMedicine.setManufacturingDate(LocalDate.now());
        testMedicine.setDescription("Test Description");
        testMedicine.setQuantity(100);
    }

    @Test
    public void testGetAllMedicines() {
        List<MedicineEntity> medicines = new ArrayList<>();
        medicines.add(testMedicine);

        when(medicineService.getAllMedicines()).thenReturn(medicines);

        ResponseEntity<List<MedicineEntity>> response = medicineController.getAllMedicines();

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(medicines, response.getBody());
    }

   
    @Test
    public void testAddMedicine() {
        when(medicineService.saveMedicine(testMedicine)).thenReturn(testMedicine);

        ResponseEntity<MedicineEntity> response = medicineController.addMedicine(testMedicine);

        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(testMedicine, response.getBody());
    }

    @Test
    public void testUpdateMedicine() {
        MedicineEntity updatedMedicine = testMedicine;
        updatedMedicine.setName("Updated Test Medicine");

        when(medicineService.updateMedicine(1L, updatedMedicine)).thenReturn(updatedMedicine);

        ResponseEntity<MedicineEntity> response = medicineController.updateMedicine(1L, updatedMedicine);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(updatedMedicine, response.getBody());
    }

    @Test
    public void testUpdateMedicineQuantity() {
        int newQuantity = 200;

        when(medicineService.updateMedicineQuantity(1L, newQuantity)).thenReturn(testMedicine);

        ResponseEntity<MedicineEntity> response = medicineController.updateMedicineQuantity(1L, newQuantity);

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals(testMedicine, response.getBody());
    }
}

    // Add more test cases for other controller methods


