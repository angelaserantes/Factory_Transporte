package com.daw.factorytransporte;
/**
 * La clase Bicicleta implementa la interfaz Transporte, y así calcula el coste total de envío y el tipo de embalaje para una bicicleta
 */
public class Bicicleta implements Transporte {


 /**
  * Calcula el costetotal de envío de una bicicleta, dependiendo del código postal
  * @param cp
  * @return coste total de envío
  */
    @Override
    public float costeTotal(int cp) {
        if (cp >= 36201 && cp<= 36212){
            return 8.75f;
        } else if (cp>= 36213 && cp<=36331) {
            return 15.75f;
        }else{
            return 40.15f;
        }
    }


/**
 * Calcula el tipo de embalaje para el envío en una bicicleta, teniendo cuenta las dimensiones y el peso
 * @param x
 * @param y
 * @param z
 * @param peso
 * @return el tipo de embalaje, siendo 0 un palet, 1 una caja pequeña, 2 un envoltorio de cartón
 */
    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso){
        if (peso >= 25.0f){
            return 0; //palet
        } else if (x * y * z >= 3549.6f ) {
            return 1; //caja pequeña
        }else{
            return 2; //envoltorio de cartón
        }
    }
}
