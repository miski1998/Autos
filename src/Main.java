package features;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SytemRent systema = new SytemRent();


        while (true) {
            System.out.println("\n=== Sistema de Alquiler de Autos ===");
            System.out.println("1. Agregar auto");
            System.out.println("2. Agregar cliente");
            System.out.println("3. Alquilar auto");
            System.out.println("4. Devolver auto");
            System.out.println("5. Mostrar autos disponibles");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            systema.addCar(new Car("poi-123", "toyota", "verde", 56));
            systema.addCar(new Car("lkj-123", "nisan", "negro", 66));
            systema.addCar(new Car("mnb-123", "audi", "blanco", 96));

            systema.addCliente(new Cliente("Arturo","123456789","masculino",23));
            systema.addCliente(new Cliente("Jesus","321654987","masculino",32));
            systema.addCliente(new Cliente("Andre","987654321","masculino",78));

            switch (opcion) {
                case 1:
                    String  placa, modelo,color;
                    double precioDia;

                    System.out.print("Placa: ");
                    placa = scanner.nextLine();

                    System.out.print("Modelo: ");
                    modelo = scanner.nextLine();

                    System.out.print("Color: ");
                    color = scanner.nextLine();

                    System.out.print("Precio: ");
                    precioDia = scanner.nextDouble();

                    systema.addCar(new Car(placa, modelo, color, precioDia));
                    System.out.println("Auto agregado.");
                    break;
                case 2:
                    String name, DNI, genero;
                    int edad;

                    System.out.print("Nombre : ");
                    name = scanner.nextLine();

                    System.out.print("DNI : ");
                    DNI = scanner.nextLine();

                    System.out.print("Genero : ");
                    genero = scanner.nextLine();

                    System.out.print("Edad: ");
                    edad = scanner.nextInt();

                    systema.addCliente(new Cliente(name,DNI,genero,edad));
                    System.out.println("Cliente agregado");

                    break;
                case 3:
                    System.out.print("Placa del auto a alquilar: ");
                    String placaAl = scanner.nextLine();
                    Car car = systema.buscaPlaca(placaAl);

                    System.out.print("DNI del cliente: ");
                    String dniCl = scanner.nextLine();
                    Cliente cli = systema.buscarClientePorDNI(dniCl);

                    System.out.print("Días de alquiler: ");
                    int dias = scanner.nextInt();

                    systema.rentarAuto(car,cli,dias);
                    System.out.println("Alquiler registrado ");

                    break;
                case 4:
                    System.out.println("=========================");
                    System.out.println("||                     ||");
                    System.out.println("|| No desarrollado :c  ||");
                    System.out.println("||                     ||");
                    System.out.println("=========================");
                    break;
                case 5:
                    systema.mostrarAutosDisponibles();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
            }
        }
    }
}
