package gym.buddy.main;

import java.util.Timer;
import java.util.TimerTask;

public class RestTimer {
	
    private int interval;
    private Timer timer;
    
    //Allows the user to set a desired time period
    public void setTime(int time){
    	this.interval = time;
    }
    
    //Starts the timer
    public void startTimer(){
        int delay = 1000;
        int period = 1000;
        this.timer = new Timer();
        this.timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                System.out.println(setInterval());
            }
        }, delay, period);
    }//end of startTimer
    
    //Counts the timer down
    private final int setInterval() {
        if (this.interval == 1)
            this.timer.cancel();
        return --this.interval;
    }//end of setInterval
}//end of RestTimer class
