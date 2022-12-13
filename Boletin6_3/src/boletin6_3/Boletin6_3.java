
package boletin6_3;

/**
 *
 * @author Adrian
 */
public class Boletin6_3 {

    /*
    aqui se pondrán todas las instrucciones y metodos que queremos que se ejecuten
    */
    public static void main(String[] args) {
        
        Circulo objC1 = new Circulo();
        objC1.setRadio(15);
        
        System.out.println("area"+objC1.calcularArea());
        System.out.println("longitud"+objC1.calcularLongitud());
        
        
        Circulo objC2 = new Circulo (10);
        System.out.println("area"+objC2.calcularArea());
        System.out.println("longitud"+objC2.calcularLongitud());

    }
    
}
