package nju.thesis.uml.common;

public final class Enums {
  private Enums() {}

  public enum ContentType {
    KNOWLEDGE,
    FAQ,
    COURSE,
    CASE
  }

  public enum ContentStatus {
    DRAFT,
    IN_REVIEW,
    PUBLISHED,
    OFFLINE
  }

  public enum ApprovalStatus {
    SUBMITTED,
    APPROVED,
    REJECTED,
    CANCELED
  }

  public enum ScopeType {
    GLOBAL,
    SPACE,
    APP
  }

  public enum AuthAction {
    READ,
    WRITE,
    ADMIN
  }

  public enum AuthTactic {
    PUBLIC,
    EXTERNAL_LOGIN,
    INTERNAL,
    EMPLOYEE_MATCH,
    DEPARTMENT_MATCH,
    ROLE_MATCH,
    EXPRESSION
  }

  public enum GovernanceTaskType {
    DUPLICATION,
    AMBIGUITY,
    COVERAGE
  }

  public enum MainTaskStatus {
    NEW,
    RUNNING,
    FINISHED
  }

  public enum TaskItemStatus {
    TODO,
    DOING,
    DONE,
    CLOSED
  }

  public enum EventName {
    PAGE_VIEW,
    CLICK,
    QUERY_SUBMIT,
    RAG_RECALL,
    LLM_GENERATE,
    HANDOFF_INTENT,
    HANDOFF_SUCCESS
  }
}

