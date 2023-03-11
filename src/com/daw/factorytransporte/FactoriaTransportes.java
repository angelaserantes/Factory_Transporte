package com.daw.factorytransporte;
/**
 * Clase que se utiliza para obtener el tipo de transporte para un envío
 */
public class FactoriaTransportes {
/**
 *Constantes para los tipos de transporte
 */

    public static final int CAMION = 1;
    public static final int BICICLETA = 2;


/**
 * método que obtiene el tipo de transporte para un envío, mediante un switch
 * @param tipoTransporte
 * @return el objeto transporte correspondiente
 */
    public static Transporte getTransporte(int tipoTransporte){
        switch (tipoTransporte){
            case CAMION:
                return new Camion();
            case BICICLETA:
                return new Bicicleta();
            default:
                return null;
        }
    }
}
