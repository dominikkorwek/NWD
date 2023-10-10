                                        //zadanie 2.3
public class NWD {
    public static void main(String[] args) {

//wpisanie dwoch liczb
        int n = 10;
        int m = -20;
        int pom;
        System.out.println("NWD liczb " + n + " i " + m + " wynosi ");

//algorytm Euklidesa
        while (m != 0) {
            pom = m;
            m = n % m;
            n = pom;
        }
        if(n<0)
            n*=-1;
        System.out.println(n);

    }
}

