package org.neomatrix369.salaryslip;

import org.junit.Test;
import org.neomatrix369.salaryslip.model.Employee;
import org.neomatrix369.salaryslip.model.SalarySlip;

import static org.assertj.core.api.Assertions.assertThat;

public class SalarySlipGeneratorShould {

    @Test
    public void shouldGenerateSmallGross() {

        //Given
        SalarySlipGenerator salarySlipGenerator = new SalarySlipGenerator();

        Employee smallGrossEmployee = Employee.builder()
                .employeeId("11111")
                .name("SmallGross")
                .grossSalary(5_000.00D)
                .build();

        //When
        SalarySlip salarySlip = salarySlipGenerator.generator(smallGrossEmployee);

        //Then
        assertThat(salarySlip).extracting("income").containsExactly(416.67D);
    }

    @Test
    public void shouldGenerateMediumGross() {

        //Given
        SalarySlipGenerator salarySlipGenerator = new SalarySlipGenerator();

        Employee mediumGrossEmployee = Employee.builder()
                .employeeId("22222")
                .name("MediumGross")
                .grossSalary(8_060.00D)
                .build();

        //When
        SalarySlip salarySlip = salarySlipGenerator.generator(mediumGrossEmployee);

        //Then
        assertThat(salarySlip).extracting("income").containsExactly(671.67D);
    }


}
