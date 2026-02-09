import java.util.Arrays;
import java.util.Random;

class shufflebiased {
    public static void main(String[] args) {
        int shuffled[] = new int[10];
        int i;
        for (i = 0; i < 10; i++){
        shuffled[i] = i;
        }
        for (i=0; i<10; i++){
        Random random = new Random();
        int randomIndex = random.nextInt(shuffled.length);
        int randomElement = shuffled[randomIndex];
        
        shuffled[i]=randomElement;
        }
        
        System.out.print(Arrays.toString(shuffled));
    }
}

