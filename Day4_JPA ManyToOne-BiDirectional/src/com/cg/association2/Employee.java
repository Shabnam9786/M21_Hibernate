package com.cg.association2;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "employee2")
public class Employee implements Serializable
{
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Employee_name")
	private String name;
	private double salary;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Department_ID")
	private Department dept;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}	
}