import java.util.Arrays;
import java.util.List;

public class shufflebiased {
    public static void main(String[] args) {

        int numbers[]=new int[100];
        for (int i=0;i<100;i++){
            numbers[i]=i;
        }

        int shuffled[]= new int[100];

        for (int i =0; i<100; i++){
            int number = 1+(int)(Math.random()*100);
            for (int j:shuffled){
                if (j==number){
                    break;
                } else {
                    shuffled[i]=number;
                }
            }
        }
        System.out.print(Arrays.toString(shuffled));


        /*the second shuffle*/
        
    }
}


/*git config --global user.name "Your Name" # Set global username
git config --global user.email "you@example.com" # Set global email
git config --list # View all configurations
git help # Show help for commands

*/