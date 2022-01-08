public class Tourist extends Ticket
{
    String address="Mina Bazaar";


    String arr[]=new String[5];
    public void  touristLocation()
    {
        System.out.println("Enter 5 desired location");
        for(int i=0;i<5;i++)
            arr[i]=sc.next();
        for(int i=0;i<5;i++)
            System.out.println(arr[i]);



    }
}