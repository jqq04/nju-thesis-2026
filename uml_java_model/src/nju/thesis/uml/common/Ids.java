package nju.thesis.uml.common;

import java.util.Objects;

public final class Ids {
  private Ids() {}

  public static final class SpaceId {
    private final long value;

    public SpaceId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      SpaceId spaceId = (SpaceId) o;
      return value == spaceId.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "SpaceId(" + value + ")";
    }
  }

  public static final class AppId {
    private final long value;

    public AppId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      AppId appId = (AppId) o;
      return value == appId.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "AppId(" + value + ")";
    }
  }

  public static final class CategoryId {
    private final long value;

    public CategoryId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      CategoryId that = (CategoryId) o;
      return value == that.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "CategoryId(" + value + ")";
    }
  }

  public static final class TagId {
    private final long value;

    public TagId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      TagId tagId = (TagId) o;
      return value == tagId.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "TagId(" + value + ")";
    }
  }

  public static final class ContentId {
    private final long value;

    public ContentId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ContentId that = (ContentId) o;
      return value == that.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "ContentId(" + value + ")";
    }
  }

  public static final class ContentVersionId {
    private final long value;

    public ContentVersionId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ContentVersionId that = (ContentVersionId) o;
      return value == that.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "ContentVersionId(" + value + ")";
    }
  }

  public static final class ApprovalId {
    private final long value;

    public ApprovalId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ApprovalId that = (ApprovalId) o;
      return value == that.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "ApprovalId(" + value + ")";
    }
  }

  public static final class UserId {
    private final long value;

    public UserId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      UserId userId = (UserId) o;
      return value == userId.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "UserId(" + value + ")";
    }
  }

  public static final class RoleId {
    private final long value;

    public RoleId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      RoleId roleId = (RoleId) o;
      return value == roleId.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "RoleId(" + value + ")";
    }
  }

  public static final class PermissionId {
    private final long value;

    public PermissionId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      PermissionId that = (PermissionId) o;
      return value == that.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "PermissionId(" + value + ")";
    }
  }

  public static final class SliceId {
    private final String value;

    public SliceId(String value) {
      this.value = Objects.requireNonNull(value);
    }

    public String getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      SliceId sliceId = (SliceId) o;
      return value.equals(sliceId.value);
    }

    @Override
    public int hashCode() {
      return value.hashCode();
    }

    @Override
    public String toString() {
      return "SliceId(" + value + ")";
    }
  }

  public static final class SessionId {
    private final String value;

    public SessionId(String value) {
      this.value = Objects.requireNonNull(value);
    }

    public String getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      SessionId that = (SessionId) o;
      return value.equals(that.value);
    }

    @Override
    public int hashCode() {
      return value.hashCode();
    }

    @Override
    public String toString() {
      return "SessionId(" + value + ")";
    }
  }

  public static final class TraceId {
    private final String value;

    public TraceId(String value) {
      this.value = Objects.requireNonNull(value);
    }

    public String getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      TraceId that = (TraceId) o;
      return value.equals(that.value);
    }

    @Override
    public int hashCode() {
      return value.hashCode();
    }

    @Override
    public String toString() {
      return "TraceId(" + value + ")";
    }
  }

  public static final class ClusterId {
    private final String value;

    public ClusterId(String value) {
      this.value = Objects.requireNonNull(value);
    }

    public String getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ClusterId that = (ClusterId) o;
      return value.equals(that.value);
    }

    @Override
    public int hashCode() {
      return value.hashCode();
    }

    @Override
    public String toString() {
      return "ClusterId(" + value + ")";
    }
  }

  public static final class MainTaskId {
    private final long value;

    public MainTaskId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      MainTaskId that = (MainTaskId) o;
      return value == that.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "MainTaskId(" + value + ")";
    }
  }

  public static final class TaskItemId {
    private final long value;

    public TaskItemId(long value) {
      this.value = value;
    }

    public long getValue() {
      return value;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      TaskItemId that = (TaskItemId) o;
      return value == that.value;
    }

    @Override
    public int hashCode() {
      return Long.hashCode(value);
    }

    @Override
    public String toString() {
      return "TaskItemId(" + value + ")";
    }
  }
}
