package com.rts.evaluation;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rts.evaluation.controller.CarController;
import com.rts.evaluation.dao.CarDao;
import com.rts.evaluation.model.Car;

@SpringBootApplication
public class SpringBootRestBookCarApplication {
	static CarDao dao = new CarDao();

	public Car menu() {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter car no,date of booking,from location ,to location , booked name , booked phone number");

		return new Car(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestBookCarApplication.class, args);
		SpringBootRestBookCarApplication obj = new SpringBootRestBookCarApplication();

		Car bean = obj.menu();

		CarController control = new CarController();
		control.performInsert(bean);

	}

}
