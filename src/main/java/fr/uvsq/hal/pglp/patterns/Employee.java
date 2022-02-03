package fr.uvsq.hal.pglp.patterns;

import java.time.LocalDate;

/**
 * La classe <code>Employee</code> représente un personnel d'une organisation.
 *
 * @author hal
 * @version 2022
 */
public class Employee {
  private final String firstname;
  private final String lastname;
  private final LocalDate birthDate;

  /**
   * Initialise un personnel.
   *
   * @param firstname prénom
   * @param lastname nom
   * @param birthDate date de naissance
   */
  public Employee(final String firstname, final String lastname, final LocalDate birthDate) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.birthDate = birthDate;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }
}
