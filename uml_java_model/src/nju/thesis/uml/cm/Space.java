package nju.thesis.uml.cm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import nju.thesis.uml.common.Ids;

public final class Space {
  private final Ids.SpaceId id;
  private String name;
  private final List<Application> applications = new ArrayList<>();

  public Space(Ids.SpaceId id, String name) {
    this.id = Objects.requireNonNull(id);
    this.name = Objects.requireNonNull(name);
  }

  public Ids.SpaceId getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = Objects.requireNonNull(name);
  }

  public List<Application> getApplications() {
    return Collections.unmodifiableList(applications);
  }

  public void addApplication(Application app) {
    applications.add(Objects.requireNonNull(app));
  }
}

