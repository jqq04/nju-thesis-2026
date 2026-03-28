package nju.thesis.uml.auth;

import java.util.Objects;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class Permission {
  private final Ids.PermissionId id;
  private final Enums.AuthAction action;
  private String name;

  public Permission(Ids.PermissionId id, Enums.AuthAction action, String name) {
    this.id = Objects.requireNonNull(id);
    this.action = Objects.requireNonNull(action);
    this.name = Objects.requireNonNull(name);
  }

  public Ids.PermissionId getId() {
    return id;
  }

  public Enums.AuthAction getAction() {
    return action;
  }

  public String getName() {
    return name;
  }
}

