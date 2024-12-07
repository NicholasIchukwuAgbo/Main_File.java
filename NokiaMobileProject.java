import java.util.Scanner;

  public class NokiaMobileProject{

      public static void main(String[] args){

	Scanner input = new Scanner(System.in);

 System.out.println("""   

      PHONE MENU

	1. Phone book

	2. Messages

	3. Chat

	4. Call Register

	5. Tones

	6. Settings

	7. Call Divert

	8. Games

	9. Calculate

	10. Reminder

	11. Clock

	12. Profiles

	13. SIM services

 """);


    int fromUser = input.nextInt();
 
    switch(fromUser){

 case 1: System.out.println("""

	1. Search

	2. Service Nos.

	3. Add name

	4. Erase

	5. Edit

	6. Assign tone

	7. Send b'card

	8. Options

	9. Speeds dials

	10. Voice tags

  """);
	int phoneBook = input.nextInt();
	switch(phoneBook){

        case 1: System.out.println("""

        search

        """);
        break;


        case 2: System.out.println("""

        Service Nos

        """);    
        break;


        case 3: System.out.println("""

        Add name

        """);
        break;


        case 4: System.out.println("""

        Erase

        """);  
        break;


        case 5: System.out.println("""

        Edit

        """);  
        break;


        case 6: System.out.println("""

        Assign tone

        """);  
        break;


        case 7: System.out.println("""

        Send b'card

        """);    
        break;


        case 8: System.out.println("""

        1. Type of view

        2. Memory status

        """);
        break;


        case 9: System.out.println("""

        Speed dials

        """); 
        break;


        case 10: System.out.println("""

        Voice tags

        """);    

       }

        break;

 case 2:System.out.println("""

	1. Write messages

	2. Inbox
	
	3. Outbox

	4. Picture messages

	5. Template

	6. Smileys

	7. Message setting

	8. Info service

	9. Voice mailbox number

	10. Service command editor

 """);

        int messages = input.nextInt();
	switch(messages){

        case 1: System.out.println("""

        Write message

        """);  
        break;


        case 2: System.out.println("""

        Inbox

        """);  
        break;


        case 3: System.out.println("""

        Outbox

        """);  
        break;


        case 4: System.out.println("""

        Picture messages

        """);  
        break;


        case 5: System.out.println("""

        Template

        """);  
        break;


        case 6: System.out.println("""

        Smileys

        """);  
        break;


        case 7: System.out.println("""

        1. Set 1

           1. Message center number
           2. Message sent as
           2. Message validity

        2. Common

           1. Delivery reports
           2. Reply vis same center
           2. Character support

        """);
        break;


        case 8: System.out.println("""

        Info service

        """);  
        break;


        case 9: System.out.println("""

        Voice mailbox number

        """);  
        break;


        case 10: System.out.println("""

        Service command editor

        """); 
        }

        break;

 case 3:System.out.println("""

	1. Chat

       """);

        int chat = input.nextInt();
	switch(chat){

        case 1: System.out.println("""

        Chat

        """);  
        }
       
	break;

 case 4:System.out.println("""

	1. Missed calls

	2. Recieved calls

	3. Dialled numbers

	4. Erase recent call lists
 
        5. Show call duration

        6. Show call costs

        7. Call cost setting

        8. Prepaid credit

 """);

        int callRegister = input.nextInt();
        switch(callRegister){
        
        case 1: System.out.println(""" 

        Missed calls

        """);
        break;


        case 2: System.out.println(""" 

        Recieved calls

        """);
        break;


        case 3: System.out.println(""" 

        Dialled numbers

        """);
        break;


        case 4: System.out.println(""" 

        Erase recent call lists

        """);
        break;


        case 5: System.out.println(""" 

            1. Last call duration
            2. All calls' duration
            3. Recieved calls' duration
            4. Dialled calls' duration
            5. Clear timers

        """);
        break;


        case 6: System.out.println(""" 

            1. Last call costs
            2. All calls' cost
            3. Clear counters

        """);
        break;

        case 7: System.out.println(""" 

            1. Call cost limit
            2. Show costs in

        """);
        break;

        case 8: System.out.println(""" 
         
        Prepaid credit

        """);

        }

	break;

 case 5:System.out.println("""

	1. Ringing tone

	2. Ringing volume

	3. Incoming call alart

	4. Composer

	5. Message alart tone

	6. Keypads tones

	7. Warning and game tones

	8. Vibrating alart

	9. Screen saver

 """);

       int tones = input.nextInt();
       switch(tones){

case 1: System.out.println(""" 

      Ringing tone

""");
      break;


case 2: System.out.println(""" 

    Ringing volume

""");
      break;


case 3: System.out.println(""" 

    Incoming call alart

""");
      break;

case 4: System.out.println(""" 

      Composer

""");
      break;


case 5: System.out.println(""" 

     Message alart tone

""");
	break;


case 6: System.out.println(""" 

      Keypad tones

""");
	break;

case 7: System.out.println(""" 

      Warning and game tones

""");
	break;

case 8: System.out.println(""" 

     Vibrating alart

""");
	break;

case 9: System.out.println(""" 

     Screen saver

""");
	break;

}


	break;


 case 6:System.out.println("""

	1. Call settings

	2. Phone setting

	3. Security setting

	4. Restore factory settings

 """);

  int settings = input.nextInt();
  switch(settings){

  case 1: System.out.println("""

        1. Automatic redial

        2. Spees dialling

        3. Call waiting options

        4. Own number sending

        5. Phone line in use

        6. Automatic answer
   """);
	break;

   case 2: System.out.println("""

        1. Language
        2. Cell info didplay
        3. Welcome note
        4. Network selection
        5. Lights
        6. Confirm SIM service actions
   """);
	  break;

   case 3: System.out.println("""

        1. PIN code request
        2. Call barring service
        3. Fixed dailling
        4. Closed user group
        5. Phone security
        6. Change access codes
    """);
    	 break;

    case 4: System.out.println("""

       Restore factory settings

    """);

       }

    	break;


 case 7:System.out.println("""

	1. Call divert

 """);

  int divert = input.nextInt();
  switch(divert){
 
 case 1: System.out.println(""" 

     Call divert

 """);
   }

   	break;


 case 8:System.out.println("""

	1. Games

 """);

  int games = input.nextInt();
  switch(games){
 
 case 1: System.out.println(""" 

     Games

 """);
   }

 	break;


 case 9:System.out.println("""

	1. Calculator

 """);

    int calculator = input.nextInt();
    switch(calculator){
 
 case 1: System.out.println(""" 

     Calculator

 """);
   }
 	break;


 case 10:System.out.println("""

	1. Reminders

 """);

    int reminders = input.nextInt();
    switch(reminders){
 
 case 1: System.out.println(""" 

     Reminders

    """);
   }
 	 break;


 case 11:System.out.println("""

	1. Clock 

 """);

   int clock = input.nextInt();
   switch(clock){
 
 case 1: System.out.println(""" 

     1. Alarm clock
     2. Clock settings
     3. Date settings
     4. Stopwatch
     5. Countdown timer
     6. Auto update of date and time

 """);
   }
  	break;


 case 12:System.out.println("""

	1. Profiles

 """);

   int profiles = input.nextInt();
   switch(profiles){
 
 case 1: System.out.println(""" 

     Profiles

 """);
   }
 	break;


 case 13:System.out.println("""

	1. SIM services

 """);

   int simServices = input.nextInt();
   switch(simServices){
 
 case 1: System.out.println(""" 

     SIM services

 """);
   }
 	break;


     }


   }



 }

       