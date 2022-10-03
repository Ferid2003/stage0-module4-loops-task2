package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int a = 0;
        if (multiplyByAndToInclusive<0){
            while (a<-multiplyByAndToInclusive+1){
                System.out.println(multiplyByAndToInclusive*a);
                a++;
            }
        }else if (multiplyByAndToInclusive==0){
        }else {
            while (a<multiplyByAndToInclusive+1){
                System.out.println(a*multiplyByAndToInclusive);
                a++;
            }
        }
    }

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        multiplication.printMultiplied(-5);
    }
}
