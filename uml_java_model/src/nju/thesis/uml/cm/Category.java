package nju.thesis.uml.cm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import nju.thesis.uml.common.Ids;

public final class Category {
  private final Ids.CategoryId id;
  private final Ids.AppId appId;
  private String name;
  private Ids.CategoryId parentId;
  private final List<Ids.CategoryId> children = new ArrayList<>();

  public Category(Ids.CategoryId id, Ids.AppId appId, String name) {
    this.id = Objects.requireNonNull(id);
    this.appId = Objects.requireNonNull(appId);
    this.name = Objects.requireNonNull(name);
  }

  public Ids.CategoryId getId() {
    return id;
  }

  public Ids.AppId getAppId() {
    return appId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = Objects.requireNonNull(name);
  }

  public Optional<Ids.CategoryId> getParentId() {
    return Optional.ofNullable(parentId);
  }

  public void setParentId(Ids.CategoryId parentId) {
    this.parentId = parentId;
  }

  public List<Ids.CategoryId> getChildren() {
    return Collections.unmodifiableList(children);
  }

  public void addChild(Ids.CategoryId childId) {
    children.add(Objects.requireNonNull(childId));
  }
}

