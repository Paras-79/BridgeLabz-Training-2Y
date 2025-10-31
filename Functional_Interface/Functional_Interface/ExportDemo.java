interface DataExporter {
    void exportData();

    default void exportToJSON() {
        System.out.println("Exporting data in JSON format...");
    }
}

class CSVExporter implements DataExporter {
    public void exportData() {
        System.out.println("Exporting data in CSV format...");
    }
}

class PDFExporter implements DataExporter {
    public void exportData() {
        System.out.println("Exporting data in PDF format...");
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        DataExporter exporter = new CSVExporter();
        exporter.exportData();
        exporter.exportToJSON();
    }
}
