package simuladorgranja;
/*
@see Granja
*/
public class Perro {        
    private final String LADRIDO = "guaauu";
    public String nombre;
    /*
    @param consectivo Difenciar animales por número
    */
    public Perro(int consecutivo){
        this.nombre = "Perro"+consecutivo;
    }
    /*
    @return LADRDO guaauu
    */
    public String ladrar(){
        return this.LADRIDO;
    }
    /*
    @return nombre Perro
    */
    public String getNombre(){
        return this.nombre;
    }
}  
