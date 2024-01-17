package com.rts.evaluation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rts.evaluation.controller.CarController;
import com.rts.evaluation.model.Car;

@SpringBootTest
class SpringBootRestBookCarApplicationTests {
	
	@Autowired
	CarController controller;
	String insert;
	String result;
	String result1;

	List<Car> list = new ArrayList<Car>();
	List<Car> list1 = new ArrayList<Car>();
	Car cus1;
	Car cus2;


	@Test
	void contextLoads() {
	}
    @Test
    
    public void testPerformInsert() {
    	Car obj = new Car();
		obj.setCarNo(5001);
		obj.setDateOfBooking("10.01.2024");
		obj.setFromLocation("Chennai");
		obj.setToLocation("Sivakasi");
		obj.setBookedName("Gayathri");
		obj.setBookedPhoneNumber("9078563456");
		
		insert = "inserted";
		result = controller.performInsert(obj);
		assertEquals(insert, result);
    }


}

