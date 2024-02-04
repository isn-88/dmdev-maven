package su.itpro.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TimeConverter {

  private final String PATTERN = "dd.MM.yyyy HH:mm:ss";

  private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern(PATTERN);


  public String fromTime(LocalDateTime time) {
    return FORMATTER.format(time);
  }

}
