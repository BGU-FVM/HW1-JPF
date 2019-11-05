import java.util.Random;

public class Sanity {

    public static void main( String args[] ) {
        System.out.println("Sanity started");
        Random r = new Random();
        String researcherString = "  Hoare Pnueli Clarke Emerson Sifakis Lamport  ";
        String[] researchers = researcherString.split(" ");
        int wordCount = countWords(researcherString);
        
        System.out.println(researchers[r.nextInt(wordCount)]);
    }

    private static int countWords(String s) {
        int count = 1;
        for ( char c : s.toCharArray() ) {
            if ( c == ' ' ) count++;
        }
        return count;
    }
}
