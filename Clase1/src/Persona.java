import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
    private String apellido;
    //Guarda una fecha el LocalDate
    private LocalDate edad;
    private String mail;

    //En este caso solo se nos pide obligatorio el nombre y el apellido
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String calcularNombreCompleto() {
        return this.nombre + ", " + this.apellido;
    }

    //Para saber si es mayor o menor de edad
    public boolean esMayorDeEdad() {
        //Comparamos dos fechas con betweenn nos dara la difernecia entre las dos fechas
        //Primer parametro fecha a la que le quiero restar, en este caso la fecha de nacimiento
        //Luego pasamos el anio en curso
        return Period.between(this.edad, LocalDate.of(2022, 5, 16)).getYears() >= 18;
    }

}
