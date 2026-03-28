package nju.thesis.uml.auth;

import java.util.Objects;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class RoleAssignment {
  private final Ids.UserId userId;
  private final Ids.RoleId roleId;
  private final Enums.ScopeType scopeType;
  private final Long scopeId;

  public RoleAssignment(Ids.UserId userId, Ids.RoleId roleId, Enums.ScopeType scopeType, Long scopeId) {
    this.userId = Objects.requireNonNull(userId);
    this.roleId = Objects.requireNonNull(roleId);
    this.scopeType = Objects.requireNonNull(scopeType);
    this.scopeId = scopeId;
  }

  public Ids.UserId getUserId() {
    return userId;
  }

  public Ids.RoleId getRoleId() {
    return roleId;
  }

  public Enums.ScopeType getScopeType() {
    return scopeType;
  }

  public Long getScopeId() {
    return scopeId;
  }
}

