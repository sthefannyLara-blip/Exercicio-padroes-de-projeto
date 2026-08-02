package FactoryMethod2;

public class ConexaoPostgreSQL implements Conexao{
    @Override
    public void conectar() {
        System.out.println("Conectando ao banco de dados PostgreSQL...");
    }
}
