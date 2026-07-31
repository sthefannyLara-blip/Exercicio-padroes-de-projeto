package FactoryMethod.com;

public class PdfReport implements Report {
    @Override
    public void generate() {
        System.out.println("📄 Gerando relatório em formato PDF...");
    }
}
