package FactoryMethod.com;

class JsonReportFactory extends ReportFactory {
    @Override
    public Report createReport() {
        return new JsonReport();
    }
}