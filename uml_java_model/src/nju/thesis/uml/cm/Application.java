package nju.thesis.uml.cm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public final class Application {
  private final Ids.AppId id;
  private final Ids.SpaceId spaceId;
  private String name;
  private final List<Enums.ContentType> enabledTypes = new ArrayList<>();
  private final List<Category> categories = new ArrayList<>();
  private final List<Tag> tags = new ArrayList<>();

  public Application(Ids.AppId id, Ids.SpaceId spaceId, String name) {
    this.id = Objects.requireNonNull(id);
    this.spaceId = Objects.requireNonNull(spaceId);
    this.name = Objects.requireNonNull(name);
  }

  public Ids.AppId getId() {
    return id;
  }

  public Ids.SpaceId getSpaceId() {
    return spaceId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = Objects.requireNonNull(name);
  }

  public List<Enums.ContentType> getEnabledTypes() {
    return Collections.unmodifiableList(enabledTypes);
  }

  public void enableType(Enums.ContentType type) {
    enabledTypes.add(Objects.requireNonNull(type));
  }

  public List<Category> getCategories() {
    return Collections.unmodifiableList(categories);
  }

  public void addCategory(Category category) {
    categories.add(Objects.requireNonNull(category));
  }

  public List<Tag> getTags() {
    return Collections.unmodifiableList(tags);
  }

  public void addTag(Tag tag) {
    tags.add(Objects.requireNonNull(tag));
  }
}

