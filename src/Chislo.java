import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Chislo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество чисел");
        int n = Integer.parseInt(br.readLine());
        String l [] = new String[n];
        System.out.println("Введите числа");
        for (int i = 0; i <n ; i++) {
            l[i] =String.valueOf(Integer.parseInt(br.readLine()));
        }
        max(l);
        min(l);

    }
    public static void max(String[] n) {
        String num=n[0];
        int max = n[0].length();
        for (int i = 0; i <n.length ; i++) {
            if (n[i].length()>max) {
                max=n[i].length();
                num=n[i];
            }
        }
        System.out.println("Максимальное число: "+num+" Его длинна: "+max);

    }
    public static void min(String[] n) {
        String num=n[0];
        int min = n[0].length();
        for (int i = 0; i <n.length ; i++) {
            if (n[i].length()<min){
                min=n[i].length();
                num=n[i];
            }
        }
        System.out.println("Минимальное число: "+num+" Его длинна: "+min);
    }
}
