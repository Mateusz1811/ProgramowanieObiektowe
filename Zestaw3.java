public class Main {


    static void TrojkiPitagorejskie(int n) {
        for (int a = 1; a <= n; a++) {
            for (int b = a; b <= n; b++) {
                int c = (int) Math.sqrt(a * a + b * b);
                if (c <= n && a * a + b * b == c * c) {
                    System.out.println("Trójka pitagorejska: " + a + ", " + b + ", " + c);
                }
            }
        }
    }

    static void funKwaRozwiazania(int n) {
        for (int a = 1; a <= n; a++) {
            for (int b = -n; b <= n; b++) {
                for (int c = -n; c <= n; c++) {
                    int delta = b * b - 4 * a * c;
                    if (delta >= 0) {
                        System.out.println("Dla a = " + a + ", b = " + b + ", c = " + c + "Istnieją rozwiązania rzeczywiste (Delta = " + delta + ")");
                    }
                }
            }
        }
    }

    static void LiczbyPierwsze(int n) {
        for (int i = 2; i <= n; i++) {
            int dzielnik = 2;
            while (dzielnik * dzielnik <= i) {
                if (i % dzielnik == 0) {
                    break;
                }
                dzielnik++;
            }
            if (dzielnik * dzielnik > i) {
                System.out.println(i);
            }
        }
    }

    static void LiczbyPodzielne(int m, int n) {
        int start = (int) Math.pow(10, m - 1);
        int koniec = (int) Math.pow(10, m) - 1;

        for (int i = start; i <= koniec; i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }

    static int silnia(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * silnia(n - 1);
    }

    static int silniapodwojna(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        return n * silniapodwojna(n-2);
    }

    static int silniamta(int m, int n)
    {
        int wynik=1;
        while(n>0)
        {
            wynik*=n;
            n-=m;
        }
        return wynik;
    }
    static long dwumianNewtona(int n, int k)
    {
        return silnia(n)/(silnia(k)*silnia(n-k));
    }

    static int fibo(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }

    static int SumaNaturalnych(int n)
    {
        int wynik=0;
        for(int i=0;i<=n;i++)
        {
            wynik+=i;
        }
        return wynik;
    }
    static int sumaParzystych(int n)
    {
        int wynik=0;
        for(int i=0;i<=n;i+=2)
        {
            wynik+=i;
        }
        return wynik;
    }

    static int sumaNieparzystych(int n)
    {
        int wynik=0;
        for(int i=1;i<=n;i+=2)
        {
            wynik+=i;
        }
        return wynik;
    }

    static int sumaKwaNaturalych(int n) {
        int wynik = 0;
        for (int i = 0; i <= n; i++)
        {
            wynik+=i*i;
        }
        return wynik;
    }

    static int sumaSzeNaturalnych(int n)
    {
        int wynik=0;
        for(int i=0;i<=n;i++)
        {
            wynik+=i*i*i;
        }
        return wynik;
    }

    static double sumaOdwrotnosci(int n)
    {
        double suma=0.0;
        for(int i=1;i<=n;i++)
        {
            suma+=1.0/i;
        }
        return suma;
    }

    static boolean czyPalindrom(String wyraz)
    {
        int dlugosc = wyraz.length();
        for(int i=0;i<dlugosc/2;i++)
        {
            if(wyraz.charAt(i)!=wyraz.charAt(dlugosc-i-1))
            {
                return false;
            }
        }
        return true;
    }

    static boolean czyDoskonala(int n)
    {
        int suma=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                suma+=i;
            }
        }
        return suma==n;
    }

    static boolean czyPierwsza(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int m=3;
        int n=7;
        int k=2;
        //TrojkiPitagorejskie(n);
        //funKwaRozwiazania(n);
        //LiczbyPierwsze(n);
       // LiczbyPodzielne(m,n);
        System.out.println(silnia(n));
        System.out.println(silniapodwojna(n));
        System.out.println(silniamta(m,n));
        System.out.println(dwumianNewtona(n,k));
        System.out.println(fibo(n));
        System.out.println(SumaNaturalnych(n));
        System.out.println(sumaParzystych(n));
        System.out.println(sumaNieparzystych(n));
        System.out.println(sumaKwaNaturalych(n));
        System.out.println(sumaSzeNaturalnych(n));
        System.out.println(sumaOdwrotnosci(n));
        String wyraz = "kajak";
        System.out.println(czyPalindrom(wyraz));
        System.out.println(czyDoskonala(n));
        System.out.println(czyPierwsza(n));
    }
}
