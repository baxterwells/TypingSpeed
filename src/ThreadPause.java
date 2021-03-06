//Java code to pause the execution of a thread
class ThreadPause {
    // method to pause the string
    // here we will pass the time in seconds
    public void pause(int sec) {
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } // end catch (InterruptedException)
    } // end wait (int)
} // end ThreadPause
