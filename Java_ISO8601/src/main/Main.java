package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		System.out.println(LocalDate.of(2024, 6, 11).toString());
		System.out.println(LocalDateTime.of(2024, 6, 11, 12, 10, 52).toString());
		System.out.println(LocalTime.of(13, 45, 12, 670).toString());
		ZoneOffset offset = ZoneOffset.ofHours(9);
		System.out.println(offset.toString());
		System.out.println(OffsetDateTime.of(2024, 6, 11, 15, 45, 10, 130, offset).toString());
		System.out.println(OffsetTime.of(2, 38, 56, 789, offset).toString());
		ZoneId zoneId = ZoneId.of("Asia/Tokyo");
		System.out.println(ZonedDateTime.of(2024, 6, 11, 11, 34, 0, 0, zoneId).toString());

		DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(OffsetDateTime.of(2024, 6, 11, 15, 45, 10, 130, ZoneOffset.UTC).format(formatter));
	}

}
