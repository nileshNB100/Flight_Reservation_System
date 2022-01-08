import java.util.Scanner;

public class Regular extends Ticket
{
    Scanner sc=new Scanner(System.in);
    String food;
    String water;
    String snacks;
    public void serviceAvailed()
    {
        System.out.println("Service you want to avail yes/no ?");
        String output=sc.next();
        if(output.equals("yes")) {
            System.out.println("enter food");
            food = sc.next();
            System.out.println("Enter water(bisleri/normal water/cold water)");
            water = sc.next();
            System.out.println("Enter snacks");
            snacks = sc.next();
            System.out.println("Services availed are " + food+water+snacks);
        }
        else
            System.out.println("no service is availed");
        }

    public void ticketdetails()
    {
        System.out.println("PNR " + PNR);
        System.out.println("DepartTime " + departtime);
        System.out.println("Destination " + destination);
        System.out.println("FlightName " + flightname);
        System.out.println("Date " + date);
        System.out.println("Time " + time);
        System.out.println("IsStatus= " + true);

    }



}
