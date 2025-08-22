package SistemaRentaVehicular;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Rental implements IRenta{

    private List<DetalleRenta> detalles;
    private LocalDateTime fecha;
    private int nroRenta;
    private static int contadorVentas = 1;

    public Rental(Auto auto, Cliente cli, int dias) {
        this.detalles = new ArrayList<>();
        this.fecha = LocalDateTime.now();
        this.nroRenta = contadorVentas++;
    }


    @Override
    public double calcularTotal() {
        return detalles.stream().mapToDouble(DetalleRenta::getSubtotal).sum();
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\n" + "=".repeat(60));
        System.out.println("              TICKET DE RENTA #" + nroRenta);
        System.out.println("=".repeat(60));
        System.out.println("Fecha: " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println("-".repeat(60));

        for (DetalleRenta detalle : detalles) {
            detalle.mostrarDetalle();
        }

        System.out.println("-".repeat(60));
        System.out.printf("TOTAL: $%.2f%n", calcularTotal());
        System.out.println("=".repeat(60));
    }
}
