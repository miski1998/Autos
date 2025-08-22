package SistemaRentaVehicular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaRenta {
    private  Inventario inventario;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Rental> alquileres = new ArrayList<>();

    public SistemaRenta(Inventario inventario) {
        this.inventario = inventario;
    }

    //private List<Auto> autos = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void addCar() {
        System.out.println("Ingrese placa:");
        String placa = scanner.nextLine();
        System.out.println("Ingrese modelo:");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese color:");
        String color = scanner.nextLine();
        System.out.println("Ingrese precio por día:");
        double precio = Double.parseDouble(scanner.nextLine());

        Auto nuevoAuto = new Auto(placa, modelo, color, precio);
        inventario.agregarAuto(nuevoAuto);
        System.out.println("Auto agregado al inventario exitosamente.");
    }


    public void addCliente(Cliente cli) {
        clientes.add(cli);
    }


    public void rentarAuto(Auto auto, Cliente cli, int dias) {
        if (auto.getEstadoAuto() == EstadoAuto.DISPONIBLE ){
            Rental r = new Rental(auto,cli,dias);
            alquileres.add(r);
            auto.setEstadoAuto(EstadoAuto.PRESTADO);
            r.mostrarDetalles();
        } else if (auto.getEstadoAuto() == EstadoAuto.REPARACION ) {
            System.out.println(" Auto en el Taller !!");
        } else if (auto.getEstadoAuto() == EstadoAuto.RESERVADO ) {
            System.out.println(" Auto Reservado !!");
        } else{
            System.out.println("Auto Prestado !!");
        }
    }
    public void devolverAuto() {
        System.out.println("Ingrese placa del vehículo a devolver:");
        String placaD = scanner.nextLine();

        Auto auto = buscaPlaca(placaD);
        if (auto == null) {
            System.out.println("Placa de auto no registrado en nuestro sistema.");
            return;
        }
        if (auto.getEstadoAuto() != EstadoAuto.PRESTADO) {
            System.out.println("Este vehículo no está actualmente alquilado.");
            return;
        }


        // Actualizar estado, remover rental y confirmar
        auto.setEstadoAuto(EstadoAuto.DISPONIBLE);
        alquileres.remove(auto);
        System.out.println("Vehículo con placa " + placaD + " ha sido devuelto exitosamente.");
    }

    public void mostrarAutosDisponibles() {
        inventario.mostrarInventario();
    }

    public Auto buscaPlaca(String placa){
        return inventario.obtenerAuto(placa);
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
