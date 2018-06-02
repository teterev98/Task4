import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        rollCoin(1000);

    }

    public static void rollCoin(int numberOfRolls) {
        int headsCount = 0;
        int tailsCount = 0;
        int coin;
        Random random = new Random();
        for (int i = 0; i < numberOfRolls; i++){
            coin = random.nextInt(100);
            if (coin % 2 ==0) {
                headsCount++;
            }
            else{ tailsCount++;}
        }
        System.out.printf("Number of heads is %d, number of tails is %d", headsCount, tailsCount);
    }
}
