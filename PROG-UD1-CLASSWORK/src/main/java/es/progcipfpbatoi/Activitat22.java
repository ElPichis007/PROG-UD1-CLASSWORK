package es.progcipfpbatoi;



public class Activitat22 {
    public static final double C1 = -42.379;
    public static final double C2 = 2.04901523;
    public static final double C3 = 10.14333127;
    public static final double C4 = -0.22475541;
    public static final double C5 = -6.83783e-3;
    public static final double C6 = -5.481717e-2;
    public static final double C7 = 1.22874e-3;
    public static final double C8 = 8.5282e-4;
    public static final double C9 = -1.99e-6;

    static final double temperaturaC = 13.0;
    static final double velocidadKMH = 20.5;
    static final double humedad = 0.5;

    public static void main(String[] args) {

        double temperaturaF = temperaturaC * 9.0 / 5.0 + 32;
        double velocidadMPH = velocidadKMH * 1.609344;

        // Cálculo de la sensación térmica por viento
        double twc = (35.74 + 0.6215 * temperaturaF
                - 35.75 * Math.pow(velocidadMPH, 0.16)
                + 0.4275 * temperaturaF * Math.pow(velocidadMPH, 0.16));

        // Cálculo del índice de calor
        double HI = C1 + C2 * temperaturaF + C3 * humedad
                + C4 * temperaturaF * humedad
                + C5 * Math.pow(temperaturaF, 2)
                + C6 * Math.pow(humedad, 2)
                + C7 * Math.pow(temperaturaF, 2) * humedad
                + C8 * temperaturaF * Math.pow(humedad, 2)
                + C9 * Math.pow(temperaturaF, 2) * Math.pow(humedad, 2);

        double promedio = (twc + HI)/2;
        int resultado = (int) Math.round(promedio);
        resultado = (resultado - 32) * 5 / 9;

        // Resultados

        System.out.println("La temperatura es: " + temperaturaC + " °C");
        System.out.println("La velocidad del viento es: " + velocidadKMH + " km/h");
        System.out.println("La humedad relativa es: " + humedad + " %");
        System.out.println(" ");
        System.out.println("La sensación térmica por viento  es: " + resultado + " °C");

    }
}
