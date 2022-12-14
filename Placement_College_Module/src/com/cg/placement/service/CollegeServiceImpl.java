package com.cg.placement.service;
import com.cg.placement.entities.College;
import com.cg.placement.repository.CollegeRepositoryImpl;
import com.cg.placement.repository.ICollegeRepository;

public class CollegeServiceImpl implements ICollegeService 
{
	// Establishing connection between Service and Repository
	private ICollegeRepository dao;

	public CollegeServiceImpl() 
	{
		dao = new CollegeRepositoryImpl();
	}
	
	// Step 2: Service calls to perform CRUD Operation
	@Override
	public College addCollege(College college) 
	{
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) 
	{
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(int id) 
	{
		College college = dao.searchCollege(id);
		return college;
	}

	@Override
	public boolean deleteCollege(int id) 
	{
		dao.beginTransaction();
		dao.deleteCollege(id);
		dao.commitTransaction();
		return false;
	}

	@Override
	public boolean schedulePlacement(College college) 
	{
		dao.beginTransaction();
		dao.schedulePlacement(college);
		dao.commitTransaction();
		return false;
	}

}
