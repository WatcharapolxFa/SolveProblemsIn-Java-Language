package creational;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    private BookMetadataFormatter bookMetadataFormatter;
    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit.
        bookMetadataFormatter = getBookMetadataFormatter();
        for (Book book : this.books) {
            bookMetadataFormatter.append(book);
        }
        String BookMetadata =  bookMetadataFormatter.getMetadataString();

        // log
        stream.println(BookMetadata);

        // export to file
        File file = new File("BookMetadata.txt");
        try {
            stream = new PrintStream(file);
            stream.println(BookMetadata);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract BookMetadataFormatter getBookMetadataFormatter();
}
