package FactoryMethod.com;

public class CsvReportFactory extends ReportFactory{
    @Override
    public Report createReport() {
        return new CsvReport();
    }
}
