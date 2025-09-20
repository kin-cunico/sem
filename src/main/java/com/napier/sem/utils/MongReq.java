package com.napier.sem.utils;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

/**
 * MongReq: a class to handle the request to start a new mongodb client, as well
 * as setting and getting documents from the mongo db database
 */
public class MongReq {

    // Earlier this client was initialized locally with "localhost", "27000"
    private final MongoClient mongoClient = new MongoClient("mongo-dbserver");
    private final MongoDatabase mongoDatabase = mongoClient.getDatabase("mydb");
    private final MongoCollection<Document> collection = mongoDatabase.getCollection("test");

    /**
     * addDoc: add a document to our collection inside our mongodb
     * by appending a newly created document to our collection
     * TODO: refactor this code into 2 different methods:
     * TODO: 1st a method to create new documents,
     * TODO: 2nd a method to append the document to our collection
     */
    public void addDoc() {
        Document doc = new Document("name", "Kevim Sim")
                .append("class", "DevOps")
                .append("year", "2025")
                .append("result", new Document("CW", 95).append("EX", 85));

        collection.insertOne(doc);
    }

    /**
     * Constructor: in this case, I am only calling the addDoc() method when initializing the constructor
     * TODO: refactor this constructor to receive parameters in the future. MAYBE?
     */
    public MongReq() {
        addDoc();
    }

    /**
     * getDoc: getter method to retrieve a document
     * @return a Document object
     * TODO: refactor this getter to return a JSON rather than a Document object
     */
    public Document getDoc() {
        Document myDoc = collection.find().first();
        return myDoc;
    };
}
