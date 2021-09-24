public class Principal {

    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        animal1.setNombre("Luly");
        animal1.setFamilia("Caninos");

        animal2.setNombre("kiko");
        animal2.setFamilia("Felinos");

        System.out.println("Animal1 se llama: "+animal1.getNombre()+" y pertenece a la familia de los "+animal1.getFamilia());
        System.out.println("Animal2 se llama: "+animal2.getNombre()+" y pertenece a la familia de los "+animal2.getFamilia());

    }
}
