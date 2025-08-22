package SistemaRentaVehicular;

public interface IVehiculo {
    String getPlaca();
    double getPrecio();
    String getModelo();
    String getColor();
    int getStock();
    void setStock(int stock);
    EstadoAuto getEstadoAuto();
}
