package FactoryMethod.com;

class PdfReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new PdfReport();
    }
}