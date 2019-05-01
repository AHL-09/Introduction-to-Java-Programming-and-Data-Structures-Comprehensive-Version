public class StopWatch {
    private long startTime = System.currentTimeMillis();
    private long endTime;

    public StopWatch(){
      this.endTime = this.startTime;
    }
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }

}
