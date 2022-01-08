import java.util.Scanner;

import static java.lang.System.exit;

public class Source {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, num;
        String name;
        System.out.println("Enter selection\n1.Passengers Details\n2.Ticket Details\n3.Flight Details\n4.Exit");
        n = sc.nextInt();
        while(true) {
            switch (n) {
                case 1:

                            Passengers p = new Passengers();
                            int n1 = Passengers.getPassengerCount();
                            System.out.println("Count is " + n1);
                    break;

                case 2:
                    System.out.println("Ticket Details\nEnter ticket class\n1.Toursit\n2.Regular");
                    num = sc.nextInt();
                    switch (num) {
                        case 1:
                            Tourist t = new Tourist();
                            t.ticketdetails();
                            t.touristLocation();
                            break;
                        case 2:
                            Regular r = new Regular();
                            r.ticketdetails();
                            r.serviceAvailed();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Check flight available");
                    Flight f = new Flight();
                    System.out.println("Enter flight name");
                    String airlanename = sc.next();
                    f.getflightavailable(airlanename);
                    break;


                case 4:
                    exit(0);

            }
        }
    }
}

