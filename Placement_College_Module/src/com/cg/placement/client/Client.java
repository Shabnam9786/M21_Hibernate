package com.cg.placement.client;
import com.cg.placement.entities.College;
import com.cg.placement.service.*;

public class Client 
{
	public static void main(String[] args) 
	{
		// CRUD Operation calling activity
		College college = new College();
		ICollegeService service= new CollegeServiceImpl();
		
		//Create Operation
		college.setId(001);
		college.setCollegeAdmin("Prakash");
		college.setCollegeName("PCCOE");
		college.setLocation("Pune");
		
		service.addCollege(college);

	}
}
