package nju.thesis.uml.cm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class FaqPayload implements ContentPayload {
  private String question;
  private String answer;
  private final List<String> similarQuestions = new ArrayList<>();

  public FaqPayload(String question, String answer) {
    this.question = Objects.requireNonNull(question);
    this.answer = Objects.requireNonNull(answer);
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = Objects.requireNonNull(question);
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = Objects.requireNonNull(answer);
  }

  public List<String> getSimilarQuestions() {
    return Collections.unmodifiableList(similarQuestions);
  }

  public void addSimilarQuestion(String q) {
    similarQuestions.add(Objects.requireNonNull(q));
  }
}

