package es.iesjandula.huelgasMongo.connections;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

import es.iesjandula.huelgasMongo.utils.Alumno;

public class MongoClientConnection
{

	private MongoDatabase database;
	private MongoClient mongoClient;

	/**
	 * @param connectionString
	 */
	public MongoClientConnection(String connectionString)
	{
		ServerApi serverApi = ServerApi.builder().version(ServerApiVersion.V1).build();

		MongoClientSettings settings = MongoClientSettings.builder()
				.applyConnectionString(new ConnectionString(connectionString)).serverApi(serverApi).build();

		this.mongoClient = MongoClients.create(settings);

		try
		{
			this.database = this.mongoClient.getDatabase("HuelgaMongo");
		} catch (MongoException e)
		{
			System.exit(0);
		}
	}

	public void closeDatabase()
	{
		this.mongoClient.close();
	}

	public MongoDatabase getDatabase()
	{
		return this.database;
	}

	public String findDocument(String collection, String key, String value)
	{
		// Select the collection
		MongoCollection<Document> col = this.database.getCollection(collection);

		// Create the document to specify find criteria
		Document findDocument = new Document(key, value);

		// Document to store query results
		FindIterable<Document> resultDocument = col.find(findDocument);

		// Return the name of the first returned document
		return resultDocument.first().toJson();

	}

	public void uploadAlumnos(List<Alumno> alumnos, String fecha)
	{
		// Select the "people" collection
		MongoCollection<Document> collection = this.database.getCollection("huelga");

		for (Alumno alumno : alumnos)
		{
			Document document = new Document("dni", alumno.getDni()).append("nombre", alumno.getNombre())
					.append("curso", alumno.getCurso()).append("fecha", fecha);
			collection.insertOne(document);
		}

	}
}
