import java.time.ZonedDateTime;

/**
 * @ClassName: Time
 * @Description
 * @Author:我自己
 * @Date: 2022/7/22  13:02
 * @Version 1.0
 */
public class Time {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now = " + now);
    }
}
