package org.neomatrix369.salaryslip.model;

import lombok.Data;

@Data
public class SalarySlip {

    private final Employee employee;
    private final Double income;
    private Double monthlySalary;
    private Double contributions;
    private Double taxFreeAllowance;
    private Double taxPayable;

}
