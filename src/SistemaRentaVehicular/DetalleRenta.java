package SistemaRentaVehicular;

public class DetalleRenta {
    private Auto auto;
    private Cliente cli;
    private int dias;
    private double subtotal;

    public DetalleRenta(Auto auto, Cliente cli, int dias, double subtotal) {
        this.auto = auto;
        this.cli = cli;
        this.dias = dias;
        this.subtotal = auto.getPrecio() * dias;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public int getDias(){
        return dias;
    }

    public void setDias(int dias){
        this.dias = dias;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void mostrarDetalle() {
        System.out.printf("%-20s x%-3s $%-8.2s = $%-10.2f%n",
                auto.getPlaca(), auto.getEstadoAuto(),
                auto.getPrecio(), subtotal);
    }
}
