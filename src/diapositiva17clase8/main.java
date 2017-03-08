

package diapositiva17clase8;


public class main {

    
    public static void main(String[] args) {
        Llanta[] llanta=new Llanta[4];
        llanta[0]= new Llanta("michelin","ray",48);
        llanta[1]= new Llanta("michelin","ray",48);
        llanta[2]= new Llanta("michelin","ray",45);
        llanta[3]= new Llanta("michelin","ray",45);
       
        Puerta[] door = new Puerta[4];
        door[0] = new Puerta("doblada");
        door[1] = new Puerta("doblada");
        door[2] = new Puerta("doblada");
        door[3] = new Puerta("doblada");
        
        Motor[] motor = new Motor[1];
        motor[1]= new Motor("0508",20);
        
        Automovil vehiculo = new Automovil("Chevrolet",1997,"Camaro",llanta,door,motor);
        
    }
    
}
