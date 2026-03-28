package nju.thesis.uml.cm;

import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class Tag {
  private final Ids.TagId id;
  private final Ids.AppId appId;
  private String name;
  private boolean enabled = true;

  public Tag(Ids.TagId id, Ids.AppId appId, String name) {
    this.id = Objects.requireNonNull(id);
    this.appId = Objects.requireNonNull(appId);
    this.name = Objects.requireNonNull(name);
  }

  public Ids.TagId getId() {
    return id;
  }

  public Ids.AppId getAppId() {
    return appId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = Objects.requireNonNull(name);
  }

  public boolean isEnabled() {
    return enabled;
  }

  public void disable() {
    this.enabled = false;
  }

  public void enable() {
    this.enabled = true;
  }
}

