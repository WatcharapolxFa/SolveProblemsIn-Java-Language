package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter getBookMetadataFormatter() {
        try {
            return new CSVBookMetadataFormatter();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}