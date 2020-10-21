package java8;

import java.time.*;

public class App {
    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println("instant = " + instant); // 기준시 UTC , GMT
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);
        ZonedDateTime zonedDateTime = instant.atZone(zoneId);
        System.out.println("zonedDateTime = " + zonedDateTime);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
        LocalDateTime of = LocalDateTime.of(1996, Month.AUGUST, 10, 0, 0, 0);
        ZonedDateTime nowInKorea = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println("nowInKorea = " + nowInKorea);

        Instant nowInstant = Instant.now();
        ZonedDateTime zonedDateTimed = nowInstant.atZone(ZoneId.of("Asia/Seoul"));
        System.out.println("zonedDateTimed = " + zonedDateTimed);


        //기간 비교

        /*
         * 이름이 작명이 잘 되어있지 않다.
         * Date지만 시간까지 나타낼수 있다.
         * TimeStamp를 나타낼수 있다.
         *
         * date.getTime() 하면 시간이 나온다.
         * 이 시간은 1970년 1월 1일 시간을 기준으로 한다.
         * Date객체는 mutable하다
         *
         * 멀티 쓰레드 환경에서 쓰기 어렵다는 것은
         * 쓰레드세이프티가 안되고 타입세이프티가 없다.
         *  */


    }

    /*
     * Date Calender
     *
     * */

}
