// import java.util.Scanner;

// public class Length {
//     String[] Symbols = {"!","@","#","$","%","^","&","*","(",")","`","~","{","}","[","]",":",";","'","\"","|","\\ ","/","?",".",">",",","<"};
//     String[] Capital_letters = {"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","K","L","Z","X ","C","V","B","N","M"};
//     String[] Numbers = {"1","2","3","4","5","6","7","8","9",};
//     String[] Colors = {"white", "yellow", "red","blue","pink","brown","green","black","purple","orange"};

    


//          void check_length () {
//             Scanner scanner = new Scanner(System.in);
//             String user_password = scanner.nextLine();
//             boolean Wrong_password = true;
//             while (Wrong_password == true) {
//                 if (user_password.length() < 10 ){ // no cumple con los requisitos
//                     try {
//                         throw new RuntimeException("Your password must be over 10 characters long.");
//                     } catch (Exception e) {
//                         System.out.println(e + " Please try again");
//                         check_length();
//                         break;
//                     }
//                 }
//                 else if (user_password.length() > 10) { // si cumple con los requisitos
//                     System.out.println("Great password");
//                 }
                
//             }
//            scanner.close(); 
//         }
//     }

