package SistemaRentaVehicular;

import java.util.HashMap;
import java.util.Map;

public class Inventario implements IIventario{
    private Map<String,Auto> autos;

    public Inventario(){
        this.autos = new HashMap<>();
        inicializarInventario();
    }

    private void inicializarInventario(){
        agregarAuto(new Auto("poi-123", "toyota", "verde", 56));
        agregarAuto(new Auto("lkj-123", "nisan", "negro", 66));
        agregarAuto(new Auto("mnb-123", "audi", "blanco", 96));
    }

    @Override
    public void agregarAuto(Auto auto) {
        autos.put(auto.getPlaca(), auto);
    }

    @Override
    public boolean buscarAuto(String placa) {

        return autos.containsKey(placa);
    }

    @Override
    public Auto obtenerAuto(String placa) {
        return autos.get(placa);
    }

    @Override
    public void mostrarInventario() {
        System.out.println("\n" + "=".repeat(70));
        System.out.println("                    INVENTARIO DE AUTOS");
        System.out.println("=".repeat(70));
        System.out.printf("%-15s %-10s %-10s %-8s %-12s%n",
                "PLACA", "MODELO", "COLOR", "PRECIO", "ESTADO");
        System.out.println("-".repeat(70));

        autos.values().stream()
                .sorted((a1, a2) -> a1.getModelo().compareTo(a2.getModelo()))
                .forEach(Auto::mostrarInfo);

        System.out.println("=".repeat(70));
    }
}
