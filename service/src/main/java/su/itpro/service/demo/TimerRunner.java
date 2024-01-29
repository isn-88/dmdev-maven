package su.itpro.service.demo;

import java.time.LocalDateTime;
import java.util.Scanner;
import su.itpro.common.entity.Timer;
import su.itpro.common.util.TimerUtil;
import su.itpro.service.util.TimerCreateUtil;

public class TimerRunner {

  private static final String COMMAND_MESSAGE =
      "Введите 'start' для запуска, 'stop' для остановки или 'exit' для выхода";
  private static final String RESTART_MESSAGE =
      "Сначала нужно запустить таймер командой 'start'";


  private Timer timer;


  public void run() {

    System.out.println(COMMAND_MESSAGE);
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      if (!runCommand(scanner.next())) {
        break;
      }
    }
  }

  public String getTimerName() {
    if (timer != null) {
      return timer.getName();
    }
    return "";
  }

  private boolean runCommand(String command) {
    switch (command) {
      case "start" -> doStart();

      case "stop" -> doStop();

      case "exit" -> {
        return false;
      }

      default -> System.out.println(COMMAND_MESSAGE);
    }
    return true;
  }

  private void doStart() {
    timer = TimerCreateUtil.createDefaultTimer();
    System.out.println(TimerUtil.getStatusMessage(timer));
  }

  private void doStop() {
    if (timer != null && timer.getTimeStop() == null) {
      timer.setTimeStop(LocalDateTime.now());
      System.out.println(TimerUtil.getStatusMessage(timer));
    } else {
      System.out.println(RESTART_MESSAGE);
    }
  }

}
