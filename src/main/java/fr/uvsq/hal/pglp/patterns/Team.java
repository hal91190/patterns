package fr.uvsq.hal.pglp.patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * La classe <code>Team</code> représente un groupe dans une organisation.
 *
 * @author hal
 * @version 2022
 */
public class Team implements OrganizationElement, Iterable<OrganizationElement> {
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

  @Override
  public Iterator<OrganizationElement> iterator() {
    return new TeamIterator(members);
  }

  private static class TeamIterator implements Iterator<OrganizationElement> {
    private Iterator<OrganizationElement> iterator;

    public TeamIterator(List<OrganizationElement> members) {
      iterator = members.iterator();
    }

    @Override
    public boolean hasNext() {
      return iterator.hasNext();
    }

    @Override
    public OrganizationElement next() {
      return iterator.next();
    }
  }
}
