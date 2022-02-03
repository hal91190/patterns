package fr.uvsq.hal.pglp.patterns;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
  @Test
  public void unPersonnelPossedeLesCaracteristiquesObligatoires() {
    Employee employee = new Employee("Frodon", "Sacquet", LocalDate.of(1987, 6, 12));
    assertEquals("Frodon", employee.getFirstname());
    assertEquals("Sacquet", employee.getLastname());
    assertEquals(LocalDate.of(1987, 6, 12), employee.getBirthDate());
  }
}