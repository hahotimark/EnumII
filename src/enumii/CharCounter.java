package enumii;

public class CharCounter {

    public void Count(String word){
    int wordCount = 0;

        for (char letter = 'a'; letter <= 'z'; letter++) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                wordCount++;
            }
        }
        if (wordCount > 0) {
            System.out.println(letter + "=" + wordCount);
            wordCount = 0;
        }
    }
        }
}
