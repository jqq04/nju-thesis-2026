package nju.thesis.uml.governance;

import nju.thesis.uml.common.Enums;
import nju.thesis.uml.common.Ids;

public interface GovernanceTaskItem {
  Ids.TaskItemId getId();
  Enums.TaskItemStatus getStatus();
  void assignTo(Ids.UserId userId);
}

