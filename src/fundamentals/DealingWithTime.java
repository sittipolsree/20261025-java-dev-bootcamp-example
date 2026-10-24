package fundamentals;

import util.TutorialUtil;

import java.time.*;

public class DealingWithTime {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        // 1791273600000
        Instant customTimestamp = Instant.ofEpochMilli(1791273600000L);
        System.out.println(customTimestamp);

        TutorialUtil.line();

        // now() -> Read from server timezone
        OffsetDateTime nowUtc = OffsetDateTime.now(ZoneId.of("UTC"));
        System.out.println(nowUtc);
        OffsetDateTime nowTokyo = OffsetDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(nowTokyo);
        OffsetDateTime customFromInstant = OffsetDateTime.ofInstant(
                Instant.ofEpochMilli(1791273600000L), ZoneId.of("Asia/Tokyo"));
        System.out.println(customFromInstant);

        TutorialUtil.line();

        ZonedDateTime nowUtcZoneDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(nowUtcZoneDateTime);
        ZonedDateTime nowTokyoZoneDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(nowTokyoZoneDateTime);
        ZonedDateTime customFromInstantZoneDateTime = ZonedDateTime.ofInstant(
                Instant.ofEpochMilli(1791273600000L), ZoneId.of("Asia/Tokyo"));
        System.out.println(customFromInstantZoneDateTime);

        TutorialUtil.line();
        // It can split to date or time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());
    }
}
