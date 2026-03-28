package nju.thesis.uml.cm;

import java.time.Instant;
import java.util.Objects;
import java.util.Optional;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class ContentApproval {
  private final Ids.ApprovalId id;
  private final Ids.ContentId contentId;
  private final Ids.UserId submitterId;
  private Ids.UserId reviewerId;
  private Enums.ApprovalStatus status = Enums.ApprovalStatus.SUBMITTED;
  private String rejectReason;
  private final Instant submittedAt;
  private Instant reviewedAt;

  public ContentApproval(Ids.ApprovalId id, Ids.ContentId contentId, Ids.UserId submitterId, Instant submittedAt) {
    this.id = Objects.requireNonNull(id);
    this.contentId = Objects.requireNonNull(contentId);
    this.submitterId = Objects.requireNonNull(submitterId);
    this.submittedAt = Objects.requireNonNull(submittedAt);
  }

  public Ids.ApprovalId getId() {
    return id;
  }

  public Ids.ContentId getContentId() {
    return contentId;
  }

  public Ids.UserId getSubmitterId() {
    return submitterId;
  }

  public Optional<Ids.UserId> getReviewerId() {
    return Optional.ofNullable(reviewerId);
  }

  public Enums.ApprovalStatus getStatus() {
    return status;
  }

  public Optional<String> getRejectReason() {
    return Optional.ofNullable(rejectReason);
  }

  public Instant getSubmittedAt() {
    return submittedAt;
  }

  public Optional<Instant> getReviewedAt() {
    return Optional.ofNullable(reviewedAt);
  }

  public void approve(Ids.UserId reviewerId, Instant reviewedAt) {
    this.reviewerId = Objects.requireNonNull(reviewerId);
    this.reviewedAt = Objects.requireNonNull(reviewedAt);
    this.status = Enums.ApprovalStatus.APPROVED;
    this.rejectReason = null;
  }

  public void reject(Ids.UserId reviewerId, String reason, Instant reviewedAt) {
    this.reviewerId = Objects.requireNonNull(reviewerId);
    this.reviewedAt = Objects.requireNonNull(reviewedAt);
    this.status = Enums.ApprovalStatus.REJECTED;
    this.rejectReason = Objects.requireNonNull(reason);
  }
}

