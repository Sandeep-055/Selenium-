package sandeep1;

import java.util.Scanner;

public class BusTicketBooking {
	 private static int NormalTicket=10;
	 private static int StudentTicket=8;
	 private static int seniorCitizen=9;
	 private static int Children=5;

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Wellcome!TSRTC Online BusTicket Booking Center");
		//What are related in bus ticket
		System.out.println("Enter passangers Number");
		System.out.println("1.Normal Ticket ="+NormalTicket);
		System.out.println("2.Student Ticket ="+StudentTicket);
		System.out.println("3.senior Citizens ="+seniorCitizen);
		System.out.println("4.Children ="+Children);
		System.out.println("Enter Ticket Type(1-4) =");
		int TicketType=scan.nextInt();
		double totalPriceOfTickets=0.0;
		if(TicketType==1) {
			totalPriceOfTickets=NormalTicket;
		}else if(TicketType==2) {
			totalPriceOfTickets=StudentTicket;
		}else if(TicketType==3) {
			totalPriceOfTickets=seniorCitizen;
		}else if(TicketType==4) {
			totalPriceOfTickets=Children;
		}else {
			System.out.println("invalid Ticket");
			return;
		}
		System.out.println("Enter how many Tickets you want :");
		int numofTicket=scan.nextInt();
		totalPriceOfTickets*=numofTicket;
		System.out.println("TotalPrice  :"+totalPriceOfTickets);
	    scan.close();
	}

}
