import java.util.HashSet;
import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;


public class Main {
    public static int[] generujTablice(int n, int minWartosc, int maxWartosc) {
        Random random = new Random();
        int[] tablica = new int[n];

        for(int i = 0; i < n; i++)
        {
           tablica[i] = random.nextInt(maxWartosc - minWartosc + 1) + minWartosc;
        }
        return tablica;
    }

    public static void wypiszTablice(int[] tab, int n, int m)
    {
        int index = 0;
        int maxDlugosc = 0;
        for(int i=0; i<tab.length; i++)
        {
            maxDlugosc = Math.max(maxDlugosc, String.valueOf(tab[i]).length());
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(index<tab.length)
                {
                    System.out.printf("%" + maxDlugosc + "d ", tab[index]);
                }else
                {
                    System.out.printf("%" + maxDlugosc + "s ", "");
                }
                index++;
            }
            System.out.println();
        }


    }

    public static int ileNieparzystych(int[] tab)
    {
        int count = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] % 2 != 0)
            {
                count++;
            }
        }
        return count;

    }

    public static int ileParzystych(int[] tab)
    {
        int count = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileDodatnich(int[] tab)
    {
        int count = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] > 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileUjemnych(int[] tab)
    {
        int count = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] < 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileZerowych(int[] tab)
    {
        int count = 0;
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] == 0)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileMaksymalnych(int[] tab)
    {
        int count = 0;
        int maxTablicy = tab[0];
        for(int i=1; i<tab.length; i++)
        {
            if(tab[i]>maxTablicy)
            {
                maxTablicy = tab[i];
            }
        }
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] == maxTablicy)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileMinimalnych(int[] tab)
    {
        int count = 0;
        int minTablicy = tab[0];
        for(int i = 1; i<tab.length; i++)
        {
            if(tab[i] < minTablicy)
            {
                minTablicy = tab[i];
            }
        }
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i] == minTablicy)
            {
                count++;
            }
        }
        return count;
    }

    public static int ileUnikalnych(int[] tab)
    {
       int count = 0;
       for(int i = 0; i<tab.length; i++)
       {
           boolean Unikat = true;
           for(int j=0;j<tab.length;j++)
           {
               if(i!=j && tab[i] == tab[j])
               {
                   Unikat = false;
                   break;
               }
           }
           if(Unikat)
           {
               count++;
           }
       }
       return count;

    }
    public static int sumaDodatnich(int[] tab)
    {
        int count = 0;
        for(int i = 0; i<tab.length; i++)
        {
            if(tab[i]>0)
            {
                count+=tab[i];
            }
        }
        return count;
    }

    public static int sumaUjemnych(int[] tab)
    {
        int count = 0;
        for(int i=0;i<tab.length; i++)
        {
            if(tab[i]<0)
            {
                count+=tab[i];
            }
        }
        return count;
    }

  //  public static int sumaOdwrotnosci(int[] tab)
    //{

    //}

    public static float sredniaArytmetyczna(int[] tab)
    {
        int sumaLiczb = 0;
        int iloscLiczb = 0;
        for(int i=0; i<tab.length; i++)
        {
            sumaLiczb += tab[i];
            iloscLiczb++;
        }
        float srednia = (float)sumaLiczb / iloscLiczb;
        return srednia;

    }

    public static float sredniaGeometryczna(int[] tab)
    {
        int iloczynLiczb = 1;
        int iloscLiczb = 0;
        for(int i=0; i<tab.length; i++)
        {
            iloczynLiczb *= tab[i];
            iloscLiczb++;
        }
        float srednia = (float)Math.pow(iloczynLiczb, 1/iloscLiczb);
        return srednia;
    }

    public static float sredniaHarmoniczna(int[] tab)
    {
        int iloscLiczb = 0;
        int sumaOdwrotnosci = 0;
        for(int i=0; i<tab.length; i++)
        {
            sumaOdwrotnosci += Math.pow(tab[i],-1);
            iloscLiczb++;
        }

        float srednia = (float)iloscLiczb / sumaOdwrotnosci;
        return srednia;
    }

    public static double[] funkcjaLiniowa(int[] tab, double a, double b) {
        double[] wyniki = new double[tab.length];
        for (int i = 0; i < tab.length; i++)
        {
            wyniki[i] = a * tab[i] + b;
        }
        return wyniki;
    }

    public static double[] funkcjaKwadratowa(int[] tab, double a, double b, double c) {
        double[] wyniki = new double[tab.length];
        for (int i = 0; i < tab.length; i++) {
            wyniki[i] = a * Math.pow(tab[i], 2) + b * tab[i] + c;
        }
        return wyniki;
    }

    public static double[] funkcjaWykladnicza(int[] tab, double a)
    {
        double[] wyniki = new double[tab.length];
        for(int i=0; i<tab.length; i++)
        {
            wyniki[i] = Math.pow(a , tab[i]);
        }
        return wyniki;
    }

    public static int[] funkcjaSignum(int[] tab) {
        int[] wyniki = new int[tab.length];
        for (int i = 0; i < tab.length; i++)
        {
            if(tab[i]>0)
            {
                wyniki[i]=1;
            }
            if(tab[i]<0)
            {
                wyniki[i]=-1;
            }
            if(tab[i]==0)
            {
                wyniki[i]=0;
            }
        }
        return wyniki;
    }
    
    public static int NajdluzszyCiagDodatnich(int[] tab)
    {
        int maxDlugosc = 0;
        int aktualnaDlugosc = 0;
        for(int num: tab)
        {
            if(num>0)
            {
                aktualnaDlugosc++;
            }else{
                maxDlugosc = Math.max(maxDlugosc, aktualnaDlugosc);
                aktualnaDlugosc = 0;
            }
        }
        maxDlugosc = Math.max(maxDlugosc, aktualnaDlugosc);
        return maxDlugosc;
    }
    
    public static int NajdluzszyCiagUjemnych(int[] tab)
    {
        int maxDlugosc = 0;
        int aktualnaDlugosc = 0;
        for(int num: tab)
        {
            if(num<0)
            {
                aktualnaDlugosc++;
            }else{
                maxDlugosc = Math.max(maxDlugosc, aktualnaDlugosc);
                aktualnaDlugosc = 0;
            }
        }
        maxDlugosc = Math.max(maxDlugosc, aktualnaDlugosc);
        return maxDlugosc;
    }
    
    public static int[] OdwrocTablice(int[] tab)
    {
        int[] odwrocona = new int[tab.length];
        for(int i=0;i<tab.length;i++)
        {
            odwrocona[i] = tab[tab.length-1-i];
        }
        return odwrocona;
    }
    






    public static void main(String[] args) {
        int[] tablica = generujTablice(5, 10, 50);
        System.out.println(Arrays.toString(tablica));

        int[] tab = {-1,-2, 2, 4 ,5 , 5 , 0 , 0 }; //2ujemne, 4 dodatnie, 2 zerowe, 3 nieparzyste, 5 parzyste, 2 maksymalne , 1 minimalna , 4 unikalne
        int[] tab2 = {1,2,2,4,5,5,8,7};
        wypiszTablice(tab, 3, 4);

        System.out.println("Ile nieparzystych: " + ileNieparzystych(tab));
        System.out.println("Ile parzystych: " + ileParzystych(tab));
        System.out.println("Ile dodatnich: " + ileDodatnich(tab));
        System.out.println("Ile ujemnych: " + ileUjemnych(tab));
        System.out.println("Ile zerowych: " + ileZerowych(tab));
        System.out.println("Ile maksymalnych: " + ileMaksymalnych(tab));
        System.out.println("Ile minimalnych: " + ileMinimalnych(tab));
        System.out.println("Ile unikalnych: " + ileUnikalnych(tab));

        System.out.println("Suma dodatnich: " + sumaDodatnich(tab2));
        System.out.println("Suma ujemnych: " + sumaUjemnych(tab2));
        System.out.println("Srednia arytmetyczna: " + sredniaArytmetyczna(tab2));
        System.out.println("Srednia Geometryczna: " + sredniaGeometryczna(tab2));
        System.out.println("Srednia Harmoniczna: " + sredniaHarmoniczna(tab2));

        double a = 2.0, b = 3.0 , c = 1.0;
        double[] wynikiLiniowa = funkcjaLiniowa(tablica, a , b);
        double[] wynikiKwadratowa = funkcjaKwadratowa(tablica, a , b, c);
        double[] wynikiWykladnicza = funkcjaWykladnicza(tablica, a);
        int[] wynikiSignum = funkcjaSignum(tablica);
        System.out.println("Wyniki funkcji liniowej f(x) = " + a + "*x + " + b + ": ");
        for(double w : wynikiLiniowa)
        {
            System.out.println(w + " ");
        }
        System.out.println("Wyniki funkcji kwadratowej f(x) = " + a + "*x^2 + " + b + "*x + " + c + ": ");
        for(double w: wynikiKwadratowa)
        {
            System.out.println(w + " ");
        }
        System.out.println("Wyniki funkcji wykładniczej f(x) = " + a + "^x: ");
        for(double w : wynikiWykladnicza)
        {
            System.out.println(w + " ");
        }

        System.out.println("Wyniki funkcji signum: ");
        for(int w: wynikiSignum)
        {
            System.out.println(w + " ");
        }

    }
    

}
