public class Flight {
 private int flightno;
 String airlanename;
  int capacity;
   int noofseatbooked;
   int availability;
    public Flight()
    {
        airlanename="Air India";
        flightno=123;
        capacity=50;
        noofseatbooked=28;
    }
    public void getflightavailable(String airlanename) {
        this.airlanename=airlanename;
        if(airlanename.equals("Air"))
        {
            if(noofseatbooked<capacity) System.out.println("Flight is availabe with seat availability "+(capacity-noofseatbooked));
            else System.out.println("Flight is available but Full (no seat available)");
        }
        else
            System.out.println("Flight is not available");


    }
}
