package su.itpro.common.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeConverter {

  private static final String PATTERN = "dd.MM.yyyy HH:mm:ss";

  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN);


  private TimeConverter() {
  }

  public static String fromTime(LocalDateTime time) {
    return formatter.format(time);
  }

}
