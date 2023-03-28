package com.daw.factorytransporte;
/**
 * Clase principal que ejecuta el programa y emplea la factoría de transportes para obtener el tipo de transporte, creando los objetos
 */



public class App {
    static Transporte tipo;
    public static void main(String[] args) {
        //Tipo de transporte camión
        tipo = FactoriaTransportes.getTransporte(FactoriaTransportes.CAMION);
        float costeCamion = tipo.costeTotal(36213);
        int embalajeCamion = tipo.tipoEmbalaje(24.0f, 17, 8.7f, 20.0f);
        System.out.println("El tipo de transporte es un camión y el coste es " + costeCamion + " y el embalaje es  " + embalajeCamion );

        //Tipo de transporte bicicleta
        tipo = FactoriaTransportes.getTransporte(FactoriaTransportes.BICICLETA);
        float costeBicicleta = tipo.costeTotal(36201);
        int embalajeBicicleta = tipo.tipoEmbalaje(20.0f, 12, 4.7f, 25.0f);
        System.out.println("El tipo de transporte es una bicicleta y el coste es " + costeBicicleta + " y el embalaje es  " + embalajeBicicleta );

        //Tipo de transporte de barco
        tipo = FactoriaTransportes.getTransporte(FactoriaTransportes.BARCO);
        float costeBarco = tipo.costeTotal(36204);
        int embalajeBarco = tipo.tipoEmbalaje(21.03f, 11, 4.5f, 26.1f);
        System.out.println("El tipo de transporte es barco y el coste es " + costeBarco + " y el embalaje es  " + embalajeBarco );
    }
}
