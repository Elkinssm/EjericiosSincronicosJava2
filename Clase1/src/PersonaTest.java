import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Librerias para test desde la linea 1 a la 7
public class PersonaTest {
    //Creamos las personas
    Persona persona;
    Persona persona1;
    Persona persona2;

    //Llamamos al metodo antes de ejecutar cualquier test
    @BeforeEach
    //Creamos los objetos de tipo persona
    //before es el nombre del metodo
    void doBefore() {
        persona = new Persona("Javier", "Test");
        //Como el constructor no lo pide le seteamos la edad (fecha nacimiento)
        persona.setEdad(LocalDate.of(2000, 4, 12));
        persona1 = new Persona("Vale", "Nov");
        //Seteamos edad (fecha nacimiento)
        persona1.setEdad(LocalDate.of(2003, 9, 20));
        persona2 = new Persona("Tito", "Perez");
        //Seteamos edad (fecha nacimiento)
        persona2.setEdad(LocalDate.of(2019, 12, 04));
    }

    @Test
        //Creamos un metodo que agrupa y ejecuta todos los test
    void getNombreCompleto() {
        //Si retorna el valor de los strings dara true si no false
        //Parametro 1 es el valor que esperamos
        assertEquals("Javier, Test", persona.calcularNombreCompleto());
        assertEquals("Vale, Nov", persona1.calcularNombreCompleto());
        assertEquals("Tito, Perez", persona2.calcularNombreCompleto());

    }

    //Al ejecutar el test es true
    @Test
    void getEsMayorDe18() {
        assertEquals(persona.esMayorDeEdad(), true);
        assertEquals(persona1.esMayorDeEdad(), false);
        assertEquals(persona2.esMayorDeEdad(), false);
    }

}
