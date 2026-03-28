package nju.thesis.uml.cm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class Content {
  private final Ids.ContentId id;
  private final Ids.SpaceId spaceId;
  private final Ids.AppId appId;
  private Enums.ContentType type;
  private String title;
  private String summary;
  private Enums.ContentStatus status;
  private Ids.CategoryId categoryId;
  private final List<Ids.TagId> tagIds = new ArrayList<>();
  private ContentPayload draftPayload;
  private ContentVersion publishedVersion;

  public Content(
      Ids.ContentId id,
      Ids.SpaceId spaceId,
      Ids.AppId appId,
      Enums.ContentType type,
      String title,
      String summary,
      ContentPayload draftPayload) {
    this.id = Objects.requireNonNull(id);
    this.spaceId = Objects.requireNonNull(spaceId);
    this.appId = Objects.requireNonNull(appId);
    this.type = Objects.requireNonNull(type);
    this.title = Objects.requireNonNull(title);
    this.summary = Objects.requireNonNull(summary);
    this.draftPayload = Objects.requireNonNull(draftPayload);
    this.status = Enums.ContentStatus.DRAFT;
  }

  public Ids.ContentId getId() {
    return id;
  }

  public Ids.SpaceId getSpaceId() {
    return spaceId;
  }

  public Ids.AppId getAppId() {
    return appId;
  }

  public Enums.ContentType getType() {
    return type;
  }

  public void setType(Enums.ContentType type) {
    this.type = Objects.requireNonNull(type);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = Objects.requireNonNull(title);
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = Objects.requireNonNull(summary);
  }

  public Enums.ContentStatus getStatus() {
    return status;
  }

  public Optional<Ids.CategoryId> getCategoryId() {
    return Optional.ofNullable(categoryId);
  }

  public void setCategoryId(Ids.CategoryId categoryId) {
    this.categoryId = categoryId;
  }

  public List<Ids.TagId> getTagIds() {
    return Collections.unmodifiableList(tagIds);
  }

  public void addTagId(Ids.TagId tagId) {
    tagIds.add(Objects.requireNonNull(tagId));
  }

  public ContentPayload getDraftPayload() {
    return draftPayload;
  }

  public void updateDraft(ContentPayload draftPayload) {
    this.draftPayload = Objects.requireNonNull(draftPayload);
    this.status = Enums.ContentStatus.DRAFT;
  }

  public Optional<ContentVersion> getPublishedVersion() {
    return Optional.ofNullable(publishedVersion);
  }

  public void markInReview() {
    this.status = Enums.ContentStatus.IN_REVIEW;
  }

  public void publish(ContentVersion publishedVersion) {
    this.publishedVersion = Objects.requireNonNull(publishedVersion);
    this.status = Enums.ContentStatus.PUBLISHED;
  }

  public void offline() {
    this.status = Enums.ContentStatus.OFFLINE;
  }
}

