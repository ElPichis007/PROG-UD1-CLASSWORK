package es.progcipfpbatoi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;



public class Desafio_Financiero {
    public static final BigDecimal DOLARES = BigDecimal.valueOf(1000);
    public static final BigDecimal TASA_CAMBIO = BigDecimal.valueOf(0.85);
    public static final BigDecimal TASA_INTERES = BigDecimal.valueOf(0.05);

    public static final LocalDate FECHA_INICIO = LocalDate.of(2024, 1, 1);
    public static final LocalDate FECHA_FIN = LocalDate.of(2025, 1, 1);

    public static void main(String[] args) {
        System.out.println("Conversion de moneda y calculo de intereses");

        BigDecimal euros = DOLARES.multiply(TASA_CAMBIO);

        Long dias = ChronoUnit.DAYS.between(FECHA_INICIO, FECHA_FIN);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'del' yyyy");

        System.out.println("Cantidad en dolares: " + DOLARES.setScale(2) + "$");
        System.out.println("Tipo de cambio (USD A EUR): " + (TASA_CAMBIO.multiply(BigDecimal.valueOf(100)).setScale(0)) + "%");
        System.out.println("Cantidad en euros: " + euros +"€");
        System.out.println("Fecha incio: " + FECHA_INICIO.format(formatter));
        System.out.println("Fecha de fin: " + FECHA_FIN.format(formatter));
        System.out.println("Dias entre fechas: " + dias);

        System.out.println("Tasa Interes: " + (TASA_INTERES.multiply(BigDecimal.valueOf(100)).setScale(0)) + "%");

        System.out.println("Interes generado: " + euros.multiply(TASA_INTERES).multiply(BigDecimal.valueOf(dias)).divide(BigDecimal.valueOf(365), 2, BigDecimal.ROUND_HALF_UP)+ "€");



    }
}
