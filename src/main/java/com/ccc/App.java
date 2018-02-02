package com.ccc;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.bson.Document;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.io.StringWriter;
import java.util.*;

import static java.util.Arrays.asList;
import static spark.Spark.*;

/**
 * play music
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        MusicFactory mf = new DeezerFactory();
        System.out.println(mf.getClass());

        mf.playTrack();
        mf.playTrack();
        mf.playTrack();
        mf.playTrack();
        mf.playTrack();
        mf.playTrack();
        mf.playTrack();

        mf.playAlbum();
        mf.playPlaylist();

        mf = new SpotifyFactory();
        mf.playPlaylist();



        //
        //MusicFactory mf;
        //Scanner in = new Scanner(System.in);
        //
        //do {
        //    System.out.println("please select a provider: deezer / spotify");
        //
        //    String provider = in.nextLine();
        //
        //    switch (provider) {
        //        case "deezer":
        //            mf = new DeezerFactory();
        //            break;
        //        case "spotify":
        //            mf = new SpotifyFactory();
        //            break;
        //        default:
        //            mf = new DeezerFactory();
        //            break;
        //    }
        //    System.out.println("please select a mediaType: track / album / playlist");
        //    String type = in.nextLine();
        //
        //    mf.playMusic(type);
        //}
        //while (true);



        //
        //final Configuration configuration = new Configuration();
        //configuration.setClassForTemplateLoading(App.class, "/");
        //
        //MongoClient client = new MongoClient();
        //
        //MongoDatabase database = client.getDatabase("ccc");
        //final MongoCollection<Document> collection = database.getCollection("music");
        //
        //
        //get("/", (req, res) -> {
        //    StringWriter writer = new StringWriter();
        //    try {
        //        Template template = configuration.getTemplate("playmusic.ftl");
        //
        //        MusicFactory mf = new DeezerFactory();
        //
        //        String id = mf.playTrack();
        //
        //        collection.insertOne(CCCUtil.createDoc(id));
        //        Map<String, String> musicMap = new HashMap<String, String>();
        //        musicMap.put("music", id);
        //
        //        template.process(musicMap, writer);
        //    } catch (Exception e) {
        //        e.printStackTrace();
        //        halt(500);
        //    }
        //    return writer;
        //});

    }
}
