package nju.thesis.uml.ca;

import java.util.Objects;

public final class QueryRewriteResult {
  private final String original;
  private final String rewritten;
  private final String object;
  private final String scenario;
  private final String intent;

  public QueryRewriteResult(String original, String rewritten, String object, String scenario, String intent) {
    this.original = Objects.requireNonNull(original);
    this.rewritten = Objects.requireNonNull(rewritten);
    this.object = Objects.requireNonNull(object);
    this.scenario = Objects.requireNonNull(scenario);
    this.intent = Objects.requireNonNull(intent);
  }

  public String getOriginal() {
    return original;
  }

  public String getRewritten() {
    return rewritten;
  }

  public String getObject() {
    return object;
  }

  public String getScenario() {
    return scenario;
  }

  public String getIntent() {
    return intent;
  }
}

