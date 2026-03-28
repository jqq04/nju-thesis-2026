package nju.thesis.uml.ca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class EvidencePack {
  private final List<Slice> slices = new ArrayList<>();

  public List<Slice> getSlices() {
    return Collections.unmodifiableList(slices);
  }

  public void addSlice(Slice slice) {
    slices.add(Objects.requireNonNull(slice));
  }
}

