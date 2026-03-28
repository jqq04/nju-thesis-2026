package nju.thesis.uml.auth;

import java.util.Objects;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class ContentAuthRule {
  private final Ids.ContentId contentId;
  private final Enums.AuthAction action;
  private final Enums.AuthTactic tactic;
  private final String variable;

  public ContentAuthRule(Ids.ContentId contentId, Enums.AuthAction action, Enums.AuthTactic tactic, String variable) {
    this.contentId = Objects.requireNonNull(contentId);
    this.action = Objects.requireNonNull(action);
    this.tactic = Objects.requireNonNull(tactic);
    this.variable = variable;
  }

  public Ids.ContentId getContentId() {
    return contentId;
  }

  public Enums.AuthAction getAction() {
    return action;
  }

  public Enums.AuthTactic getTactic() {
    return tactic;
  }

  public String getVariable() {
    return variable;
  }
}

