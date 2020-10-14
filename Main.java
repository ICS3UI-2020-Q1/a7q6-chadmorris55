/**
 *
 * @author 
 */
public class Main {


  public static boolean allDigitsOdd(int number){
    //declre variable
    boolean oddNum = true;
    //loop
    while(number > 10){
      //if the modulus = 0 then its an even number so oddNum is false, if modulus doesn't = 0 then it divdes by 10 and checks again
      if(number % 2 == 0){
        oddNum = false;
        return oddNum;
      } else {
        number = number / 10;
        oddNum = true;
      }
    }return oddNum;
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    //calls method
    boolean check = allDigitsOdd(325);
    System.out.println(check);
  }
}
