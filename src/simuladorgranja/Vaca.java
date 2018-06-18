package simuladorgranja;  
/*
@see Granja
*/
public class Vaca {
    private final String MUJIDO = "Muuuuuu";
    public String nombre;
    /*
    @param consectivo Difenciar animales por número
    */
    public Vaca(int consecutivo){
        this.nombre = "Vaca" + consecutivo;
    }
    /*
    @return MUJIDO Muuuuuu
    */
    public String mujir(){
        return this.MUJIDO;
    }
    /*
    @return nombre Vaca
    */
    public String getNombre(){
        return this.nombre;
    }
}
