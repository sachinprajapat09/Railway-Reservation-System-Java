package com.reservationsystem;

public class Train {
     
     private  int trainNumber;
     private String trainName;
     private int totalSeats;
     private int availableSeats;


         public Train(int trainNumber, String trainName,int totalSeats,int availableSeats){
            this.trainNumber= trainNumber;
            this.trainName=trainName;
            this.totalSeats= totalSeats;
            this.availableSeats=availableSeats;
         }
          public int getTrainNumber(){
             return trainNumber;
          }

          public String getTrainName(){
            return trainName;
          }

          public int getTotalSeats(){
            return totalSeats;
          }
           public int getAvailableSeats(){
            return availableSeats;

           }

            public String toString(){
            return "Train No: " + trainNumber +
           ", Name: " + trainName +
           ", Total Seats: " + totalSeats +
           ", Available Seats: " + availableSeats;
            }
            

}
