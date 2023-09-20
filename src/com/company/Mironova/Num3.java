package com.company.Mironova;

public class Num3{
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + a[i];
        }

        System.out.println(sum);
        {
            int[] b = {1, 3, 5};
            int n = 0;
            int i = 0;
            while (i < 3) {
                n = n + b[i];
                i++;
            }
            System.out.println(n);
            {
                int[] c = {1, 3, 5};
                int sum1 = 0;
                int p = 0;
                do {
                    sum1 = sum1 + c[p];
                    p++;
                }
                while (p < 3);
                System.out.println(sum1);
            }
        }
    }
}
