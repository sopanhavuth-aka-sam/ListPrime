
import java.util.*;
public class main {

	/**
	 * Purpose: ask user for input(int). Program list all prime numbers that <=input.
	 * 			This program use the concept of "sieve of eratosthenes"
	 * Author: Sopanhavuth Som
	 */
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
	    
        //Request and record user's input(int)
        System.out.print("List all prime numbers under: ");
        int max = input.nextInt();
        //END
        
        
        //Create and fill array the size of max
        int numPool[] = new int[max+1];
        for(int i=0; i<=max; i++){
            numPool[i] = i;
        }
        //END
        
        
        
        for(int i=2; i<=max; i++){
            
        	if(numPool[i]==0){
                //Skip; "0" is used to mark composite number.
            }
            
            
            else{
            	//Print out the current "prime" number
                int prime = numPool[i];
                System.out.println(prime);
                //END
                
                //Change number that divided by "prime" to "0"
                for(int j=i+1; j<=max; j++){
                    if(numPool[j]==0){
                    	//Skip; "0" is used to mark composite number.
                    }
                    else{
                    	//Test if numbers-in-the-pool is divided by the current "prime"
                        if(numPool[j]%prime == 0){
                            numPool[j]=0;
                        }
                        //END
                    }
                //END
                }
            }
        }
	}

}
