/*Program Name:MyDate.java
 * Authors: Austin P
 * Date last Updated: 8/26/2024
 * Purpose: This program is meant to take a long value in milliseconds and convert it into a date.
 */

import java.util.Calendar;

public class MyDate {
  // design the MyDate class the data fields are year, month, and day. Month is
  // 0-based, so 0 is January.
  private int year;
  private int month;
  private int day;

  // No-arg constructor that creates a MyDate object for the current date.
  public MyDate() {
    Calendar calendar = Calendar.getInstance();
    this.year = calendar.get(Calendar.YEAR);
    this.month = calendar.get(Calendar.MONTH); // Month is 0-based
    this.day = calendar.get(Calendar.DAY_OF_MONTH);
  }

  // A constructor that constructs a MyDate object with a specified elapsed time
  // since midnight, January 1, 1970 in miliseconds.
  public MyDate(long elapsedTime) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(elapsedTime);
    this.year = calendar.get(Calendar.YEAR);
    this.month = calendar.get(Calendar.MONTH);
    this.day = calendar.get(Calendar.DAY_OF_MONTH);
  }

  // A constructor that constructs a MyDate object with the specified year, month,
  // and day.
  public MyDate(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  // Three getter methods for the data fields year, month, and day, respectively.
  public int getYear() {
    return year;
  }

  public int getMonth() {
    return month;
  }

  public int getDay() {
    return day;
  }

  // A method named setDate(long elapsedTime) that sets a new date for the object
  // using the elapsed time.
  public void setDate(long elapsedTime) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(elapsedTime);
    this.year = calendar.get(Calendar.YEAR);
    this.month = calendar.get(Calendar.MONTH);
    this.day = calendar.get(Calendar.DAY_OF_MONTH);
  }

  public static void main(String[] args) {
    // The first two constructors will extract the year, month, and day, from the
    // elpased time. For example if the elapsed time is 561555550000, the year is
    // 1987, the month is 9, and the day is 15.
    MyDate date1 = new MyDate();
    MyDate date2 = new MyDate(561555550000L);
    MyDate date3 = new MyDate(1987, 9, 15);
    // The setDate method will set the date to the given elapsed time.

    date1.setDate(561555550000L);

    System.out.println("Date 1: " + date1.getYear() + "-" + (date1.getMonth() + 1) + "-" + date1.getDay());
    System.out.println("Date 2: " + date2.getYear() + "-" + (date2.getMonth() + 1) + "-" + date2.getDay());
    System.out.println("Date 3: " + date3.getYear() + "-" + (date3.getMonth() + 1) + "-" + date3.getDay());

  }

}