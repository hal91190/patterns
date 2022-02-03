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

  private Employee(Builder builder) {
    firstname = builder.firstname;
    lastname = builder.lastname;
    birthDate = builder.birthDate;
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

  /**
   * Permet l'initialisation d'un personnel selon le pattern Builder.
   */
  public static class Builder {
    private final String firstname;
    private final String lastname;
    private final LocalDate birthDate;

    /**
     * Fournit les attributs obligatoires pour un personnel.
     *
     * @param firstname prénom
     * @param lastname nom
     * @param birthDate date de naissance
     */
    public Builder(String firstname, String lastname, LocalDate birthDate) {
      this.firstname = firstname;
      this.lastname = lastname;
      this.birthDate = birthDate;
    }

    public Employee build() {
      return new Employee(this);
    }
  }
}
