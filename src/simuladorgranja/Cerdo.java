package simuladorgranja;    
/*
@see Granja
*/
public class Cerdo {
    private final String GRUNIDO = "Oinggg";
    public String nombre;
    /*
    @param consectivo Difenciar animales por número
    */
    public Cerdo(int consecutivo){
        this.nombre = "Cerdo"+consecutivo;
    }
    /*
    @return GRUNIDO Oinggg
    */
    public String gruñir(){
        return this.GRUNIDO;
    }
    /*
    @return nombre Cerdo
    */
    public String getNombre(){
        return this.nombre;
    }
}
