package nju.thesis.uml.cm;

import java.time.Instant;
import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class ContentVersion {
  private final Ids.ContentVersionId id;
  private final Ids.ContentId contentId;
  private final int versionNo;
  private final ContentPayload payloadSnapshot;
  private final Instant createdAt;

  public ContentVersion(
      Ids.ContentVersionId id,
      Ids.ContentId contentId,
      int versionNo,
      ContentPayload payloadSnapshot,
      Instant createdAt) {
    this.id = Objects.requireNonNull(id);
    this.contentId = Objects.requireNonNull(contentId);
    this.versionNo = versionNo;
    this.payloadSnapshot = Objects.requireNonNull(payloadSnapshot);
    this.createdAt = Objects.requireNonNull(createdAt);
  }

  public Ids.ContentVersionId getId() {
    return id;
  }

  public Ids.ContentId getContentId() {
    return contentId;
  }

  public int getVersionNo() {
    return versionNo;
  }

  public ContentPayload getPayloadSnapshot() {
    return payloadSnapshot;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }
}

