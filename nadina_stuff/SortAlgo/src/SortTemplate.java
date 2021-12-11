import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class SortTemplate {

    private int[] unsortedArray;
    private final int SIZE = 50000;
    private final int RANGE = 100000000;
    int tmp = 0;


    public static void main(String[] args) {
        long startTime;

        SortTemplate programm = new SortTemplate();
        startTime = new Date().getTime();
        programm.sort();
        System.out.println("Dauer der Sortierung: " + (new Date().getTime() - startTime) + "ms");
    }

    SortTemplate() {
        Random rand = new Random();
        unsortedArray = new int[SIZE];
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = rand.nextInt(RANGE);
        }
    }

    private void sort() {
        for(int i = 0; i < unsortedArray.length; i++){
            for(int j = 0; j < (unsortedArray.length - 1 - i); j++){
                // - 1 nach oben ins zweite for von if gesetzt
                if(unsortedArray[j] > unsortedArray[j]){
                    // tausch
                    tmp = unsortedArray[j -1];
                    unsortedArray[j - 1] = unsortedArray[j+1];
                    unsortedArray[j] = tmp;
                }
            }
        }
    }
}
