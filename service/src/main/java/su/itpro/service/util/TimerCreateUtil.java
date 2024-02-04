package su.itpro.service.util;

import java.time.LocalDateTime;
import lombok.experimental.UtilityClass;
import su.itpro.common.entity.Timer;

@UtilityClass
public class TimerCreateUtil {

  private final String DEFAULT_TIMER_PREFIX_NAME = "default-";


  public Timer createDefaultTimer() {
    LocalDateTime start = LocalDateTime.now();
    String name = DEFAULT_TIMER_PREFIX_NAME + start.getNano();
    return new Timer(name, LocalDateTime.now());
  }
}
