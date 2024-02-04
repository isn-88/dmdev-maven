package su.itpro.common.util;

import java.time.Duration;
import lombok.experimental.UtilityClass;
import su.itpro.common.entity.Timer;

@UtilityClass
public class TimerUtil {

  private final String ERROR_MESSAGE = "Таймер не запущен";
  private final String START_MESSAGE = "Таймер '%s' запущен: %s";
  private final String RESULT_MESSAGE = "Прошло секунд: %s";


  public String getStatusMessage(Timer timer) {
    if (timer == null) {
      return ERROR_MESSAGE;
    }

    return (timer.getTimeStop() == null)
           ? START_MESSAGE.formatted(timer.getName(), TimeConverter.fromTime(timer.getTimeStart()))
           : RESULT_MESSAGE.formatted(
               Duration.between(timer.getTimeStart(), timer.getTimeStop()).toSeconds());
  }

}
