package com.daw.factorytransporte;
/**
 * Interfaz transporte que define los métodos para calcular el coste total del envío y el tipo de embalaje
 */
public interface Transporte {

   /**
    * Calcula el coste total para un código postal
    * @param cp
    */
   public float costeTotal(int cp);


   /**
    * Calcula el tipo de embalaje para un envío dependiendo de las dimensiones y el peso del paquete
    * @param x
    * @param y
    * @param z
    * @param peso
    */
   public int tipoEmbalaje(float x, float y, float z, float peso);

}
