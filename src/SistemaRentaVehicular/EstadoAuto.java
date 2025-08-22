package SistemaRentaVehicular;

public enum EstadoAuto {
    DISPONIBLE("Disponible para prestamo", "1"),
    PRESTADO("Actualmente prestado","2"),
    RESERVADO("Reservado para otro usuario", "3"),
    REPARACION("En reparacion", "4");

    private final String description;
    private final  String opcion;

    EstadoAuto(String description, String opcion) {
        this.description = description;
        this.opcion = opcion;
    }

    public String getDescription() {
        return description;
    }

    public String getOpcion() {
        return opcion;
    }
}
