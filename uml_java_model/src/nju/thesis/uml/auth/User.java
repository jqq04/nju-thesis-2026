package nju.thesis.uml.auth;

import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class User {
  private final Ids.UserId id;
  private String displayName;

  public User(Ids.UserId id, String displayName) {
    this.id = Objects.requireNonNull(id);
    this.displayName = Objects.requireNonNull(displayName);
  }

  public Ids.UserId getId() {
    return id;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = Objects.requireNonNull(displayName);
  }
}

