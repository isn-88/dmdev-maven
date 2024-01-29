package su.itpro.common.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimerUtilTest {

  @Test
  void getStatusMessage_timeIsNull() {

    assertEquals(TimerUtil.getStatusMessage(null), "Таймер не запущен");
  }
}