package nju.thesis.uml.governance;

import java.time.Instant;
import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class ForceCompleteRequest {
  private final Ids.TaskItemId taskItemId;
  private final Ids.UserId requesterId;
  private final String reason;
  private final Instant requestedAt;
  private boolean approved;

  public ForceCompleteRequest(Ids.TaskItemId taskItemId, Ids.UserId requesterId, String reason, Instant requestedAt) {
    this.taskItemId = Objects.requireNonNull(taskItemId);
    this.requesterId = Objects.requireNonNull(requesterId);
    this.reason = Objects.requireNonNull(reason);
    this.requestedAt = Objects.requireNonNull(requestedAt);
  }

  public Ids.TaskItemId getTaskItemId() {
    return taskItemId;
  }

  public Ids.UserId getRequesterId() {
    return requesterId;
  }

  public String getReason() {
    return reason;
  }

  public Instant getRequestedAt() {
    return requestedAt;
  }

  public boolean isApproved() {
    return approved;
  }

  public void approve() {
    this.approved = true;
  }
}

