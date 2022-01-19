public class Modelo2 extends FogueteBuilder{


    @Override
    public void buildTipoMotor() {
        foguete.tipoMotor="Tipo 2";
    }

    @Override
    public void buildDescModelo() {
        foguete.descModelo="Modelo tipo 2 de motor Tipo 2";
    }

    @Override
    public void buildPreco() {
        foguete.preço=8000000;
    }

    @Override
    public void buildVelMax() {
        foguete.velMaxima=30000;
    }

    @Override
    public void buildDescMotor() {
        foguete.descMotor="Tipo do motor: Tipo 2\nPotencia do motor: 5 mil";
    }

    @Override
    public void buildAnoDeFabricacao() {
        foguete.anoDeFabricacao=2016;
    }

    @Override
    public void buildModelo() {
        foguete.modelo="Modelo 2";
    }

    @Override
    public void buildQntdMotor() {
        foguete.qntdMotor=10;
    }

    @Override
    public void buildQntdTanquesCombustivel() {
        foguete.qntdTanquesCombustivel=5;
    }

    @Override
    public void buildNumAssentos() {
        foguete.numAssentos=6;
    }
}
