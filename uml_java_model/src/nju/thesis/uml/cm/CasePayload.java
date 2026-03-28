package nju.thesis.uml.cm;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class CasePayload implements ContentPayload {
  private final Map<String, Object> detail = new HashMap<>();

  public Map<String, Object> getDetail() {
    return Collections.unmodifiableMap(detail);
  }

  public void put(String key, Object value) {
    detail.put(Objects.requireNonNull(key), value);
  }
}

