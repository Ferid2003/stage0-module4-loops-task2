package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count;

        for (int i = 2; i<=printToInclusive; i++){
            count=0;
            for (int j = 2; j<=i/2; j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(i);
            }
        }


    }

    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimeNumbers(33);
    }
}




