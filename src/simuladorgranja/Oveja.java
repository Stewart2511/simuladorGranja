package simuladorgranja;    
/*
@see Granja
*/
public class Oveja {
    private final String BALIDO="Behehehhe";
    public String nombre;
    /*
    @param consectivo Difenciar animales por número
    */
    public Oveja(int consecutivo){
        this.nombre = "Oveja"+consecutivo;
    }
    /*
    @return BALIDO Behehehhe
    */
    public String balido(){
        return this.BALIDO;
    }
    /*
    @return nombre Oveja
    */
    public String getNombre(){
        return this.nombre;
    }
}
