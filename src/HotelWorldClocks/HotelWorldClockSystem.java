package HotelWorldClocks;

import java.util.ArrayList;

/**
 * @author greenxiaye2
 */
public class HotelWorldClockSystem {
    private ArrayList<CityClock>cityClockList=new ArrayList<>();
    public void has(CityClock cityclock){
        this.cityClockList.add(cityclock);
    }
    ArrayList<CityClock>getClocks(){
        return this.cityClockList;
    }

}

