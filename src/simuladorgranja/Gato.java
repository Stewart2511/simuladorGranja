package simuladorgranja;    
/*
@see Granja
*/
public class Gato {
    private final String MAULLIDO = "Miiaauu";
    public String nombre;
    /*
    @param consectivo Difenciar animales por número
    */
    public Gato(int consecutivo){
        this.nombre = "Gato"+consecutivo;
    }
    /*
    @return MAULLIDO Miiaauu
    */
    public String maullar(){
        return this.MAULLIDO;
    }
    /*
    @return nombre Gato
    */
    public String getNombre(){
        return this.nombre;
    }
}
