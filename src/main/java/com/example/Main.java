package com.example;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        byte i;
        byte j;
        float dva_na_tri = 2/3;

        short[] a = {6,8,10,12,14,16};
        double[] x = new double[19];
        for (i = 0; i<19; i++) x[i] =(double)(random()*20)-14;
        double[][] p = new double[6][19];
        for (i = 0; i<6; i++){
            for (j = 0; j<19; j++){
                switch (a[i]) {
                    case 8:
                        p[i][j] = (dva_na_tri) / pow(0.25 / pow(E, x[j]), 2);
                        break;
                    case 10:
                    case 12:
                    case 14:
                        p[i][j] = atan(1 / acos(pow(((((x[j] - 4) / 2) * E) + 1), 2)));
                        break;
                    default:
                        p[i][j] = cos(log10(pow((pow(tan(x[j]), 2) / (pow(abs(x[j]), 0.5) + 1)), 2)));
                        break;
                }

            }

        }
        float f1;
        for (double[] doubles : p) {
            System.out.println();
            for (double aDouble : doubles) {
                f1 = (float) aDouble;
                System.out.printf("%.5f", f1);
                System.out.print(" ");
            }
            System.out.println(' ');
        }
        }


}
