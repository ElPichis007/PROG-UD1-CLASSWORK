package es.progcipfpbatoi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;

public class Desafio_Financiero {
    public static final int DOLARES = 1000;
    public static final double TASA_CAMBIO = 0.85;
    public static final double TASA_INTERES = 0.05;
    public static final LocalDate FECHA_INICIO = LocalDate.of(2024, 1, 1);
    public static final LocalDate FECHA_FIN = LocalDate.of(2025, 1, 1);

    public static void main(String[] args) {
        System.out.println("Conversion de moneda y calculo de intereses");

        double euros = DOLARES * TASA_CAMBIO;
        
        System.out.println("Cantidad en dolares: " + DOLARES);
        System.out.println("Tipo de cambio (USD A EUR): " + (TASA_CAMBIO * 100) + "%");
        System.out.println("Cantidad en euros: " + euros);
        System.out.println("Fecha de inicio: " + FECHA_INICIO);
        System.out.println("Fecha de fin: " + FECHA_FIN);
        System.out.println("");



    }
}
