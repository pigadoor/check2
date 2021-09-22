import static java.lang.Math.*;

public class Main {


    public static void main(String[] args) {
        short[] a = new short[9];
        for (short i = 4, k = 0; i<=20; i+=2,k++){
            a[k] = i;
        }


        int max = 12+13, min = 12;
        float[] x = new float[11];
        for (int i = 0; i<=10; i++){
            x[i] = (float)random() * max - min;
        }


        int X = 9, Y = 11;
        double[][] A = new double[X][Y];

        for (int i = 0; i<X; i++){
            for (int j = 0; j<Y; j++){
                if (a[i]==6){
                    A[i][j] = cbrt(tan(cos(x[j])));
                } else if (a[i]==8 | a[i]==12 | a[i]==14 | a[i]==20){
                    A[i][j] = log(pow(tan(cos(asin((x[j]+0.5)/25))),2));
                } else {
                    A[i][j] = pow(E,pow(((double)2/3)/pow(pow(E,x[j]),pow(2*x[j],3)/2)-1,3));
                }

            }
        }

        for(int i = 0; i < X; i++){
            for(int j = 0; j < Y; j++){
                System.out.printf("%.4f",A[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
