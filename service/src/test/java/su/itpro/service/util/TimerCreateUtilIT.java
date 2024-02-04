package su.itpro.service.util;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import su.itpro.common.entity.Timer;


class TimerCreateUtilIT {

  @Test
  void checkCreateDefaultTimer() {

    Timer defaultTimer = TimerCreateUtil.createDefaultTimer();

    assertNotNull(defaultTimer);
    assertTrue(defaultTimer.getName().startsWith("default-"));
    assertNotNull(defaultTimer.getTimeStart());
  }

}