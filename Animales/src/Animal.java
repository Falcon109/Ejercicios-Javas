public class Animal {

    private int patas;
    private int orejas;
    private int ojos;
    private String familia;
    private String nombre;

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal() {
        this.patas = 4;
        this.orejas = 2;
        this.ojos = 2;
    }

    public Animal(int patas, int orejas, int ojos) {
        this.patas = patas;
        this.orejas = orejas;
        this.ojos = ojos;
    }



}
