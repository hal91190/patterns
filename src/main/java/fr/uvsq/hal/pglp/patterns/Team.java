package fr.uvsq.hal.pglp.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 * La classe <code>Team</code> représente un groupe dans une organisation.
 *
 * @author hal
 * @version 2022
 */
public class Team implements OrganizationElement {
  private List<OrganizationElement> members;

  public Team() {
    members = new ArrayList<>();
  }

  public void add(OrganizationElement element) {
    members.add(element);
  }

  public boolean contains(OrganizationElement element) {
    return members.contains(element);
  }
}
