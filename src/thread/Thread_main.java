package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread_run [] th = new Thread_run[10];
	    Thread_runnable [] th2 = new Thread_runnable[10];
	    
	    for(int i = 0; i < 10; i++) {
	    	th[i] = new Thread_run();
	    	th2[i] = new Thread_runnable();
	    	th[i].start();
	    	th2[i].run();
	    }
		
	  
		for(int i = 0; i < 10; i++) {
			System.out.println("main‚©‚ço—Í : "+i);
		}
	}

}
