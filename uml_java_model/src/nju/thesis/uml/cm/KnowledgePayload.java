package nju.thesis.uml.cm;

import java.util.Objects;

public final class KnowledgePayload implements ContentPayload {
  private String body;

  public KnowledgePayload(String body) {
    this.body = Objects.requireNonNull(body);
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = Objects.requireNonNull(body);
  }
}

