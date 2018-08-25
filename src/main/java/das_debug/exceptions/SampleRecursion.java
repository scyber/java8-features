package das_debug.exceptions;

public class SampleRecursion {
    public static void main(String args[]){


        System.out.println(fibbonachi( 2));
    }

    public static int factorial (int i) {
        if (i == 1) return i;
        else return i * factorial( i - 1);
    }
    public static int fibbonachi (int n) {
        if (n == 0) return n;
        else if(n == 1) return 1;
        else return (fibbonachi(n - 1 ) + fibbonachi(n - 2));
    }
}
