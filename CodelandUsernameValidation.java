import java.util.*; 
import java.io.*;

class Main {

  public static boolean CodelandUsernameValidation(String str) {
    // code goes here
    //System.out.println(str.charAt(0));
    if (str.length() <= 4 || str.length() >= 25) {
      // System.out.println("Failed length");
      return false;
    }
    if (str.charAt(str.length() - 1) == '_') {
      // System.out.println("Failed last char");
      return false;
    } 
    if (!Character.isLetter(str.charAt(0))) {
      // System.out.println("Failed first char");
      return false;
    }
    for (int i = 0; i < str.length(); i++) {
      if (!Character.isLetterOrDigit(str.charAt(i)) && str.charAt(i) != '_') {
        // System.out.println("Failed char: " + i);
        // System.out.println(Character.isLetterOrDigit(str.charAt(i)));
        return false;
      }
    }
    return true;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }

}