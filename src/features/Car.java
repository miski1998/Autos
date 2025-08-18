package features;

public class Car {

    private String placa, modelo,color;
    private double precioDia;
    private boolean disponible = true;

//Ciontructor

    public Car(String placa, String modelo, String color, double precioDia) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.precioDia = precioDia;
    }

//GETER SETTERS

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

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void rentar() { disponible = false; }
    public void devolver() { disponible = true; }
    public double calcularPrecio(int dias) { return precioDia * dias; }


}

