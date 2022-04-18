
package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.persistencia.mock.ServicioPersistenciaMock;
import co.edu.uniandes.csw.mueblesdelosalpes.dto.Oferta;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioPersistenciaMockLocal;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;

/**
 * Implementacion de los servicios de las ofertas en el sistema.
 *
 * @author asus
 */
@Stateless
public class ServicioOfertaMock implements IServicioOfertaMockLocal {
    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------

    /**
     * Interface con referencia al servicio de persistencia en el sistema
     */
    private IServicioPersistenciaMockLocal persistencia;

    /**
     * Lista con las ofertas
     */
    private ArrayList<Oferta> ofertas;

    //-----------------------------------------------------------
    // Constructor
    //-----------------------------------------------------------
    /**
     * Constructor sin argumentos de la clase
     */
    public ServicioOfertaMock() {
        ofertas = new ArrayList<Oferta>();
        persistencia = new ServicioPersistenciaMock();
    }

    //-----------------------------------------------------------
    // Get y set
    //-----------------------------------------------------------
    /**
     * Agrega una oferta al sistema
     *
     * @param oferta Nueva oferta
     */
    @Override
    public void agregarOferta(Oferta oferta) {

        {
            try {
                persistencia.create(oferta);
            } catch (OperacionInvalidaException ex) {
                Logger.getLogger(ServicioOfertaMock.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    @Override
    public List<Oferta> darOfertas() {
        return persistencia.findAll(Oferta.class);
    }

    @Override
    public void elimarOferta(long id) {
        Oferta of = (Oferta) persistencia.findById(Oferta.class, id);
        try {
            persistencia.delete(of);
        } catch (OperacionInvalidaException ex) {
            Logger.getLogger(ServicioOfertaMock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
