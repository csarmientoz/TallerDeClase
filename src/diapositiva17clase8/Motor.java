
package diapositiva17clase8;


public class Motor {
    private String numero_serie;
    private int cilindros;

    public Motor(String numero_serie, int cilindros) {
        this.numero_serie = numero_serie;
        this.cilindros = cilindros;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public int getCilindros() {
        return cilindros;
    }
    
    
}
