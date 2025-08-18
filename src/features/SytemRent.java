package features;

import java.util.ArrayList;
import java.util.List;

public class SytemRent {

    private List<Car> autos = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Rental> alquileres = new ArrayList<>();

    public void addCar(Car c) {

        autos.add(c);
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }


    public void rentarAuto(Car c, Cliente cli, int dias) {
        if (c.isDisponible()){
            Rental r = new Rental(c,cli,dias);
            alquileres.add(r);
            c.setDisponible(false);
            double monto = c.getPrecioDia()*dias;
            System.out.println("Auto alquilado a "+cli.getName()+". Costo total : "+monto);
        }
        else{
            System.out.println("No disponible");
        }
    }
    public void devolverAuto(Car c) {
        /*...*/
    }
    public void mostrarAutosDisponibles() {
        for(Car c: autos){
            if(c != null && c.isDisponible()){
                System.out.println("=======");
                System.out.println(c.getPlaca());
                System.out.println(c.getModelo());
                System.out.println(c.getColor());
                System.out.println("=======");
            }
        }
    }

    public Car buscaPlaca(String placa){
        for(Car c : autos){
            if(c.getPlaca().equalsIgnoreCase(placa)){
                return c;
            }
            else {
                System.out.println("Placa no encontrada!!");
            }
        }
        return null;
    }

    public Cliente buscarClientePorDNI(String dni) {
        for (Cliente cli : clientes) {
            if (cli.getDNI().equalsIgnoreCase(dni)) {
                return cli;
            }
            else {
                System.out.println("DNI no encontrado!!");
            }
        }
        return null;
    }

}
