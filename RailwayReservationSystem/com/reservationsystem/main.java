package com.reservationsystem;
 import java.util.Scanner;
public class main {
    public static void main(String[] args) {
          
         RailwayService service = new RailwayService();

         Scanner sc = new Scanner(System.in);


          System.out.println(" Entar ");
          int choise = sc.nextInt();

         switch (choise) {
            case 1:
                    service.showAllTrain();
                break;
            case 2:
                  
                System.out.println(" Entar train number ");
                int num = sc.nextInt();
                service.checkAvailability(num);
         break;

          case 3:
            System.out.println(" book ");
             System.out.println("Entar train number ");
             int tnum= sc.nextInt();
             System.out.println(" Entar your name ");
             sc.nextLine();
             String pname= sc.nextLine();
             service.bookTicket(tnum, pname);
            default:
                break;
         }
          
    }
}
