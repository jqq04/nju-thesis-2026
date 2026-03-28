package nju.thesis.uml.insight;

import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class Session {
  private final Ids.SessionId id;
  private final Ids.SpaceId spaceId;
  private final Ids.AppId appId;

  public Session(Ids.SessionId id, Ids.SpaceId spaceId, Ids.AppId appId) {
    this.id = Objects.requireNonNull(id);
    this.spaceId = Objects.requireNonNull(spaceId);
    this.appId = Objects.requireNonNull(appId);
  }

  public Ids.SessionId getId() {
    return id;
  }

  public Ids.SpaceId getSpaceId() {
    return spaceId;
  }

  public Ids.AppId getAppId() {
    return appId;
  }
}

