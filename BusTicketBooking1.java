package sandeep1;

import java.util.Scanner;

public class BusTicketBooking1 {
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
		switch (TicketType) {
		
		case 1:totalPriceOfTickets=NormalTicket;
	    break;
		case 2:totalPriceOfTickets=StudentTicket;
		break;
		case 3:totalPriceOfTickets=seniorCitizen;
		break;
		case 4:totalPriceOfTickets=Children;
		break;
		case 5:System.out.println("invalid Ticket");
		return;
		}
		
		System.out.println("Enter how many Tickets you want :");
		int numofTicket=scan.nextInt();
		totalPriceOfTickets*=numofTicket;
		if(TicketType==3||TicketType==4) {
			double discount=0.3;
			totalPriceOfTickets*=discount;
			System.out.println("discount added ="+discount);
		}
		System.out.println("TotalPrice  :"+totalPriceOfTickets);
	    scan.close();
	}
}
