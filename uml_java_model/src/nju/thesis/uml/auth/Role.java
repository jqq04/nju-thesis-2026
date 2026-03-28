package nju.thesis.uml.auth;

import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class Role {
  private final Ids.RoleId id;
  private String name;

  public Role(Ids.RoleId id, String name) {
    this.id = Objects.requireNonNull(id);
    this.name = Objects.requireNonNull(name);
  }

  public Ids.RoleId getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = Objects.requireNonNull(name);
  }
}

