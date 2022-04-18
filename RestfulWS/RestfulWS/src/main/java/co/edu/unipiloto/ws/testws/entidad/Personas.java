package co.edu.unipiloto.ws.testws.entidad;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlRootElement(name ="Persona")
@XmlType(propOrder={"id", "Nombre", "Edad", "Salario"})
public class Personas {
    private int id;
    private String Nombre;
    private int Edad;
    private int Salario;
    
    public Personas(){
        
    }
    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @XmlElement
    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }
    
    @XmlElement
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    @XmlElement
    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
}
