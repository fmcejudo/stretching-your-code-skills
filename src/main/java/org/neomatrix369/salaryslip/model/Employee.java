package org.neomatrix369.salaryslip.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {


    private String employeeId;
    private String name;
    private Double grossSalary;

}
