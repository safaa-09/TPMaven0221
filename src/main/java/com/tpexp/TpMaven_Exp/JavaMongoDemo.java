package com.tpexp.TpMaven_Exp;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class JavaMongoDemo {

	
	public static void main(String[] args) {
	
		try {
		//Connecting to Database		
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		
		//Creating Database
		MongoDatabase db = mongoClient.getDatabase("javapoint");
		
		//Creating Collection
		MongoCollection<Document> table = db.getCollection("employee");
		
		//Creating Document
		Document doc = new Document("name", "Peter John")
    				.append("age", 25)
		            .append("nationality","Filipino");
		
		doc.append("id", 12);
		
		// Inserting Data
		table.insertOne(doc);
	}catch(Exception e) {
	 System.out.println(e);	
	}
	}
}
