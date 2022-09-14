class Ticket {
	int totalSeats = 5;

	public synchronized void bookTicket(int seats) {

		if (totalSeats >= seats) {
			System.out.println("Seats Booked");
			totalSeats = totalSeats - seats;
		} else {
			System.out.println("Not Booked");
		}

	}
}

public class BookBusTicket extends Thread {

	static Ticket t;
	int seats;

	public void run() {
		t.bookTicket(seats);
	}

	public static void main(String[] args) {

		t = new Ticket();

		BookBusTicket bbt = new BookBusTicket();
		bbt.seats = 4;
		bbt.start();
		BookBusTicket bbt1 = new BookBusTicket();
		bbt1.seats = 3;
		bbt1.start();
		BookBusTicket bbt2 = new BookBusTicket();
		bbt2.seats = 2;
		bbt2.start();
	}

}
