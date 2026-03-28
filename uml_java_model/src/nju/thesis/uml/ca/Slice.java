package nju.thesis.uml.ca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class Slice {
  private final Ids.SliceId id;
  private final Ids.ContentId contentId;
  private final Ids.SpaceId spaceId;
  private final Ids.AppId appId;
  private final Enums.ContentType contentType;
  private final String text;
  private SlicePosition position;
  private final List<String> attachmentUrls = new ArrayList<>();

  public Slice(
      Ids.SliceId id,
      Ids.ContentId contentId,
      Ids.SpaceId spaceId,
      Ids.AppId appId,
      Enums.ContentType contentType,
      String text) {
    this.id = Objects.requireNonNull(id);
    this.contentId = Objects.requireNonNull(contentId);
    this.spaceId = Objects.requireNonNull(spaceId);
    this.appId = Objects.requireNonNull(appId);
    this.contentType = Objects.requireNonNull(contentType);
    this.text = Objects.requireNonNull(text);
  }

  public Ids.SliceId getId() {
    return id;
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

  public Enums.ContentType getContentType() {
    return contentType;
  }

  public String getText() {
    return text;
  }

  public Optional<SlicePosition> getPosition() {
    return Optional.ofNullable(position);
  }

  public void setPosition(SlicePosition position) {
    this.position = position;
  }

  public List<String> getAttachmentUrls() {
    return Collections.unmodifiableList(attachmentUrls);
  }

  public void addAttachmentUrl(String url) {
    attachmentUrls.add(Objects.requireNonNull(url));
  }
}

