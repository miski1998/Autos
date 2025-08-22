package SistemaRentaVehicular;

public class Auto implements IVehiculo{

    private String placa, modelo,color;
    private double precioDia;
    private int stock;
    private EstadoAuto estadoAuto = EstadoAuto.DISPONIBLE;

//Ciontructor

    public Auto(String placa, String modelo, String color, double precioDia) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.precioDia = precioDia;
    }

    @Override
    public double getPrecio() {
        return precioDia;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public void mostrarInfo() {
        System.out.printf("%-15s %-10s $%-8s $: %-5f  %s%n",
                placa, modelo, color, precioDia, estadoAuto);
    }

    //public void rentar() { disponible = false; }
    //public void devolver() { disponible = true; }
    //public double calcularPrecio(int dias) { return precioDia * dias; }




    public EstadoAuto getEstadoAuto() {
        return estadoAuto;
    }

    public void setEstadoAuto(EstadoAuto estadoAuto) {
        this.estadoAuto = estadoAuto;
    }
}

