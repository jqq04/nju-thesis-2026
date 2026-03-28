package nju.thesis.uml.governance;

import java.time.Instant;
import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class RecheckRun {
  private final Ids.MainTaskId mainTaskId;
  private final Instant startedAt;
  private Instant finishedAt;
  private int checkedCount;
  private int passedCount;

  public RecheckRun(Ids.MainTaskId mainTaskId, Instant startedAt) {
    this.mainTaskId = Objects.requireNonNull(mainTaskId);
    this.startedAt = Objects.requireNonNull(startedAt);
  }

  public Ids.MainTaskId getMainTaskId() {
    return mainTaskId;
  }

  public Instant getStartedAt() {
    return startedAt;
  }

  public Instant getFinishedAt() {
    return finishedAt;
  }

  public int getCheckedCount() {
    return checkedCount;
  }

  public int getPassedCount() {
    return passedCount;
  }

  public void recordResult(boolean passed) {
    checkedCount += 1;
    if (passed) {
      passedCount += 1;
    }
  }

  public void finish(Instant finishedAt) {
    this.finishedAt = Objects.requireNonNull(finishedAt);
  }
}

