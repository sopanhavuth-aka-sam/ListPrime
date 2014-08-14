
import java.util.*;
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    int prime = 0;
        Scanner input = new Scanner(System.in);
	    
        System.out.println("List all prime numbers under: ");
        // find prime under this max
        int max = input.nextInt();
        // change max so array has 0-max slots
        max =max+1;
        // Array populating///////////////////
        int numPool[] = new int[max];
        for(int i=0; i<=max-1; i++){
            numPool[i] = i;
        }
        //////////////////////////////////////
         
        for(int i=2; i<max; i++){
            // Skip/Marking Composite Num found by divided previous found 'prime'
            if(numPool[i]==0){
                //do nothing
            }
             
            else{
                prime = numPool[i];
                System.out.println(prime);
                for(int j=i+1; j<=max-1; j++){
                    if(numPool[j]==0){
                        //do nothing
                    }
                    else{    
                        int dividedByPrime = numPool[j]%numPool[i];
                        if(dividedByPrime == 0){
                            numPool[j]=0;
                        }
                    }
                }
            }
        }
	}

}
