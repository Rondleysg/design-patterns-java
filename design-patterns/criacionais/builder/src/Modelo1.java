public class Modelo1 extends FogueteBuilder{


    @Override
    public void buildTipoMotor() {
        foguete.tipoMotor="Tipo 1";
    }

    @Override
    public void buildDescModelo() {
        foguete.descModelo="Modelo tipo 1 de motor Tipo 1";
    }

    @Override
    public void buildPreco() {
        foguete.preço=5000000;
    }

    @Override
    public void buildVelMax() {
        foguete.velMaxima=28440;
    }

    @Override
    public void buildDescMotor() {
        foguete.descMotor="Tipo do motor: Tipo 1\nPotencia do motor: 3 mil";
    }

    @Override
    public void buildAnoDeFabricacao() {
        foguete.anoDeFabricacao=2008;
    }

    @Override
    public void buildModelo() {
        foguete.modelo="Modelo 1";
    }

    @Override
    public void buildQntdMotor() {
        foguete.qntdMotor=6;
    }

    @Override
    public void buildQntdTanquesCombustivel() {
        foguete.qntdTanquesCombustivel=3;
    }

    @Override
    public void buildNumAssentos() {
        foguete.numAssentos=6;
    }
}
