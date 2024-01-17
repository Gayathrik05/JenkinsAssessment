package com.rts.evaluation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.rts.evaluation.dao.CarDao;
import com.rts.evaluation.model.Car;

@RestController
public class CarController {
	
	@Autowired
	CarDao dao;	
	public String performInsert(Car bean)
	{
		dao.insert(bean);
		System.out.println("Inserted");
		
		List <Car> list=dao.view();
		System.out.println(list);
		return "inserted";
	}

	/*public List<Car> performViewAll() {
			List <Car> list=dao.view();
			return list;
	}*/
}

/*
@RestController
@CrossOrigin("http://localhost:4200/")
public class CarController {

	@Autowired
	CarDao dao;

	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Car obj) {
		dao.insert(obj);
	}

	@GetMapping("/PerformAllEmployee")
	public ArrayList<Car> performViewAll() {
		Iterator<Car> it = dao.view().iterator();
		ArrayList<Car> list = new ArrayList<Car>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}

@RestController
@RequestMapping("/carRest/api")
public class CarController 
{
		@Autowired
		CarService carServiceObj;		
		@PostMapping("/cars")
		public boolean addProduct(@RequestBody Car obj)
		{
			return carServiceObj.addProduct(obj);		
		}		
}
*/

