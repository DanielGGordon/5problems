import java.math.BigInteger;
import java.util.Arrays;

public class Fibon {

    public static void main (String args[]) {
        System.out.println("Fibbonocci sequnce sum: " + Arrays.toString(fibBig(100)));
    }

    public static long [] fib (int n) {
        long fibSeq [] = new long [n];
        fibSeq[0] = 0;
        fibSeq[1] = 1;
        for (int i = 2; i < n; i++) {
            fibSeq[i] = fibSeq[i - 1] + fibSeq[i - 2];
        }
        return fibSeq;
    }

    //fib function will cap out around n = 95
    public static BigInteger[] fibBig (int n) {
        BigInteger fibSeq [] = new BigInteger[n];
        fibSeq[0] = BigInteger.valueOf(0);
        fibSeq[1] = BigInteger.valueOf(1);
        for (int i = 2; i < n; i++) {
            fibSeq[i] = fibSeq[i - 1].add(fibSeq[i - 2]);
        }
        return fibSeq;
    }

}