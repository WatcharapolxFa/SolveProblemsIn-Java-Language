package creational;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter{
    @Override
    public BookMetadataFormatter getBookMetadataFormatter() {
        try {
            return new XMLBookMetadataFormatter();
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
