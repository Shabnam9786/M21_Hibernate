package com.cg.association1;
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="EMP_MASTER")

public class Employee implements Serializable
{
	
	
		private static final long serialVersionUID = 1L;

		@Id
		private int id;
		
		private String name;
		private double salary;

		
		
		@ManyToOne
		@JoinColumn(name="dept_no")
		private Department department;

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
			return department;
		}
		
		public void setDept(Department dept) {
			this.department = dept;
		}
}