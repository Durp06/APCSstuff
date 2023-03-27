
public class Clock {

    public Clock(){}

    public int getHours(){
        String time =  java.time.LocalTime.now().toString();
        int hours = Integer.parseInt(time.substring(0, 2));
        if(hours>12){
            hours = 12;
        }
        return hours;
    }

    public int getMinutes(){
        String time =  java.time.LocalTime.now().toString();
        return Integer.parseInt(time.substring(3, 5));

    }

    public boolean isWrapped(){
        String time = java.time.LocalTime.now().toString();
        boolean wrap = false;
        int hours = Integer.parseInt(time.substring(0, 2));
        if(hours>12){   
            wrap=true;
        }
        return wrap;
    }

    public String getTime(){
        String morn = "";
        if (isWrapped()){
            morn = "am";
        }
        else if (!isWrapped()){
            morn = "pm";
        }
        return "It is " + getHours() + ":" + getMinutes() + morn;
    }
}
