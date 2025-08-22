package SistemaRentaVehicular;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String DNI;
    private String name;
    private String email;
    private String telfono;
    private List<Auto> autosRentados;

    public Cliente(String DNI, String name, String email, String telfono) {
        this.DNI = DNI;
        this.name = name;
        this.email = email;
        this.telfono = telfono;
        this.autosRentados = new ArrayList<>();
    }

    public void agregarAutoRentado(Auto autoRentado) {
        autosRentados.add(autoRentado);
    }

    public void removerAutoRentado(Auto autoRentado) {
        autosRentados.remove(autoRentado);
    }




    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelfono() {
        return telfono;
    }

    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }

    public List<Auto> getAutoRentado() {
        return autosRentados;
    }

    public void setAutoRentado(List<Auto> autoRentado) {
        this.autosRentados = autoRentado;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dni='" + DNI + '\'' +
                ", nombreCompleto='" + name + '\'' +
                ", email='" + email + '\'' +
                ", autosRentados=" + autosRentados.size() +
                '}';
    }
}
