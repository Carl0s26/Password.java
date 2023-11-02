
  // Imports \\



  import java.util.Scanner;

// time imports

import java.text.Format;  
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Password {
    public static void main(String[] args) {
    boolean Wrong_password = true;
    int sum_numbers = 0;
    int number = 0;

    String[] Symbols = {"!", "@","#","$","%","^","&","*","(",")","`","~","{","}","[","]",":",";","'","\"","|","\\ ","/","?",".",">",",","<","-","_","=","+"};
    String[] countries = {"Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bermuda","Palestine", "Bhutan", "Bolivia", "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil", "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia", "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica", "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)", "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana", "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands", "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India", "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan", "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau", "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte", "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia", "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands", "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland", "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda", "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa", "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles", "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain", "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname", "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland", "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan", "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago", "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela", "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands", "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe", "Palestine"};
    String[] Capital_letters = {"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","K","L","Z","X ","C","V","B","N","M",};
    String[] Numbers = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    String[] Colors = {"white","yellow","red","blue","pink","brown","green","black","purple","orange",};
    String[] Lower_letters = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
    String user_password = "";
    Scanner Leedor = new Scanner(System.in);
    Format time_format = new SimpleDateFormat("EEEE");  
    String Day_name = time_format.format(new Date());  

    System.out.println("Please choose a new Password");

    while (Wrong_password == true) {
      user_password = Leedor.nextLine();
      sum_numbers = 0;

      if (user_password.length() < 10) { // < 10 END
        try {
          throw new RuntimeException("Your password must be over 10 characters,");
        }
        catch (Exception e) {
          System.out.println(e + " Please try again");
        }
      } 
      else if (user_password.length() >= 10) { // > 10 Continue
        if (user_password.length() > 35) { // > 30 END
          try {
            throw new RuntimeException("Your password must not be over 35 characters,");
          } 
          catch (Exception e) {
            System.out.println(e + " Please try again");
          }
        } else if (user_password.length() <= 35) { // <= 35 Continue
          number = 0;
          for (String i : Symbols) {
            if (user_password.contains(i)) {
              number += 1;
            }
          }
          if (number >= 5) { // 5 symbols Continue
            number = 0;
            for (String i : Capital_letters) {
              if (user_password.contains(i)) {
                number += 1;
              }
            }
            if (number >= 3) { // 3 capital leters Continue
              number = 0;
              for (String i : Numbers) {
                if (user_password.contains(i)) {
                  number += 1;
                }
              }
              char[] user_password_characters = user_password.toCharArray();
              for (int i = 0; i < user_password_characters.length; i++) {
                for (int j = i + 1; j < user_password_characters.length; j++) {
                  if (user_password_characters[i] == user_password_characters[j]) {
                    if (user_password_characters[i] == '0' || user_password_characters[i] == '1' || user_password_characters[i] == '2' ||  user_password_characters[i] == '3' || user_password_characters[i] == '4' ||user_password_characters[i] == '5' || user_password_characters[i] == '6' ||user_password_characters[i] == '7' ||user_password_characters[i] == '8' ||user_password_characters[i] == '9'){
                      number += 1;
                    }
                  }
                }
              }
              for (int S = 0; S < user_password_characters.length; S++) {
                if (user_password_characters[S] == '0' || user_password_characters[S] == '1' || user_password_characters[S] == '2' ||  user_password_characters[S] == '3' || user_password_characters[S] == '4' ||user_password_characters[S] == '5' || user_password_characters[S] == '6' ||user_password_characters[S] == '7' ||user_password_characters[S] == '8' ||user_password_characters[S] == '9') {
                  int number_user_password = (int) user_password_characters[S] - (int) '0';
                  sum_numbers += number_user_password;
                }
              }
              if (number >= 3) { // More than 3 Numbers Continue
                if (sum_numbers > 18 && sum_numbers <= 27) { // Between 18 and 30 Continue
                  number = 0;
                  for (String i : Colors) {
                    if (user_password.toLowerCase().contains(i)) {
                    number += 1;
                    }
                  }
                  if (number >=1) { // Color continue
                   number = 0;
                    for (String i : countries) {
                        if (user_password.toLowerCase().contains(i.toLowerCase())) {
                        number += 1;
                        }
                    }
                    if (number >=1) { // Country continue                   
                        if (user_password.contains("-5")){ // equation continue
                            if (user_password.toLowerCase().contains("11-grade")) {
                              number = 0;
                              for (String i : Lower_letters) {
                                if (user_password.contains(i)) {
                                  number += 1;
                                }
                              }
                              if (number >= 1) {
                                if (user_password.toLowerCase().contains(Day_name.toLowerCase())) {
                                    System.out.println(" Thats A Great Password");
                                    break;
                                }
                                else{
                                    try {
                                        throw new RuntimeException("Your password must have today's day name,");
                                    } catch (Exception e) {
                                        System.out.println(e + " Please try again");
                                    }
                                }
                              }
                              else{
                                try {
                                throw new RuntimeException("Your password must at least have a lowercase letter, ");
                                }
                            catch (Exception e) {
                                System.out.println(e + " Please try again");
                            }
                              }
                            }
                            else if (user_password.toLowerCase().contains("10-grade") || user_password.toLowerCase().contains("9-grade") || user_password.toLowerCase().contains("12-grade")) {
                               try {
                                throw new RuntimeException("You must answer the question honestly, ");
                                }
                            catch (Exception e) {
                                System.out.println(e + " Please try again");
                            }
                              }
                            else{
                              try {
                                throw new RuntimeException("You need to have your favorite class in the password (x-grade),");
                                }
                            catch (Exception e) {
                                System.out.println(e + " Please try again");
                            }
                            }
                            }
                        else{ // equation End
                            try {
                                throw new RuntimeException("Password must have the smallest solution of this mathematical equation: \"(x^2 -25)\"");
                            }
                            catch (Exception e) {
                                System.out.println(e + " Please try again");
                            }
                        }
                    }
                    else{ // Country End
                        try {
                          throw new RuntimeException("The password needs to include your favorite country, ");
                         }
                    catch (Exception e) {
                    System.out.println(e + "Please try again");
                    }
                    } 
                  }
                  else{ // Color End
                    try {
                      throw new RuntimeException("There must at least be a color in your password, ");
                    }
                    catch (Exception e) {
                    System.out.println(e + "Please try again");
                    }
                  }
                }
                else if (sum_numbers > 27) { // Mayor Que 27 FINAL
                  try {
                    throw new RuntimeException("The sum of All the numbers must be less than 28,");
                  }
                  catch (Exception e) {
                    System.out.println(e + "Please try again");
                  }
                }
                else if (sum_numbers < 18){ // menor que 18 FINAL
                  try {
                    throw new RuntimeException("The sum of All the numbers in your password must add to more than 18, ");
                  } 
                  catch (Exception e) {
                    System.out.println(e + "Please try again");
                  }
                }
              }
              else { // == 3 Numbers End
                try {
                  throw new RuntimeException("Your password must have at least 3 numbers, ");
                } 
                catch (Exception e) {
                  System.out.println(e + "Please try again");
                }
              }
            } 
            else { // 3 capital letters END
              try {
                throw new RuntimeException("Your password must have at least 3 different Capital letters, ");
              } 
              catch (Exception e) {
                System.out.println(e + "Please try again");
              }
            }
          } 
          else { // different symbols END
            try {
                
              throw new RuntimeException("Your password must have at least 5 different symbols,");
            } 
            catch (Exception e) {System.out.println(e + " Please try again");
            }
          }
        }
      }
    }
  }
}