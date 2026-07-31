package FactoryMethod.com;

public class CsvReport implements Report{
    @Override
    public void generate() {
        System.out.println("📊 Gerando relatório em formato CSV...");
    }
}
