package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int a = 0;
        while (a<chars.length){
            System.out.print(chars);
            break;
        }
    }

    public static void main(String[] args) {
        WordsBuilder wordsBuilder = new WordsBuilder();
        wordsBuilder.buildPhrase('l','o','v','e');
    }
}
