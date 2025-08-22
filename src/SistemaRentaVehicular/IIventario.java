package SistemaRentaVehicular;

public interface IIventario {
    void agregarAuto(Auto auto);
    boolean buscarAuto(String placa);
    Auto obtenerAuto(String placa);
    void mostrarInventario();
}