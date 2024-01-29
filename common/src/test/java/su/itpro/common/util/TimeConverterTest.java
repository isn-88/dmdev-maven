package su.itpro.common.util;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class TimeConverterTest {

  @Test
  void fromTime_correct() {
    LocalDateTime time = LocalDateTime.of(2024, 1, 10, 12, 30, 0);

    String result = TimeConverter.fromTime(time);

    assertEquals("10.01.2024 12:30:00", result);
  }
}