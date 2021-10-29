package day20passbyvaluedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date01 {

	public static void main(String[] args) {

		System.out.println(LocalDate.now()); // 2021-10-29
		System.out.println(LocalTime.now()); // 19:29:43.683503100
		System.out.println(LocalTime.ofSecondOfDay(1536)); // Date01.java
		System.out.println(LocalDateTime.now()); // 2021-10-29T19:29:43.683503100

		LocalDate currentDate = LocalDate.now();
// days manipulate
		System.out.println(currentDate);// 2021-10-29
		currentDate = currentDate.plusDays(7);
		System.out.println("The date after 7 days=> " + currentDate);// 2021-11-05
		currentDate = currentDate.minusDays(3);
		System.out.println("The date before 3 days=> " + currentDate);// 2021-11-02
// month manipulate
		System.out.println(currentDate);// 2021-11-02
		currentDate = currentDate.plusMonths(7);
		System.out.println("The after  7 months=> " + currentDate);// 2022-06-02
		currentDate = currentDate.minusMonths(3);
		System.out.println("The before 3 months=> " + currentDate);// 2022-03-02

		currentDate = currentDate.plusYears(4).minusMonths(3).plusDays(12);
		System.out.println("After the method chain=> " + currentDate);// 2025-12-14

		// System.out.println(currentDate.MAX);//+999999999-12-31
		// System.out.println(currentDate.MIN);//-999999999-01-01
		// System.out.println(currentDate.EPOCH);//+999999999-12-31

		LocalTime currentTime = LocalTime.now();
		int hour = currentTime.getHour();
		System.out.println(hour);

		// print the time 20:30
		LocalTime time = currentTime.of(20, 30);
		System.out.println(time);
		
		boolean isAfter =currentTime.isAfter(time);
		System.out.println(isAfter);


		System.out.println(currentTime.MIDNIGHT);
		
		
	}

}
