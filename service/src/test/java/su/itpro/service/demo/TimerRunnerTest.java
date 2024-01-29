package su.itpro.service.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TimerRunnerTest {

  @Test
  void getTimerName() {

    TimerRunner timerRunner = new TimerRunner();

    assertEquals("", timerRunner.getTimerName());
  }
}