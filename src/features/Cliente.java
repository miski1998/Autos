package features;

public class Cliente {
    private String name;
    private String DNI;
    private String genero;
    int edad;

    public Cliente(String name, String DNI, String genero, int edad) {
        this.name = name;
        this.DNI = DNI;
        this.genero = genero;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
