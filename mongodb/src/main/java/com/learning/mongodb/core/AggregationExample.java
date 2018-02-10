package com.learning.mongodb.core;

import java.net.UnknownHostException;
import java.util.List;
import javax.swing.text.Document;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;

/**
 * MongoDB query and aggregation learning
 *
 */
public class AggregationExample 
{
    public static void main( String[] args ) throws UnknownHostException
    {
        MongoClient mongo = new MongoClient("localhost", 27017);
        
        List<String> dbs = mongo.getDatabaseNames();
        for(String db: dbs) {
            System.out.println(db);
        }  
        
        DB database = mongo.getDB("agg");
        DBCollection collection = database.getCollection("zips");
        
        DBCursor documents = collection.find();
//        for(documents.hasNext()) {
//            System.out.println(documents.next());
//        }
        
        
//        List<Document> pipeline = asList(new Document("$group", 
//                new Document("_id", "$state").append("totalPop", new Document("$sum", "$pop")) )
//        
//        
//        
        
    }

    private static List<Document> asList(Document document) {
        // TODO Auto-generated method stub
        return null;
    }
}
