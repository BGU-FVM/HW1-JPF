import java.util.Random;

public class Sanity {

    public static void main( String args[] ) {
        System.out.println("Sanity started");
        Random r = new Random();
        String researcherString = "Hoare,Pnueli,Clarke,Emerson,Sifakis,Lamport,,";
        String[] researchers = researcherString.split(",");
        int commCount = countCommas(researcherString);
        
        System.out.println(researchers[r.nextInt(commCount)]);
    }

    private static int countCommas(String s) {
        int count = 0;
        for ( char c : s.toCharArray() ) {
            if ( c == ',' ) count++;
        }
        return count;
    }
}