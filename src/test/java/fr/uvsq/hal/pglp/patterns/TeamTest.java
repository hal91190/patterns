package fr.uvsq.hal.pglp.patterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {
  private Employee frodon;
  private Employee gandalf;
  private Team communaute;

  @BeforeEach
  public void setup() {
    frodon = new Employee.Builder("Frodon", "Sacquet", LocalDate.of(1987, 6, 12)).build();
    gandalf = new Employee.Builder("Gandalf", "Le Gris", LocalDate.of(1987, 6, 12)).build();
    communaute = new Team();
    communaute.add(frodon);
    communaute.add(gandalf);
  }

  @Test
  public void unGroupeContientDesEmployes() {
    assertTrue(communaute.contains(frodon));
    assertTrue(communaute.contains(gandalf));
  }

  @Test
  public void unGroupeContientDesEmployesEtDesGroupes() {
    Team team1 = new Team();
    communaute.add(team1);
    assertTrue(communaute.contains(team1));
  }

  @Test
  public void containsFaitUneRechercheRecursive() {
    Team team1 = new Team();
    team1.add(frodon);
    Team team2 = new Team();
    team2.add(gandalf);
    assertTrue(team1.contains(gandalf));
  }

  @Test
  public void unGroupeNeSeContientPasLuiMemeDirectement() {
    communaute.add(communaute);
    assertFalse(communaute.contains(communaute));
  }

  @Test
  public void unGroupeNeSeContientPasLuiMemeMemeIndirectement() {
    Team team1 = new Team();
    team1.add(frodon);
    Team team2 = new Team();
    team2.add(gandalf);
    team2.add(team1);
    assertFalse(team1.contains(team1));
  }
}
