package HotelWorldClocks;

/**
 * @author greenxiaye2
 */
public  class CityClock extends Clock{
    private int utcZeroTime;
    private String utcZeroMinTime;

    public CityClock(int utcOffset){
        super.utcOffset=utcOffset;
    }
    @Override
    public int getTime(){
        return (super.utcOffset+this.utcZeroTime+24)%24;
    }

    @Override
    public String getMin(){
        return this.utcZeroMinTime;
    }
    void setUtcZeroTime(int utcZeroTime){
        this.utcZeroTime=utcZeroTime;
    }
    void setUtcZeroMinTime(String utcZeroMinTime){
        this.utcZeroMinTime=utcZeroMinTime;
    }
}

