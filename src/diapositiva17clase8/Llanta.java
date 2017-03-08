
package diapositiva17clase8;


public class Llanta {
    private String marca;
    private String modelo;
    private int tamaño_pulgadas;

    public Llanta(String marca, String modelo, int tamaño_pulgadas) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño_pulgadas = tamaño_pulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamaño_pulgadas(int tamaño_pulgadas) {
        this.tamaño_pulgadas = tamaño_pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTamaño_pulgadas() {
        return tamaño_pulgadas;
    }
    
    
            
}
