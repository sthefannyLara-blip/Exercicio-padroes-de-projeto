package FactoryMethod.com;

// 3. A classe base da fábrica (Criador)
abstract class ReportFactory {

    // ESTE É O FACTORY METHOD:
    // Ele promete retornar um Report, mas deixa o 'new' para os filhos.
    public abstract Report createReport();

    // Método utilitário que usa o relatório criado
    public void export() {
        Report report = createReport(); // Obtém o produto da fábrica
        report.generate();              // Executa a ação
    }
}