package fr.uvsq.hal.pglp.patterns;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
  private List<String> functions;

  private Employee(Builder builder) {
    firstname = builder.firstname;
    lastname = builder.lastname;
    birthDate = builder.birthDate;
    functions = builder.functions;
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

  public boolean hasFunction(String function) {
    return functions.contains(function);
  }

  /**
   * Permet l'initialisation d'un personnel selon le pattern Builder.
   */
  public static class Builder {
    // Attributs obligatoires
    private final String firstname;
    private final String lastname;
    private final LocalDate birthDate;

    // Attributs optionnels
    private List<String> functions;

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
      functions = new ArrayList<>();
    }

    public Employee build() {
      return new Employee(this);
    }

    public Builder function(String function) {
      functions.add(function);
      return this;
    }
  }
}
