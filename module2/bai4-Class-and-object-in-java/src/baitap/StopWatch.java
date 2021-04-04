package baitap;

import java.util.concurrent.TimeUnit;

public class StopWatch {
    long startTime;
    long ends;
    public StopWatch(long startTime,long ends){
        this.startTime=startTime;
        this.ends=ends;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEnds() {
        return ends;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEnds(long ends) {
        this.ends = ends;
    }

    public static StopWatch start() {
        return new StopWatch();
    }

    private StopWatch() {
        reset();
    }

    public StopWatch reset() {
        startTime = System.currentTimeMillis();
        return this;
    }

    public long time() {
         ends = System.currentTimeMillis();
        return ends - startTime;
    }
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        System.out.println(stopWatch.time());
    }
}
