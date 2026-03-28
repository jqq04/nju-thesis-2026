package nju.thesis.uml.ca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import nju.thesis.uml.auth.ContentAuthRule;
import nju.thesis.uml.common.Ids;

public final class IndexDocument {
  private final Ids.SliceId sliceId;
  private final Ids.ContentId contentId;
  private final Ids.SpaceId spaceId;
  private final Ids.AppId appId;
  private final String text;
  private Ids.CategoryId categoryId;
  private final List<Ids.TagId> tagIds = new ArrayList<>();
  private final List<ContentAuthRule> authRules = new ArrayList<>();

  public IndexDocument(
      Ids.SliceId sliceId, Ids.ContentId contentId, Ids.SpaceId spaceId, Ids.AppId appId, String text) {
    this.sliceId = Objects.requireNonNull(sliceId);
    this.contentId = Objects.requireNonNull(contentId);
    this.spaceId = Objects.requireNonNull(spaceId);
    this.appId = Objects.requireNonNull(appId);
    this.text = Objects.requireNonNull(text);
  }

  public Ids.SliceId getSliceId() {
    return sliceId;
  }

  public Ids.ContentId getContentId() {
    return contentId;
  }

  public Ids.SpaceId getSpaceId() {
    return spaceId;
  }

  public Ids.AppId getAppId() {
    return appId;
  }

  public String getText() {
    return text;
  }

  public Ids.CategoryId getCategoryId() {
    return categoryId;
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

  public List<ContentAuthRule> getAuthRules() {
    return Collections.unmodifiableList(authRules);
  }

  public void addAuthRule(ContentAuthRule rule) {
    authRules.add(Objects.requireNonNull(rule));
  }
}

