package HotelWorldClocksTest;
import java.io.IOException;
import java.util.*;
import HotelWorldClocks.CityClock;
import HotelWorldClocks.HotelWorldClockSystem;
import HotelWorldClocks.PhoneClock;
import java.lang.String;

public class HotelWorldClocksTest {
    public static void main(String[] args) throws IOException {
        String str;
        Scanner in=new Scanner(System.in);
        str=in.next();
        HotelWorldClockSystem hotelWorldClockSystem=new HotelWorldClockSystem();
        PhoneClock shanghai=new PhoneClock(8);
        CityClock london=new CityClock(0);
        CityClock japan=new CityClock(9);
        CityClock newyork=new CityClock(-5);

        hotelWorldClockSystem.has(london);
        hotelWorldClockSystem.has(japan);
        hotelWorldClockSystem.has(newyork);
        shanghai.setHotelWorldClockSystem(hotelWorldClockSystem);
        shanghai.setTime(str);
        System.out.println("The phone time is "+ shanghai.getTime()+shanghai.getSign()+shanghai.getMin());
        System.out.println("The London time is "+ london.getTime()+london.getSign()+london.getMin());
        System.out.println("The Japan time is "+ japan.getTime()+japan.getSign()+japan.getMin());
        System.out.println("The New York time is "+ newyork.getTime()+newyork.getSign()+newyork.getMin());
    }
}
