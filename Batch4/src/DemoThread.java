
public class DemoThread implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Thread");
		
	}
	public static void main(String[] args) {
		
		DemoThread d1 =new DemoThread();
		Thread t = new Thread(d1);		
		t.start();
		
		
		
	}

}
