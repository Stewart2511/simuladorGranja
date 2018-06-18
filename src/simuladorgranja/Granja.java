package simuladorgranja;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Granja {
    /*@author kendall*/
    List<Vaca> vacas = new ArrayList();
    List<Perro> perros = new ArrayList();
    List<Oveja> ovejas = new ArrayList();
    List<Gato> gatos = new ArrayList();
    List<Cerdo> cerdos = new ArrayList();
    int contadorVacas = 0;
    int contadorCerdos = 0;
    int contadorOvejas = 0;
    int contadorPerros = 0;
    int contadorGatos = 0;  
    public void simular(){
        while(true){
            Random random = new Random(); 
            int selecion = random.nextInt(5);
            switch(selecion){
                case 0:
                    addVacas();
                    break;
                case 1:
                    addPerros();
                    break;
                case 2:
                    addOvejas();
                    break;
                case 3:
                    addGatos();
                    break;
                case 4:
                    addCerdos();
                    break;
            }
        }
    }
    public void addVacas(){
        int especimen;
        contadorVacas++;
        vacas.add(new Vaca(contadorVacas));
        /*el constructor "Vaca" recibe un int por parametro*/
        Random random = new Random();
        especimen = random.nextInt(vacas.size());
        System.out.println(vacas.get(especimen).getNombre() + " : " + 
            vacas.get(especimen).mujir());   
    }
    public void addPerros(){
        int especimen;
        contadorPerros++;
        perros.add(new Perro(contadorPerros));
        Random random = new Random();
        especimen = random.nextInt(perros.size());
        System.out.println(perros.get(especimen).getNombre() +" : "+
            perros.get(especimen).ladrar());
    }
    public void addOvejas(){
        int especimen;
        contadorOvejas++;
        ovejas.add(new Oveja(contadorOvejas));
        Random random = new Random();
        especimen = random.nextInt(ovejas.size());
        System.out.println(ovejas.get(especimen).getNombre()+" : "+
            ovejas.get(especimen).balido());
    }
    public void addGatos(){
        int especimen;
        contadorGatos++;
        gatos.add(new Gato(contadorGatos));
        Random random = new Random();
        especimen = random.nextInt(gatos.size());
        System.out.println(gatos.get(especimen).getNombre()+" : "+
            gatos.get(especimen).maullar());
    }
    public void addCerdos(){
        int especimen;
        contadorCerdos++;
        cerdos.add(new Cerdo(contadorCerdos));
        Random random = new Random();
        especimen = random.nextInt(cerdos.size());
        System.out.println(cerdos.get(especimen).getNombre()+" : "+
            cerdos.get(especimen).gruñir());
    }
}
