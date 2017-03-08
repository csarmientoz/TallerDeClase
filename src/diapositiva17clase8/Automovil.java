
package diapositiva17clase8;


public class Automovil {
    private String marca;
    private int año;
    private String modelo;
    private Llanta[] llanta;
    private Puerta[] door;
    private Motor[] motor;

    public Automovil(String marca, int año, String modelo, Llanta[] llanta, Puerta[] door, Motor[] motor) {
        this.marca = marca;
        this.año = año;
        this.modelo = modelo;
        this.llanta = new Llanta[4];
        this.door = new Puerta[4];
        this.motor = new Motor[1];
    }

    public String getMarca() {
        return marca;
    }

    public int getAño() {
        return año;
    }

    public String getModelo() {
        return modelo;
    }

    public Llanta[] getLlanta() {
        return llanta;
    }

    public Puerta[] getDoor() {
        return door;
    }

    public Motor[] getMotor() {
        return motor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setLlanta(Llanta[] llanta) {
        this.llanta = llanta;
    }

    public void setDoor(Puerta[] door) {
        this.door = door;
    }

    public void setMotor(Motor[] motor) {
        this.motor = motor;
    }

   
    

   
}


