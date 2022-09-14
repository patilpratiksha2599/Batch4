class BusTicket {
	int ts = 10;

	public  void bookTicket(int seat) {
		if (ts >= seat) {
			System.out.println("Seat Booked");
			ts=ts-seat;
		} else {
			System.out.println("Not Booked");
		}
	}

}

public class DemoMul extends Thread {
	static BusTicket b;
	int seat;

	public void run() {
		b.bookTicket(seat);
	}

	public static void main(String[] args) {
		b = new BusTicket();
		DemoMul d = new DemoMul();
		d.seat = 7;
		d.start();
		DemoMul d1 = new DemoMul();
		d1.seat = 5;
		d1.start();
	}
}
