
public class DemoT extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		DemoT t1 = new DemoT(); // created
		DemoT t2 = new DemoT();
		t1.start();
		t2.start();

	}

}
