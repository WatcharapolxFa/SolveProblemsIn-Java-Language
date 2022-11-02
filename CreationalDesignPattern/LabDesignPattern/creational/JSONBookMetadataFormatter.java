package creational;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
import org.json.JSONObject;
import org.json.JSONArray;

import java.io.StringWriter;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONObject Data;
    private JSONArray List;

    public JSONBookMetadataFormatter(){
        this.Data = new JSONObject();
        this.List = new JSONArray();
    }

    @Override
    public BookMetadataFormatter reset() {
        List.clear();
        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONObject obj = new JSONObject();
        JSONArray author_list = new JSONArray();

        for(String author_name : b.getAuthors()){
            author_list.put(author_name);
        }
        obj.put("Book id",b.getISBN());
        obj.put("Title",b.getTitle());
        obj.put("Publisher",b.getPublisher());
        obj.put("Authors",author_list);

        List.put(obj);
        Data.put("Book",List);
        return this;
    }

    @Override
    public String getMetadataString() {
        return Data.toString(4);
    }
}
