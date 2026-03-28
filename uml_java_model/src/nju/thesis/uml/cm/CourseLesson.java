package nju.thesis.uml.cm;

import java.util.Objects;

public final class CourseLesson {
  private final String lessonId;
  private String title;
  private String content;

  public CourseLesson(String lessonId, String title, String content) {
    this.lessonId = Objects.requireNonNull(lessonId);
    this.title = Objects.requireNonNull(title);
    this.content = Objects.requireNonNull(content);
  }

  public String getLessonId() {
    return lessonId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = Objects.requireNonNull(title);
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = Objects.requireNonNull(content);
  }
}

