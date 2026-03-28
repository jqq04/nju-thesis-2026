package nju.thesis.uml.ca;

import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class RecallHit {
  private final Ids.SliceId sliceId;
  private final double score;
  private final String source;

  public RecallHit(Ids.SliceId sliceId, double score, String source) {
    this.sliceId = Objects.requireNonNull(sliceId);
    this.score = score;
    this.source = Objects.requireNonNull(source);
  }

  public Ids.SliceId getSliceId() {
    return sliceId;
  }

  public double getScore() {
    return score;
  }

  public String getSource() {
    return source;
  }
}

