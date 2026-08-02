package FactoryMethod2;

public class CriadorPostgreSQL extends FabricaConexao {
   public Conexao criarConexao() {
       return new ConexaoPostgreSQL();
   }
}
