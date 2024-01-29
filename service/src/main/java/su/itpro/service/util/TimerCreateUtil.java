package su.itpro.service.util;

import java.time.LocalDateTime;
import su.itpro.common.entity.Timer;

public class TimerCreateUtil {

  private static final String DEFAULT_TIMER_PREFIX_NAME = "default-";

  private TimerCreateUtil() {
  }

  public static Timer createDefaultTimer() {
    LocalDateTime start = LocalDateTime.now();
    String name = DEFAULT_TIMER_PREFIX_NAME + start.getNano();
    return new Timer(name, LocalDateTime.now());
  }
}
