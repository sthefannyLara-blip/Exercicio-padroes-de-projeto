package FactoryMethod.sem;

public class Main {
    public static void main(String[] args) {
        ReportService service = new ReportService();

        service.exportReport("PDF");
        service.exportReport("CSV");
        service.exportReport("JSON");
    }
}