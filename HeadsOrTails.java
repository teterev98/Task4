import java.util.Random;

public class HeadsOrTails {
    
    public static final int RANDOM_TIMES = 100;
    
    public static void main(String[] args) {
        
    }

    public static void rollCoin(int numberOfRolls) {
        int headsCount = 0;
        int tailsCount = 0;
        int coin;
        for (int i = 0; i < numberOfRolls; i++){
            coin = new Random().nextInt(RANDOM_TIMES);
            if (coin % 2 ==0) {
                headsCount++;
            }
            else{ tailsCount++;}
        }
        System.out.printf("Number of heads is %d, number of tails is %d", headsCount, tailsCount);
    }
}
