package alv.abstractnii.Check_Console;

import java.util.Scanner;

public class Check_consl {
    private int n = 0;
    private double d = 0;

    public int check_int()
    {
        Scanner number = new Scanner(System.in);
       if (number.hasNextInt()){
            n=number.nextInt();
            return n;
        }else {
            //e.printStackTrace();
            System.out.println("Error. Repeat");
            check_int();
        }
        return n;
    }

    public double check_double()
    {
        Scanner number = new Scanner(System.in);
        if (number.hasNextInt()){
            d=number.nextInt();
            return d;
        }else {
            //e.printStackTrace();
            System.out.println("Error. Repeat");
            check_double();
        }
        return d;
    }
}
