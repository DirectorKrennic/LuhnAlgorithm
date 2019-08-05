import java.util.*;

public class Luhn_Algorithm {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a credit card number to check it's validity!");

        String cardNumber = sc.nextLine();
        
        sc.close();

        if(checkValid(cardNumber)){
            System.out.println("Card number is valid!");

        }else{
            System.out.println("Card number is invalid.");
        }
    }

    public static boolean checkValid(String number){ //checkValid is a boolean method 

        String cardNum = number; 
        String reversedNum = "";

        for(int i=cardNum.length()-1; i>=0; i--){

            reversedNum += cardNum.charAt(i); //Reserve the card number 
        }

        int sum=0; //Variable to store sum total 

        for(int j=0; j<=reversedNum.length()-1; j++){

            int currentNum = Character.getNumericValue(reversedNum.charAt(j)); //Get the numeric value

            if(j%2!=0){
                currentNum*=2; //Double every second number                
            }

            if(currentNum > 9){
                currentNum-=9; //If number is greater than 9,reduce it by 9  
            }

            sum+=currentNum; //Calculate sum
        }

        if(sum %10 ==0){
            return true; //Valid card
        }
        else{
            return false; //Invalid card
        }

    }
}