package nju.thesis.uml.governance;

import java.util.Objects;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class DupAmbTaskItem implements GovernanceTaskItem {
  private final Ids.TaskItemId id;
  private final Ids.AppId appId;
  private final Ids.ContentId left;
  private final Ids.ContentId right;
  private Enums.TaskItemStatus status = Enums.TaskItemStatus.TODO;
  private Ids.UserId assigneeId;
  private String result;

  public DupAmbTaskItem(Ids.TaskItemId id, Ids.AppId appId, Ids.ContentId left, Ids.ContentId right) {
    this.id = Objects.requireNonNull(id);
    this.appId = Objects.requireNonNull(appId);
    this.left = Objects.requireNonNull(left);
    this.right = Objects.requireNonNull(right);
  }

  @Override
  public Ids.TaskItemId getId() {
    return id;
  }

  public Ids.AppId getAppId() {
    return appId;
  }

  public Ids.ContentId getLeft() {
    return left;
  }

  public Ids.ContentId getRight() {
    return right;
  }

  @Override
  public Enums.TaskItemStatus getStatus() {
    return status;
  }

  @Override
  public void assignTo(Ids.UserId userId) {
    this.assigneeId = Objects.requireNonNull(userId);
    this.status = Enums.TaskItemStatus.DOING;
  }

  public void markDone(String result) {
    this.result = Objects.requireNonNull(result);
    this.status = Enums.TaskItemStatus.DONE;
  }

  public void close() {
    this.status = Enums.TaskItemStatus.CLOSED;
  }
}

