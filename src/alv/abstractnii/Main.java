package alv.abstractnii;

import alv.abstractnii.Check_Console.Check_consl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Check_consl check_consl = new Check_consl();
       // Scanner sc = new Scanner(System.in);
        int f = check_consl.check_int();
        System.out.println(f);
    }
}
