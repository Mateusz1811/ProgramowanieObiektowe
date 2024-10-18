import java.util.Random;
import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] tablica = generujTablice(5, 10, 50);
        System.out.println(Arrays.toString(tablica));

        int[] tab = {1,23,45,7,8,0, 10, 22};
        wypiszTablice(tab, 3, 4);
    }

}
