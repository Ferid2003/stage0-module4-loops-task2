package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int a = 1;
        while (a<printTillInclusive+1){
            if (a%2==0){
                System.out.println(a);
            }
            a++;
        }
    }
}
