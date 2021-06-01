package com.alex;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Metodos {

    Scanner re = new Scanner(System.in);
    DecimalFormat dec = new DecimalFormat("#.000");

    float n, a, b, C, D, h, A;

    float m, c, d, E, F, G, h2;

    float resultado;

    int r = (int) n;

    public void leerValoresPrimerIntegral() {
        this.A = 0;

        System.out.println("Ingrese el total de iteraciones[n]");
        this.n = re.nextFloat();

        System.out.println("Ingrese el limite inferior [a] ");
        this.a = re.nextFloat();
        System.out.println("Ingrese el limite superior  [b] ");
        this.b = re.nextFloat();

        System.out.println("Ingrese el valor de [C] ");
        this.C = re.nextFloat();

        System.out.println("Ingrese el valor de [D] ");
        this.D = re.nextFloat();
        this.h = (b - a) / n;
        this.A = a;

        System.out.println("El valor de h es:" + h);

    }

    public void leerValoresSegundaIntegral() {
        System.out.println("Ingrese el total de iteraciones[m]");
        m = re.nextFloat();

        System.out.println("Ingrese el limite inferior [C] ");
        C = re.nextFloat();

        System.out.println("Ingrese el limite superior  [D] ");
        D = re.nextFloat();

        System.out.println("Ingrese el valor de [F] ");
        F = re.nextFloat();
        System.out.println("Ingrese el valor de [G] ");
        G = re.nextFloat();

        this.h = (D - C) / m;
        this.c = C;

        System.out.println("El valor de h es:" + h);

    }

    public void CalculosGenerales() {
        int r = (int) n;
        r = r + 1;
        System.out.println("Valor actual de r: " + r);

        float dim[] = new float[r];

        for (int i = 1; i < (r - 1); i++) {
            a = a + h;
            dim[i] = a;
        }

        dim[0] = A;
        dim[r - 1] = b;
        System.out.println("\n");

        for (int i = 0; i < r; i++) {

            System.out.println("El valor de x" + i + "=" + dec.format(dim[i]));

        }
        float fi, fa, fb, sum, multiplica;
        sum = 0;

        for (int i = 0; i < r; i++) {

            fi = (float) sqrt(C * dim[i] + D);

            dim[i] = fi;
        }

        fa = dim[0];
        fb = dim[r - 1];

        for (int i = 0; i < r; i++) {
            System.out.println("El valor de f" + i + "(x)= " + dec.format(dim[i]));
        }

        for (int i = 1; i < (r - 1); i++) {
            multiplica = dim[i] * 2;
            sum = sum + multiplica;
        }
        System.out.println("\n");

        this.resultado = ((h / 2) * (sum + fa + fb));
        System.out.println("Resultado:" + this.resultado);
        System.out.println("\n");

    }

    public void calculosIntegralDoble() {

        float n, a, b, C, D, h, A, E, F, G, m, h2, c;
        A = 0;

        System.out.println("Ingrese el total de iteraciones[n]");
        n = re.nextFloat();

        System.out.println("Ingrese el total de iteraciones[m]");
        m = re.nextFloat();

        System.out.println("Ingrese el limite inferior [C] ");
        C = re.nextFloat();
        System.out.println("Ingrese el limite superior  [D] ");
        D = re.nextFloat();

        System.out.println("Ingrese el segundo limite inferior [a] ");
        a = re.nextFloat();
        System.out.println("Ingrese el  segundo limite superior  [b] ");
        b = re.nextFloat();

        System.out.println("Ingrese el valor de [E] ");
        E = re.nextFloat();

        System.out.println("Ingrese el valor de [F] ");
        F = re.nextFloat();
        System.out.println("Ingrese el valor de [G] ");
        G = re.nextFloat();

        h = (b - a) / n;
        A = a;
        h2 = (D - C) / m;
        c = C;

        System.out.println("DY");

        System.out.println("El valor de h es:" + h);

        int r = (int) n;
        r = r + 1;

        float dim[] = new float[r];

        for (int i = 1; i < (r - 1); i++) {
            a = a + h;
            dim[i] = a;
        }

        dim[0] = A;
        dim[r - 1] = b;
        System.out.println("\n");

        for (int i = 0; i < r; i++) {
            System.out.println("El valor de x" + i + "=" + dec.format(dim[i]));

        }
        float fi, fa, fb, sum, resultado, multiplica;
        sum = 0;

        for (int i = 0; i < r; i++) {
            fi = (float) Math.cos(G * dim[i]);
            dim[i] = fi;
        }
        fa = dim[0];
        fb = dim[r - 1];
        for (int i = 0; i < r; i++) {
            System.out.println("El valor de f" + i + "(x)=" + dec.format(dim[i]));
        }

        for (int i = 1; i < (r - 1); i++) {
            multiplica = dim[i] * 2;
            sum = sum + multiplica;
        }
        System.out.println("\n");

        resultado = ((h / 2) * (sum + fa + fb));
        System.out.println("Resultado:" + resultado);

        System.out.println("DX");

        System.out.println("El valor de h es:" + h2);

        int r2 = (int) m;
        r2 = r2 + 1;

        float dim2[] = new float[r2];

        for (int u = 1; u < (r2 - 1); u++) {
            C = C + h2;
            dim2[u] = C;
        }
        dim2[0] = c;
        dim2[r2 - 1] = D;
        System.out.println("\n");

        for (int u = 0; u < r2; u++) {
            System.out.println("El valor de x" + u + "=" + dec.format(dim2[u]));

        }

        float fi2, fa2, fb2, sum2, resultado2, multiplica2;
        sum2 = 0;

        for (int u = 0; u < r2; u++) {
            fi2 = (float) (E * Math.sin(F * dim2[u]) * resultado);
            dim2[u] = fi2;
        }
        fa2 = dim2[0];
        fb2 = dim2[r2 - 1];

        for (int u = 0; u < r2; u++) {
            System.out.println("El valor de f" + u + "(x)=" + dec.format(dim2[u]));
        }

        for (int u = 1; u < (r2 - 1); u++) {
            multiplica2 = dim2[u] * 2;
            sum2 = sum2 + multiplica2;
        }
        System.out.println("\n");

        resultado2 = ((h2 / 2) * (sum2 + fa2 + fb2));
        System.out.println("Resultado:" + resultado2);

    }

    public void Pausa(int opc) {
        System.out.println("Digita cualquier NÚMERO para continuar\n");
        opc = re.nextInt();
    }
}
