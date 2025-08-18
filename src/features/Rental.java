package features;

public class Rental {

    private Car car;
    private Cliente cliente;
    private int days;
    private boolean retornado;

    public Rental(Car car, Cliente cliente, int days) {
        this.car = car;
        this.cliente = cliente;
        this.days = days;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public boolean getReturned(){
        return retornado;
    };
    public void setReturned(boolean retornado){
        this.retornado = retornado;
    }


}
