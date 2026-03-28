package nju.thesis.uml.ca;

import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class Citation {
  private final Ids.SliceId sliceId;
  private final Ids.ContentId contentId;
  private final SlicePosition position;

  public Citation(Ids.SliceId sliceId, Ids.ContentId contentId, SlicePosition position) {
    this.sliceId = Objects.requireNonNull(sliceId);
    this.contentId = Objects.requireNonNull(contentId);
    this.position = position;
  }

  public Ids.SliceId getSliceId() {
    return sliceId;
  }

  public Ids.ContentId getContentId() {
    return contentId;
  }

  public SlicePosition getPosition() {
    return position;
  }
}

