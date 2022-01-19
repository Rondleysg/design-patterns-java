public abstract class FogueteBuilder {

    protected FogueteProduto foguete;

    public FogueteBuilder(){
        foguete=new FogueteProduto();
    }

    public abstract void buildTipoMotor();
    public abstract void buildDescModelo();
    public abstract void buildPreco();
    public abstract void buildVelMax();
    public abstract void buildDescMotor();
    public abstract void buildAnoDeFabricacao();
    public abstract void buildModelo();
    public abstract void buildQntdMotor();
    public abstract void buildQntdTanquesCombustivel();
    public abstract void buildNumAssentos();

    public FogueteProduto getFoguete(){
        return foguete;
    }

}
