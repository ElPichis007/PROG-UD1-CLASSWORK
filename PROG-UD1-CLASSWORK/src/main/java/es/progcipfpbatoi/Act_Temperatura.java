package es.progcipfpbatoi;

public class Act_Temperatura {
    static final double C1 = -42.379;
    static final double C2 = 2.04901523;
    static final double C3 = 10.14333127;
    static final double C4 = -0.22475541;
    static final double C5 = -0.00683783;
    static final double C6 = -0.05481717;
    static final double C7 = 0.00122874;
    static final double C8 = 0.00085282;
    static final double C9 = -0.00000199;

    public static void main(String[] args) {

        double temperaturaF = 13.0;
        double velocidad = 20.5;
        double humedad = 50.0;

        // Cálculo de la sensación térmica por viento
        int twc = (int) (35.74 + 0.6215 * temperaturaF
                - 35.75 * Math.pow(velocidad, 0.16)
                + 0.4275 * temperaturaF * Math.pow(velocidad, 0.16));

        // Cálculo del índice de calor
        double HI = C1 + C2 * temperaturaF + C3 * humedad
                + C4 * temperaturaF * humedad
                + C5 * Math.pow(temperaturaF, 2)
                + C6 * Math.pow(humedad, 2)
                + C7 * Math.pow(temperaturaF, 2) * humedad
                + C8 * temperaturaF * Math.pow(humedad, 2)
                + C9 * Math.pow(temperaturaF, 2) * Math.pow(humedad, 2);

        // Resultados

        System.out.println("La temperatura es: " + temperaturaF + " °F");
        System.out.println("La velocidad del viento es: " + velocidad + " km/h");
        System.out.println("La humedad relativa es: " + humedad + " %");
        System.out.println(" ");
        System.out.println("La sensación térmica por viento  es: " + twc + " °F");

    }
}
