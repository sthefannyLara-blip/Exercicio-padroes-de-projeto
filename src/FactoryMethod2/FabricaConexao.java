package FactoryMethod2;

public abstract class FabricaConexao {
    private abstract Conexao criarConexao();
    public void executarConexao(){
    Conexao conexao = criarConexao();
    conexao.conectar();
    }
}
