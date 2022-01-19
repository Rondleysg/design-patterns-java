public class Cliente {

    public static void main(String[] args) {

        Director nasa = new Director(new Modelo1());
        nasa.ConstruirFoguete();
        System.out.println(nasa.toString());
        nasa=new Director(new Modelo2());
        nasa.ConstruirFoguete();
        System.out.println(nasa.toString());
    }

}
