package nju.thesis.uml.governance;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class GovernanceMainTask {
  private final Ids.MainTaskId id;
  private final Ids.SpaceId spaceId;
  private final Enums.GovernanceTaskType type;
  private Enums.MainTaskStatus status = Enums.MainTaskStatus.NEW;
  private final Instant createdAt;
  private final List<GovernanceTaskItem> items = new ArrayList<>();

  public GovernanceMainTask(
      Ids.MainTaskId id, Ids.SpaceId spaceId, Enums.GovernanceTaskType type, Instant createdAt) {
    this.id = Objects.requireNonNull(id);
    this.spaceId = Objects.requireNonNull(spaceId);
    this.type = Objects.requireNonNull(type);
    this.createdAt = Objects.requireNonNull(createdAt);
  }

  public Ids.MainTaskId getId() {
    return id;
  }

  public Ids.SpaceId getSpaceId() {
    return spaceId;
  }

  public Enums.GovernanceTaskType getType() {
    return type;
  }

  public Enums.MainTaskStatus getStatus() {
    return status;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public List<GovernanceTaskItem> getItems() {
    return Collections.unmodifiableList(items);
  }

  public void addItem(GovernanceTaskItem item) {
    items.add(Objects.requireNonNull(item));
  }

  public void start() {
    this.status = Enums.MainTaskStatus.RUNNING;
  }

  public void finish() {
    this.status = Enums.MainTaskStatus.FINISHED;
  }
}

