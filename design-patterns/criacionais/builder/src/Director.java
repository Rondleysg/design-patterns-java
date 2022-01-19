public class Director {

    protected FogueteBuilder nasa;

    public Director(FogueteBuilder nasa){
        this.nasa=nasa;
    }

    public void ConstruirFoguete(){
        nasa.buildAnoDeFabricacao();
        nasa.buildDescModelo();
        nasa.buildDescMotor();
        nasa.buildModelo();
        nasa.buildNumAssentos();
        nasa.buildPreco();
        nasa.buildQntdMotor();
        nasa.buildQntdTanquesCombustivel();
        nasa.buildTipoMotor();
        nasa.buildVelMax();
    }

    public FogueteProduto getFoguete(){
        return nasa.getFoguete();
    }

    public String toString(){
        System.out.println("---------------------------");
        String toString="Modelo do foguete: "+nasa.getFoguete().modelo+";\nDescrição do modelo: "+nasa.getFoguete().descModelo+
                "\nTipo do motor: "+nasa.getFoguete().tipoMotor+"; Descrição do motor: "+nasa.getFoguete().descMotor+"; Quantidade de motores: "+nasa.getFoguete().qntdMotor+
                "\nPreço do foguete: "+nasa.getFoguete().preço+"\nVelocidade máxima(Km/h): "+nasa.getFoguete().velMaxima+
                "\nQuantidade de Tanques de combustiveis: "+nasa.getFoguete().qntdTanquesCombustivel+
                "\nNúmero de assentos: "+nasa.getFoguete().numAssentos+"\nAno de fabricação: "+nasa.getFoguete().anoDeFabricacao;
        return toString;
    }


}
