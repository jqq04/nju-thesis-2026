package nju.thesis.uml.governance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class CoverageTaskItem implements GovernanceTaskItem {
  private final Ids.TaskItemId id;
  private final Ids.AppId appId;
  private final String clusterTitle;
  private final String representativeQuery;
  private final int queryCount;
  private final List<String> exampleQueries = new ArrayList<>();
  private Enums.TaskItemStatus status = Enums.TaskItemStatus.TODO;
  private Ids.UserId assigneeId;

  public CoverageTaskItem(
      Ids.TaskItemId id, Ids.AppId appId, String clusterTitle, String representativeQuery, int queryCount) {
    this.id = Objects.requireNonNull(id);
    this.appId = Objects.requireNonNull(appId);
    this.clusterTitle = Objects.requireNonNull(clusterTitle);
    this.representativeQuery = Objects.requireNonNull(representativeQuery);
    this.queryCount = queryCount;
  }

  @Override
  public Ids.TaskItemId getId() {
    return id;
  }

  public Ids.AppId getAppId() {
    return appId;
  }

  public String getClusterTitle() {
    return clusterTitle;
  }

  public String getRepresentativeQuery() {
    return representativeQuery;
  }

  public int getQueryCount() {
    return queryCount;
  }

  public List<String> getExampleQueries() {
    return Collections.unmodifiableList(exampleQueries);
  }

  public void addExampleQuery(String q) {
    exampleQueries.add(Objects.requireNonNull(q));
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

  public void markDone() {
    this.status = Enums.TaskItemStatus.DONE;
  }

  public void close() {
    this.status = Enums.TaskItemStatus.CLOSED;
  }
}

