package Day10_13.Ex04_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TimeZone;

/**
 *  LocalDate
 *  LocalTime
 *  LocalDateTime
 *  ZonedDateTime
 */
public class ZonedDateTimeEx {

	public static void main(String[] args) {
		// LocalDate		: 날짜를 다루는 클래스
		System.out.println("[LocalDate]");
		LocalDate nowDate = LocalDate.now();
		System.out.println("현재 날짜 : " + nowDate);
		
		LocalDate endDate = LocalDate.of(2025, 2, 10);
		System.out.println("종료 날짜 : " + endDate);
		
		// LocalTime		: 시간을 다루는 클래스
		System.out.println("[LocalTime]");
		LocalTime nowTime = LocalTime.now();
		System.out.println("현재 시간 : " + nowTime);
		
		LocalTime endTime = LocalTime.of(18, 20, 0);
		System.out.println("종료 시간 : " + endTime);
		
		// LocalDateTime	: 날짜/시간을 다루는 클래스
		System.out.println("[LocalDateTime]");
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println("현재 날짜/시간 : " + nowDateTime);
		
		LocalDateTime endDateTime = LocalDateTime.of(endDate, endTime);
								 // LocalDateTime.of(2025,2,10,18,20,0);
		System.out.println("종료 날짜/시간 : " + endDateTime);
		
		// ZonedDateTime
		// : 타임존을 포함하여 날짜/시간을 다루는 클래스
		// * 타임존(TimeZone) : 전세계 특정 지역이 사용하는 표준 시간
		// * 협정 세계시와 타임존 
		// UTC : 협정 세계시 - 국제 표준시
		// 서울	: Asia/Seoul
		// 뉴욕	: America/New_York
		// 일본 	: Japan
		// 로마 	: Europe/Rome
		System.out.println("[ZonedDateTime]");
		
		ZonedDateTime utcDateTime = ZonedDateTime.now( ZoneId.of("UTC") );
		System.out.println("협정 세계시 : " + utcDateTime);
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now( ZoneId.of("Asia/Seoul") );
		System.out.println("서울 표준시 : " + seoulDateTime );
		
		ZonedDateTime newYorkDateTime = ZonedDateTime.now( ZoneId.of("America/New_York") );
		System.out.println("뉴욕 표준시: " + newYorkDateTime );
		
		ZonedDateTime japanDateTime = ZonedDateTime.now( ZoneId.of("Japan") );
		System.out.println("일본 표준시: " + japanDateTime );
		
		ZonedDateTime romeDateTime = ZonedDateTime.now( ZoneId.of("Europe/Rome") );
		System.out.println("로마 표준시: " + romeDateTime );
		
		// 윤년?
		// 1년: 365.25일이라서, 0.25x4=1일을 매 4년마다 추가해서 사용
		LocalDate ld = LocalDate.now();
		
		// LocalDate.isLeapYear() : 윤년이면 true, 아니면 false 를 반환하는 메소드 
		if( ld.isLeapYear() ) {
			System.out.println("올해는 윤년 : 2월 29일 까지");
		}
		else {
			System.out.println("올해는 평년 : 2월 28일 까지");
		}
		
		// 사용가능한 타임존 아이디
		String[] timeZoneId = TimeZone.getAvailableIDs();
		
		for (String zoneId : timeZoneId) {
			System.out.println(zoneId);
		}
		
	}
}










