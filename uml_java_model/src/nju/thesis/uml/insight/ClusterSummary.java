package nju.thesis.uml.insight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class ClusterSummary {
  private String summary;
  private final List<String> keywords = new ArrayList<>();
  private final List<String> representativeQueries = new ArrayList<>();

  public ClusterSummary(String summary) {
    this.summary = Objects.requireNonNull(summary);
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = Objects.requireNonNull(summary);
  }

  public List<String> getKeywords() {
    return Collections.unmodifiableList(keywords);
  }

  public void addKeyword(String keyword) {
    keywords.add(Objects.requireNonNull(keyword));
  }

  public List<String> getRepresentativeQueries() {
    return Collections.unmodifiableList(representativeQueries);
  }

  public void addRepresentativeQuery(String q) {
    representativeQueries.add(Objects.requireNonNull(q));
  }
}

