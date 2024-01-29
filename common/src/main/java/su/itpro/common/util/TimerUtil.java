package su.itpro.common.util;

import java.time.Duration;
import su.itpro.common.entity.Timer;

public class TimerUtil {

  private static final String ERROR_MESSAGE = "Таймер не запущен";
  private static final String START_MESSAGE = "Таймер '%s' запущен: %s";
  private static final String RESULT_MESSAGE = "Прошло секунд: %s";

  private TimerUtil() {
  }

  public static String getStatusMessage(Timer timer) {
    if (timer == null) {
      return ERROR_MESSAGE;
    }

    return (timer.getTimeStop() == null)
           ? START_MESSAGE.formatted(timer.getName(), TimeConverter.fromTime(timer.getTimeStart()))
           : RESULT_MESSAGE.formatted(
               Duration.between(timer.getTimeStart(), timer.getTimeStop()).toSeconds());
  }

}
