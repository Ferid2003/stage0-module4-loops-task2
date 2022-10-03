package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int a = 1;
        int factorial = 1;
        if (printToInclusive!=0){
            System.out.println(1);
            while (a<printToInclusive+1){
                System.out.println(factorial);
                a++;
                factorial*=a;
            }
        }else {
            System.out.println(1);
        }

    }

    public static void main(String[] args) {
        FactorialNumbers factorialNumbers = new FactorialNumbers();
        factorialNumbers.printFactorialRow(3);
    }
}
