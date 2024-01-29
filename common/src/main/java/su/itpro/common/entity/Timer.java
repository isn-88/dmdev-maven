package su.itpro.common.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Timer {

  private final String name;
  private final LocalDateTime timeStart;
  private LocalDateTime timeStop;


  public Timer(String name) {
    this(name, LocalDateTime.now());
  }

  public Timer(String name, LocalDateTime timeStart) {
    this.name = name;
    this.timeStart = timeStart;
  }

  public String getName() {
    return name;
  }

  public LocalDateTime getTimeStart() {
    return timeStart;
  }

  public LocalDateTime getTimeStop() {
    return timeStop;
  }

  public void setTimeStop(LocalDateTime timeStop) {
    this.timeStop = timeStop;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Timer timer = (Timer) o;
    return Objects.equals(timeStart, timer.timeStart) &&
           Objects.equals(timeStop, timer.timeStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeStart, timeStop);
  }

  @Override
  public String toString() {
    return "Timer{" +
           "timeStart=" + timeStart +
           ", timeStop=" + timeStop +
           '}';
  }
}
