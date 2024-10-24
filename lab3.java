import java.util.Random;

//zadanie 1

//public class Main {
//    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
//        Random random = new Random();
//        int[] tablica = new int[n];
//        for (int i = 0; i < n; i++) {
//            tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
//        }
//        return tablica;
//    }

//zadanie 2
//public class Main {
//    public static void wypiszTablice(int[] tab, int n, int m) {
//        int index = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (index < tab.length) {
//                    System.out.printf("%4d", tab[index]);
//                    index++;
//                } else {
//                    System.out.print("    ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//zadanie3
//public class Main {
//
//    public static int ileNieparzystych(int[] tab) {
//        int count = 0;
//        for (int liczba : tab) {
//            if (liczba % 2 != 0) count++;
//        }
//        return count;
//    }
//
//    public static int ileParzystych(int[] tab) {
//        int count = 0;
//        for (int liczba : tab) {
//            if (liczba % 2 == 0) count++;
//        }
//        return count;
//    }
//
//    public static int ileDodatnich(int[] tab) {
//        int count = 0;
//        for (int liczba : tab) {
//            if (liczba > 0) count++;
//        }
//        return count;
//    }
//
//    public static int ileUjemnych(int[] tab) {
//        int count = 0;
//        for (int liczba : tab) {
//            if (liczba < 0) count++;
//        }
//        return count;
//    }
//
//    public static int ileZerowych(int[] tab) {
//        int count = 0;
//        for (int liczba : tab) {
//            if (liczba == 0) count++;
//        }
//        return count;
//    }
//
//    public static int ileMaxymalnych(int[] tab) {
//        int max = Integer.MIN_VALUE;
//        int count = 0;
//        for (int liczba : tab) {
//            if (liczba > max) {
//                max = liczba;
//                count = 1;
//            } else if (liczba == max) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int ileMinimalnych(int[] tab) {
//        int min = Integer.MAX_VALUE;
//        int count = 0;
//        for (int liczba : tab) {
//            if (liczba < min) {
//                min = liczba;
//                count = 1;
//            } else if (liczba == min) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static int ileUnikalnych(int[] tab) {
//        int count = 0;
//        for (int i = 0; i < tab.length; i++) {
//            boolean unikalny = true;
//            for (int j = 0; j < tab.length; j++) {
//                if (i != j && tab[i] == tab[j]) {
//                    unikalny = false;
//                    break;
//                }
//            }
//            if (unikalny) count++;
//        }
//        return count;
//    }
//}

//zadanie 4
//public class Main {
//
//    public static int sumaDodatnich(int[] tab) {
//        int suma = 0;
//        for (int liczba : tab) {
//            if (liczba > 0) suma += liczba;
//        }
//        return suma;
//    }
//
//    public static int sumaUjemnych(int[] tab) {
//        int suma = 0;
//        for (int liczba : tab) {
//            if (liczba < 0) suma += liczba;
//        }
//        return suma;
//    }
//
//    public static double sumaOdwrotnosci(int[] tab) {
//        double suma = 0.0;
//        for (int liczba : tab) {
//            if (liczba != 0) suma += 1.0 / liczba;
//        }
//        return suma;
//    }
//
//    public static double sredniaArytmetyczna(int[] tab) {
//        int suma = 0;
//        for (int liczba : tab) {
//            suma += liczba;
//        }
//        return (double) suma / tab.length;
//    }
//
//    public static double sredniaGeometryczna(int[] tab) {
//        double iloczyn = 1.0;
//        for (int liczba : tab) {
//            iloczyn *= liczba;
//        }
//        return Math.pow(iloczyn, 1.0 / tab.length);
//    }
//
//    public static double sredniaHarmoniczna(int[] tab) {
//        double suma = 0.0;
//        for (int liczba : tab) {
//            if (liczba != 0) suma += 1.0 / liczba;
//        }
//        return tab.length / suma;
//    }
//}

//zadanie 5
//public class Main {
//
//    public static int[] funkcjaLiniowa(int[] tab, int a, int b) {
//        int[] wynik = new int[tab.length];
//        for (int i = 0; i < tab.length; i++) {
//            wynik[i] = a * tab[i] + b;
//        }
//        return wynik;
//    }
//
//    public static int[] funkcjaKwadratowa(int[] tab, int a, int b, int c) {
//        int[] wynik = new int[tab.length];
//        for (int i = 0; i < tab.length; i++) {
//            wynik[i] = a * tab[i] * tab[i] + b * tab[i] + c;
//        }
//        return wynik;
//    }
//
//    public static int[] funkcjaWykladnicza(int[] tab, int a) {
//        int[] wynik = new int[tab.length];
//        for (int i = 0; i < tab.length; i++) {
//            wynik[i] = (int) Math.pow(a, tab[i]);
//        }
//        return wynik;
//    }
//
//    public static int[] funkcjaSignum(int[] tab) {
//        int[] wynik = new int[tab.length];
//        for (int i = 0; i < tab.length; i++) {
//            wynik[i] = Integer.signum(tab[i]);
//        }
//        return wynik;
//    }
//}

//zadanie6
//public class Main {
//
//    public static int najdluzszyCiagDodatnich(int[] tab) {
//        int max = 0, current = 0;
//        for (int liczba : tab) {
//            if (liczba > 0) current++;
//            else current = 0;
//            if (current > max) max = current;
//        }
//        return max;
//    }
//
//    public static int najdluzszyCiagUjemnych(int[] tab) {
//        int max = 0, current = 0;
//        for (int liczba : tab) {
//            if (liczba < 0) current++;
//            else current = 0;
//            if (current > max) max = current;
//        }
//        return max;
//    }
//
//    public static void odwrocTablice(int[] tab) {
//        odwrocTablice(tab, 0, tab.length - 1);
//    }
//
//    public static void odwrocTablice(int[] tab, int indeksStart, int indeksStop) {
//        while (indeksStart < indeksStop) {
//            int temp = tab[indeksStart];
//            tab[indeksStart] = tab[indeksStop];
//            tab[indeksStop] = temp;
//            indeksStart++;
//            indeksStop--;
//        }
//    }
//}

//zadanie7
//public class Main {
//
//    public static int[] generujZakres(int n, int minWartosc, int maxWartosc) {
//        int[] tablica = new int[n];
//        int krok = (maxWartosc - minWartosc) / (n - 1);
//        for (int i = 0; i < n; i++) {
//            tablica[i] = minWartosc + i * krok;
//        }
//        return tablica;
//    }
//}

