package FactoryMethod.sem;

class ReportService {
    public void exportReport(String format) {
        // CÓDIGO ACOPLADO: Se surgir um novo formato (ex: Excel),
        // teremos que modificar esta classe e adicionar mais um case!
        switch (format.toUpperCase()) {
            case "PDF":
                PdfReport pdf = new PdfReport();
                pdf.generate();
                break;
            case "CSV":
                CsvReport csv = new CsvReport();
                csv.generate();
                break;
            case "JSON":
                JsonReport json = new JsonReport();
                json.generate();
                break;
            default:
                throw new IllegalArgumentException("Formato não suportado: " + format);
        }
    }
}