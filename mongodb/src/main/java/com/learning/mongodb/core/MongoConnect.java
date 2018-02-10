package com.learning.mongodb.core;

import java.net.UnknownHostException;
import com.mongodb.MongoClient;

public class MongoConnect extends AggregationExample
{
    private MongoConnect() {}
    
    public static MongoClient dbInstance = null;
    
    public static MongoClient getDbInstance() {
        try {
            if (dbInstance != null ) {
                dbInstance = new MongoClient("localhost", 27017);
            }
            
            return dbInstance;
            
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("Unable to start application");
            System.exit(0);
        }
        
        return dbInstance;
    }
    
}
