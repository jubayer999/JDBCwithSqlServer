package io.riad.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Employee {
	
	int employee_id;
	String employee_name;
	int employee_salary;
	String employee_address;
	String employee_email;

}
