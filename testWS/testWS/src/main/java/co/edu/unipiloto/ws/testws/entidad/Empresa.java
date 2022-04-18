
package co.edu.unipiloto.ws.testws.entidad;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name ="Empresa")
@XmlType(propOrder={"sumaSalario", "promedioSalario"})
public class Empresa {
    int sumaSalario;
    int promedioSalario;

    public Empresa() {
    }

     @XmlElement
    public int getSumaSalario() {
        return sumaSalario;
    }

    public void setSumaSalario(int sumaSalario) {
        this.sumaSalario = sumaSalario;
    }
     @XmlElement
    public int getPromedioSalario() {
        return promedioSalario;
    }

    public void setPromedioSalario(int promedioSalario) {
        this.promedioSalario = promedioSalario;
    }
    
}
