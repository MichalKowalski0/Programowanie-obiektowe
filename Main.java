public class Main {

//zadanie1

    public static boolean dokladnosc(double x, double y, int k) {
        return Math.abs(x - y) <= Math.pow(10, -k);
    }

//zadanie2

    public static int najblizszySasiad(double S) {
        return (int) Math.round(Math.sqrt(S));
    }

//zadanie3

/*    public static double pierwiastek(double S, int n, int k) {
        double x = S;
        double epsilon = Math.pow(10, -k);
    }*/

//zadanie6
    public static boolean czyPalindrom(int n) {
        int oryginalna = n;
        int odwrocona = 0;

        while (n != 0) {
            int cyfra = n % 10;
            odwrocona = odwrocona * 10 + cyfra;
            n /= 10;
        }
        return oryginalna == odwrocona;
    }
}



