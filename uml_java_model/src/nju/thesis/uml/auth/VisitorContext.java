package nju.thesis.uml.auth;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import nju.thesis.uml.common.Ids;

public final class VisitorContext {
  private final Ids.UserId userId;
  private final Set<String> grants = new HashSet<>();

  public VisitorContext(Ids.UserId userId) {
    this.userId = Objects.requireNonNull(userId);
  }

  public Ids.UserId getUserId() {
    return userId;
  }

  public Set<String> getGrants() {
    return Collections.unmodifiableSet(grants);
  }

  public void addGrant(String grant) {
    grants.add(Objects.requireNonNull(grant));
  }
}

