package com.app;

//import org.hibernate.annotations.Table;
import org.hibernate.query.Query;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Data
@Getter
@Setter

@ToString
@NamedQueries({

	@NamedQuery(name = "findEmployeeByName",
			
	query = "from Employee e where e.name = :name"),
	
})
@Entity
@Table(name="empl1")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  id;

	@Column
	private String name;
	@Column
	private int salary;
	@Column
	String job;
	
	
	public Employee() {}
	public Employee(String name, int salary, String job) {
		super();
		this.name = name;
		this.salary = salary;
		this.job = job;
	}

}
