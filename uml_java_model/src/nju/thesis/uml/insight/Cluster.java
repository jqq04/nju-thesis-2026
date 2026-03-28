package nju.thesis.uml.insight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class Cluster {
  private final Ids.ClusterId id;
  private final Ids.SpaceId spaceId;
  private final Ids.AppId appId;
  private String title;
  private final List<String> queries = new ArrayList<>();
  private ClusterSummary summary;

  public Cluster(Ids.ClusterId id, Ids.SpaceId spaceId, Ids.AppId appId, String title) {
    this.id = Objects.requireNonNull(id);
    this.spaceId = Objects.requireNonNull(spaceId);
    this.appId = Objects.requireNonNull(appId);
    this.title = Objects.requireNonNull(title);
  }

  public Ids.ClusterId getId() {
    return id;
  }

  public Ids.SpaceId getSpaceId() {
    return spaceId;
  }

  public Ids.AppId getAppId() {
    return appId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = Objects.requireNonNull(title);
  }

  public List<String> getQueries() {
    return Collections.unmodifiableList(queries);
  }

  public void addQuery(String q) {
    queries.add(Objects.requireNonNull(q));
  }

  public ClusterSummary getSummary() {
    return summary;
  }

  public void setSummary(ClusterSummary summary) {
    this.summary = summary;
  }
}

