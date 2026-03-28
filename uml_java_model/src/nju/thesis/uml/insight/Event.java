package nju.thesis.uml.insight;

import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class Event {
  private final Enums.EventName name;
  private final Ids.SpaceId spaceId;
  private final Ids.AppId appId;
  private final Ids.SessionId sessionId;
  private final Ids.TraceId traceId;
  private final Ids.ContentId contentId;
  private final Instant timestamp;
  private final Map<String, Object> ext = new HashMap<>();

  public Event(
      Enums.EventName name,
      Ids.SpaceId spaceId,
      Ids.AppId appId,
      Ids.SessionId sessionId,
      Ids.TraceId traceId,
      Ids.ContentId contentId,
      Instant timestamp) {
    this.name = Objects.requireNonNull(name);
    this.spaceId = Objects.requireNonNull(spaceId);
    this.appId = Objects.requireNonNull(appId);
    this.sessionId = Objects.requireNonNull(sessionId);
    this.traceId = Objects.requireNonNull(traceId);
    this.contentId = contentId;
    this.timestamp = Objects.requireNonNull(timestamp);
  }

  public Enums.EventName getName() {
    return name;
  }

  public Ids.SpaceId getSpaceId() {
    return spaceId;
  }

  public Ids.AppId getAppId() {
    return appId;
  }

  public Ids.SessionId getSessionId() {
    return sessionId;
  }

  public Ids.TraceId getTraceId() {
    return traceId;
  }

  public Ids.ContentId getContentId() {
    return contentId;
  }

  public Instant getTimestamp() {
    return timestamp;
  }

  public Map<String, Object> getExt() {
    return Collections.unmodifiableMap(ext);
  }

  public void putExt(String key, Object value) {
    ext.put(Objects.requireNonNull(key), value);
  }
}

