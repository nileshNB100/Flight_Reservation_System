import java.util.Scanner;

public class Passengers extends Address{
    Scanner sc=new Scanner(System.in);
    public String name;
    public int pid;
    private static int idCounter=0;
    public Passengers()
    {
        System.out.println("Enter Name");
        this.name=sc.next();
        this.phoneno=sc.nextInt();
        this.city=sc.next();
        idCounter++;
        this.pid=idCounter;
        DbManager.PP.add(this);

    }

    public static int getPassengerCount()
    {
        return idCounter;
    }
    public static void showPassengers()
    {
       for(int i=0;i<DbManager.PP.stream().count();i++)
        System.out.println(DbManager.PP.get(i).name);
    }



}


