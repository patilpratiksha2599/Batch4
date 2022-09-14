
public class DemoT2 extends Thread {

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("SRK");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		DemoT2 d = new DemoT2();
		d.setPriority(MAX_PRIORITY);
		d.getPriority();
		d.start();
		//d.join();
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
		for (int i = 1; i <= 10; i++) {
			System.out.println("AK");
		}

	}

}
