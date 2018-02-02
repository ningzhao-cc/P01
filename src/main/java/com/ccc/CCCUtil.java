package com.ccc;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Date;


/**
 * Created by Ning on 2/1/18.
 */
public class CCCUtil {
    public static int creatInt() {
        return (int) (Math.random() * 10000000);
    }

    public static void postDoc(Document doc) {
        MongoClient client = new MongoClient();

        MongoDatabase database = client.getDatabase("ccc");
        final MongoCollection<Document> collection = database.getCollection("music");

        collection.insertOne(doc);
    }

    public static Document createDoc(String id) {
        Document doc = new Document();
        String[] strs = id.split(":");
        String provider = strs[0];
        String type = strs[1];

        doc.put("id", id);
        doc.put("provider", provider);
        doc.put("type", type);

        return doc;
    }
}
