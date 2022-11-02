package creational;

public class JSONBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter getBookMetadataFormatter() {
        return new JSONBookMetadataFormatter();
    }
}
