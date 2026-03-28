package nju.thesis.uml.cm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class CoursePayload implements ContentPayload {
  private final List<CourseLesson> lessons = new ArrayList<>();

  public List<CourseLesson> getLessons() {
    return Collections.unmodifiableList(lessons);
  }

  public void addLesson(CourseLesson lesson) {
    lessons.add(Objects.requireNonNull(lesson));
  }
}

