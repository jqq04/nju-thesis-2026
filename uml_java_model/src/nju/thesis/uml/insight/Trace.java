package nju.thesis.uml.insight;

import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class Trace {
  private final Ids.TraceId id;
  private final Ids.SessionId sessionId;

  public Trace(Ids.TraceId id, Ids.SessionId sessionId) {
    this.id = Objects.requireNonNull(id);
    this.sessionId = Objects.requireNonNull(sessionId);
  }

  public Ids.TraceId getId() {
    return id;
  }

  public Ids.SessionId getSessionId() {
    return sessionId;
  }
}

