package FactoryMethod2;

public class ConexaoMySQL implements Conexao {
    @Override
    public void conectar() {
        System.out.println("Conectando ao banco de dados MySQL...");
    }

}
