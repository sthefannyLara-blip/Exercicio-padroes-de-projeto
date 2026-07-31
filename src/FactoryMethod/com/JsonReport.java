package FactoryMethod.com;

public class JsonReport implements Report {
    @Override
    public void generate() {
        System.out.println("⚙️ Gerando relatório em formato JSON...");
    }
}
