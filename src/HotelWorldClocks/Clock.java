package HotelWorldClocks;

/**
 * @author greenxiaye2
 */
public abstract class Clock {
    int utcOffset;
     public abstract int getTime();
     public char getSign(){
        return ':';
    }
     public abstract String getMin();
}
