package nju.thesis.uml.ca;

import java.util.Objects;
import java.util.Optional;

public final class SlicePosition {
  private final Integer paragraphIndex;
  private final String lessonId;

  public static SlicePosition paragraph(int paragraphIndex) {
    return new SlicePosition(paragraphIndex, null);
  }

  public static SlicePosition lesson(String lessonId) {
    return new SlicePosition(null, Objects.requireNonNull(lessonId));
  }

  private SlicePosition(Integer paragraphIndex, String lessonId) {
    this.paragraphIndex = paragraphIndex;
    this.lessonId = lessonId;
  }

  public Optional<Integer> getParagraphIndex() {
    return Optional.ofNullable(paragraphIndex);
  }

  public Optional<String> getLessonId() {
    return Optional.ofNullable(lessonId);
  }
}

