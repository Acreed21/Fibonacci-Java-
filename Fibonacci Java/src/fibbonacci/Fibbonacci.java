package fibbonacci;

public class Fibbonacci {

    public static void main(String[] args) {
        //Byte
        byte a_byte = 1, b_byte = 0;
        double Tiempo2 = 0, Tiempo1 = 0, TiempoTotal = 0;
        double[] arreglo_Byte = new double[10];
        int while_i = 0;
        while (while_i < 10) {
            int i = while_i * 1;
            Tiempo1 = System.nanoTime();
            for (; i < ((while_i + 1) * 1000000); i++) {
                if (b_byte < 0) {
                    System.out.println("Overflow del byte en i = " + i);
                    i = (while_i + 1) * 1000000;
                    while_i = 9;
                }
                b_byte = (byte) (b_byte + a_byte);
                a_byte = (byte) (b_byte - a_byte);
            }
            Tiempo2 = System.nanoTime();
            TiempoTotal = (Tiempo2 - Tiempo1) / 1e9;
            arreglo_Byte[while_i] = TiempoTotal;
            while_i++;
        }
        //Shor
        short a_short = 1, b_short = 0;
        double[] arreglo_short = new double[10];
        while_i = 0;
        while (while_i < 10) {
            int i = while_i * 1;
            Tiempo1 = System.nanoTime();
            for (; i < ((while_i + 1) * 1000000); i++) {
                if (b_short < 0) {
                    System.out.println("Overflow del short en i = " + i);
                    i = (while_i + 1) * 1000000;
                    while_i = 9;
                }
                b_short = (short) (b_short + a_short);
                a_short = (short) (b_short - a_short);
            }
            Tiempo2 = System.nanoTime();
            TiempoTotal = (Tiempo2 - Tiempo1) / 1e9;
            arreglo_short[while_i] = TiempoTotal;
            while_i++;
        }
        //int
        int a_int = 1, b_int = 0;
        double[] arreglo_int = new double[10];
        while_i = 0;
        while (while_i < 10) {
            int i = while_i * 1;
            Tiempo1 = System.nanoTime();
            for (; i < ((while_i + 1) * 1000000); i++) {
                if (b_int < 0) {
                    System.out.println("Overflow del int en i = " + i);
                    i = (while_i + 1) * 1000000;
                    while_i = 9;
                }
                b_int = (b_int + a_int);
                a_int = (b_int - a_int);
            }
            Tiempo2 = System.nanoTime();
            TiempoTotal = (Tiempo2 - Tiempo1) / 1e9;
            arreglo_int[while_i] = TiempoTotal;
            while_i++;
        }
        //Long
        long a_long = 1, b_long = 0;
        double[] arreglo_long = new double[10];
        while_i = 0;
        while (while_i < 10) {
            int i = while_i * 1;
            Tiempo1 = System.nanoTime();
            for (; i < ((while_i + 1) * 1000000); i++) {
                if (b_long < 0) {
                    System.out.println("Overflow del long en i = " + i);
                    i = (while_i + 1) * 1000000;
                    while_i = 9;
                }
                b_long = (b_long + a_long);
                a_long = (b_long - a_long);
            }
            Tiempo2 = System.nanoTime();
            TiempoTotal = (Tiempo2 - Tiempo1) / 1e9;
            arreglo_long[while_i] = TiempoTotal;
            while_i++;
        }
    }
}
