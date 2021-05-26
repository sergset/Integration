import java.lang.Math;

public class Methods {
    double rectangle(double x[], double y[])
    {
        double tmp=Math.abs(x[1])-Math.abs(x[0]);
        double wynik=0;
        for(int i=0; i<x.length-1; i++) {
            wynik+=y[i];
        }
        return Math.abs(tmp)*wynik;
    }

    double rectangle2(double x[], double y[])
    {
        double tmp=Math.abs(x[1])-Math.abs(x[0]);
        double wynik=0;
        for(int i=1; i<x.length; i++) {
            wynik+=y[i];
        }
        return Math.abs(tmp)*wynik;
    }

    double trapeze(double x[], double y[])
    {
        double tmp=Math.abs(x[1])-Math.abs(x[0]);
        double wynik=0;
        for(int i=1; i<x.length-1; i++) {
            wynik += y[i];
        }
        wynik+=(y[0]+y[y.length-1])/2;
        return Math.abs(tmp)*wynik;
    }

    double simpson(double x[], double y[])
    {
        double tmp=Math.abs(x[1])-Math.abs(x[0]);
        double wynik=0;
        for(int i=1; i<x.length-1; i++) {
            if(i%2==0) wynik+=2*y[i];
            else wynik+=4*y[i];
        }
        wynik+=(y[0]+y[y.length-1]);
        return Math.abs(tmp)*wynik/3;
    }

}
