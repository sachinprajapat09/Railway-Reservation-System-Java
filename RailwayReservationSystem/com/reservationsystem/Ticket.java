package com.reservationsystem;

public class Ticket {
    
  private int ticketId;
    private int trainNumber;
    private String passengerName;
    private int seatNumber;
    private String status; 

      public Ticket(int ticketId, int trainNumber ,String passengerName,int seatNumber,String status){
        this.ticketId= ticketId;
        this.trainNumber=trainNumber;
        this.passengerName=passengerName;
        this.seatNumber=seatNumber;
        this.status=status;

      }

       public int  getTicketId(){
        return ticketId;

       }

        public int getTrainNumber(){
            return trainNumber;

        }

         public String getPassengerName(){
            return passengerName;

         }

          public int getSeatNumber(){
            return seatNumber;

          }
          public String getStatus(){
            return status;
          }


      public String toString(){
        return  "Ticket ID: " + ticketId +
               ", Train No: " + trainNumber +
               ", Passenger: " + passengerName +
               ", Seat No: " + seatNumber +
               ", Status: " + status;
      }     


 }

