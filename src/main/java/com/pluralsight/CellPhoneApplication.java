package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner uKey = new Scanner(System.in);

        CellPhone gPhone1 = new CellPhone();

        System.out.println("What is your serial number? ");
        gPhone1.setSerialNumber(uKey.nextLong());
        gPhone1.setPhoneNumber(uKey.nextLine());

        System.out.println("What is your phone's model? ");
        gPhone1.setModel(uKey.nextLine());

        System.out.println("What is your carrier? ");
        gPhone1.setCarrier(uKey.nextLine());

        System.out.println("What is your phone number? ");
        gPhone1.setPhoneNumber(uKey.nextLine());

        System.out.println("Who is the owner of the phone? ");
        gPhone1.setOwner(uKey.nextLine());

        System.out.println("Serial number:"+gPhone1.getSerialNumber());
        System.out.println("Model:"+gPhone1.getModel());
        System.out.println("Carrier:"+gPhone1.getCarrier());
        System.out.println("Phone number:"+gPhone1.getPhoneNumber());
        System.out.println("Owner:"+gPhone1.getOwner());






    }
}
