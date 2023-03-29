public class WorldClock extends Clock{
    int timeZone = 0;
    String place = "";

    public WorldClock(int timeZone, String place){
        this.timeZone = timeZone;
        this.place = place;
    }

    public int getHours(){
        String time = Integer.parseInt(super.getHours())+timeZone;
        return time;
    }

    public String getPlace(){
        return place;
    }

    public String getTime(){
        String time = getHours() + ":" + super.getMinutes() + " in " + place;
        return time;
    }
}