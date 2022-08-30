package com.cg.singleinheritance;
import javax.persistence.*;

@Entity
@DiscriminatorValue("MGR")
public class Manager extends Employee
{
	private static final long serialVersionUID=1L;
	private String deptName;
	
	public String getDeptName() 
	{
		return deptName;
	}
	public void setDeptName(String deptName) 
	{
		this.deptName = deptName;
	}
}