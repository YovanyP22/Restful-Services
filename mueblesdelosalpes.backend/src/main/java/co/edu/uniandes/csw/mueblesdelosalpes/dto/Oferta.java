
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

public class Oferta {

    //-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    /**
     * Id de la oferta.
     */
    private long idOferta;

    /**
     * Valor de la oferta.
     */
    private double oferta;

    /**
     * Referencia del mueble.
     */
    private long referenciaMueble;

    /**
     * Tipo de usuario
     */
    private String userOfertante;

    public Oferta() {
    }

    public Oferta(long idOferta, String userOfertante, long referenciaMueble, double oferta ) {
        this.idOferta = idOferta;
        this.userOfertante = userOfertante;
        this.referenciaMueble = referenciaMueble;
        this.oferta = oferta;
        
    }
    
    
    public long getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(long idOferta) {
        this.idOferta = idOferta;
    }

    public double getOferta() {
        return oferta;
    }

    public void setOferta(double oferta) {
        this.oferta = oferta;
    }

    public long getReferenciaMueble() {
        return referenciaMueble;
    }

    public void setReferenciaMueble(long referenciaMueble) {
        this.referenciaMueble = referenciaMueble;
    }

    public String getUserOfertante() {
        return userOfertante;
    }

    public void setUserOfertante(String userOfertante) {
        this.userOfertante = userOfertante;
    }
    
    
    
}
