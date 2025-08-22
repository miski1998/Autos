package SistemaRentaVehicular;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inv = new Inventario();
        SistemaRenta systema = new SistemaRenta(inv);


        while (true) {
            System.out.println("\n=== Sistema de Alquiler de Autos ===");
            System.out.println("1. Agregar auto");
            System.out.println("2. Agregar cliente");
            System.out.println("3. Alquilar auto");
            System.out.println("4. Devolver auto");
            System.out.println("5. Mostrar autos");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer


            //systema.addCar(new Auto("poi-321", "toyota", "verde", 56));
            //systema.addCar(new Auto("lkj-321", "nisan", "negro", 66));
            //systema.addCar(new Auto("mnb-321", "audi", "blanco", 96));

            systema.addCliente(new Cliente("123456789","Arturo","masculino","987654321"));
            systema.addCliente(new Cliente("321654987","Andre","masculino","986532532"));
            systema.addCliente(new Cliente("987654321","Antonio","masculino","321654987"));

            switch (opcion) {
                case 1:
                    systema.addCar();
                    break;
                case 2:
                    String DNI, name, email, telefono;

                    System.out.print("DNI : ");
                    DNI = scanner.nextLine();

                    System.out.print("Nombre : ");
                    name = scanner.nextLine();

                    System.out.print("E-mail : ");
                    email= scanner.nextLine();

                    System.out.print("Telefono: ");
                    telefono = scanner.nextLine();

                    systema.addCliente(new Cliente(DNI,name,email,telefono));
                    System.out.println("Cliente agregado");

                    break;
                case 3:
                    System.out.print("Placa del auto a alquilar: ");
                    String placaAl = scanner.nextLine();
                    Auto car = systema.buscaPlaca(placaAl);

                    System.out.print("DNI del cliente: ");
                    String dniCl = scanner.nextLine();
                    Cliente cli = systema.buscarClientePorDNI(dniCl);

                    System.out.print("Días de alquiler: ");
                    int dias = scanner.nextInt();

                    systema.rentarAuto(car,cli,dias);
                    System.out.println("Alquiler registrado ");


                    break;
                case 4:
                    systema.devolverAuto();
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
