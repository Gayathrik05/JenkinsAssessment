package com.rts.evaluation.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rts.evaluation.model.Car;

@Repository
public class CarDao {
	static List<Car> list;

	public static void insert(Car bean) {
		list = new ArrayList<Car>();
		list.add(bean);
	}

	public static List<Car> view() {
		return list;
	}

}