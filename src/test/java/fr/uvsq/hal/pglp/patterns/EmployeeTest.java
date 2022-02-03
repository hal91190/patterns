package fr.uvsq.hal.pglp.patterns;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
  @Test
  public void unPersonnelPossedeLesCaracteristiquesObligatoires() {
    Employee employee = new Employee.Builder("Frodon", "Sacquet", LocalDate.of(1987, 6, 12)).build();
    assertEquals("Frodon", employee.getFirstname());
    assertEquals("Sacquet", employee.getLastname());
    assertEquals(LocalDate.of(1987, 6, 12), employee.getBirthDate());
  }

  @Test
  public void unPersonnelAvecDesFonctions() {
    Employee employee = new Employee.Builder("Frodon", "Sacquet", LocalDate.of(1987, 6, 12))
      .function("Chef de service")
      .function("Président du CE")
      .build();
    assertEquals("Frodon", employee.getFirstname());
    assertEquals("Sacquet", employee.getLastname());
    assertEquals(LocalDate.of(1987, 6, 12), employee.getBirthDate());
    assertTrue(employee.hasFunction("Chef de service"));
    assertTrue(employee.hasFunction("Président du CE"));
  }
}
