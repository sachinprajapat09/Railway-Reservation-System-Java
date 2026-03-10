package com.reservationsystem;
import java.util.HashMap;

import javax.net.ssl.SSLEngineResult.Status;
public class RailwayService {
  
    HashMap<Integer,Train >trainMap= new HashMap<>();
    HashMap<Integer,Ticket>ticketMap=new HashMap<>();
      
        private int ticketCounter= 1001;

         public RailwayService() {
            trainMap.put(101, new Train(101, "Rajdhani Express", 120, 5));
            trainMap.put(102,new Train(102, "hatabdi Express", 120, 50) );
            trainMap.put(103,new Train(103, "Sachin", 120, 50));
         }
            //  Train view 
         public void showAllTrain(){
            System.out.println("All  Train  ");
            for(Train  t : trainMap.values()){
               System.out.println(t);
            }
         }

         // check avlevel 
          
         public void checkAvailability(int trainNumber){
             Train train = trainMap.get(trainNumber);

             if(train!=null){
               System.out.println("\"Available seats in "+ train.getTrainName() + ";"+train.getAvailableSeats() );
             }else{
               System.out.println("galat number ");
             }
         }

         // tickit book 
          public void bookTicket(int trainNumber, String passejerName){
 
             Train train = trainMap.get(trainNumber);

              if(train == null){
               System.out.println("Invalid Train Number");
               return;
              }
              
              if(train.getAvailableSeats()<=0){
               System.out.println(" Seat  nhi he Sorry ");
              }

            int seat = train.getTotalSeats()-train.getAvailableSeats()+1;
              int ticketid =ticketCounter++;
                
               String statu= "BOOK";

                Ticket ticket = new Ticket(ticketid, trainNumber, passejerName, seat,statu);
                System.out.println(" BOOK Don ");
                System.out.println(ticket);

          }

          // 
      

         
         






}
