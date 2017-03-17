package com.aeturnum.StudentSpringBootREST;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chanaka.k
 *
 */
@RestController
public class StudentController {

	/*private static final String tempFname = "";
	private static final String tempLname	= "";
	private static final String tempCity	= "";
	private static final String tempBdy		= "";
	private static final String tempNoOfSub	= "3";*/
	
	private final AtomicLong id = new AtomicLong();
	
	@RequestMapping("/student")
	public Student getStudent(
			@RequestParam(value="fname", defaultValue="Chanaka") String fname,
			@RequestParam(value="lname", defaultValue="Karunarathna") String lname,
			@RequestParam(value="city", defaultValue="Matale") String city,
			@RequestParam(value="bdy", defaultValue="1989-01-20") String bdy,
			@RequestParam(value="noofsub", defaultValue="3") String noofsub
			) {
				return new Student(id.incrementAndGet(), fname, lname, city, bdy, noofsub);
	}
	
		
}
