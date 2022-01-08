import java.util.Scanner;

abstract class Ticket {
    Scanner sc=new Scanner(System.in);
    public long PNR;
    public  String departtime;
    public String destination;
    public String flightname;
    public String date;
    public String time;
    boolean isstatus;

    Ticket()
    {
    PNR=123456;
    departtime="8 A.M";
    destination="Mumbai";
    flightname="Air";
    date="12/12/2021";
    time="7 A.M";
    isstatus=true;
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


