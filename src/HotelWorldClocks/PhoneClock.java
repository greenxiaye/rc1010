package HotelWorldClocks;

/**
 * @author greenxiaye2
 */
public class PhoneClock extends Clock {
    private HotelWorldClockSystem hotelWorldClockSystem;
    public void setHotelWorldClockSystem(HotelWorldClockSystem hotelWorldClockSystem){
        this.hotelWorldClockSystem=hotelWorldClockSystem;
    }
     private int time;
    private String min;

     public PhoneClock(int utcOffset){
         super.utcOffset=utcOffset;
     }
     public void setTime(String str){

         int a;
         String b,c=":";
         int pos=str.indexOf(":");
         if(pos==1){
             a=str.charAt(0)-'0';
             b=str.substring(2,4);
         }
         else{
             a=(str.charAt(0)-'0')*10+str.charAt(1)-'0';
             b=str.substring(3,5);
         }
         this.time=a;

         this.min=b;
          for (CityClock cityclock:this.hotelWorldClockSystem.getClocks()){
              cityclock.setUtcZeroTime(time-utcOffset);
              cityclock.setUtcZeroMinTime(min);
          }
     }
     @Override
     public int getTime(){
         return  this.time;
     }

     @Override
     public String getMin(){
         return this.min;
     }
}
