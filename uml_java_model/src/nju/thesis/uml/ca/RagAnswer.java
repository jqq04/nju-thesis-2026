package nju.thesis.uml.ca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class RagAnswer {
  private final String text;
  private final List<Citation> citations = new ArrayList<>();

  public RagAnswer(String text) {
    this.text = Objects.requireNonNull(text);
  }

  public String getText() {
    return text;
  }

  public List<Citation> getCitations() {
    return Collections.unmodifiableList(citations);
  }

  public void addCitation(Citation c) {
    citations.add(Objects.requireNonNull(c));
  }
}

