package es.iesjandula.huelgasMongo.connections;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

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

		MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(new ConnectionString(connectionString)).serverApi(serverApi).build();
		
		this.mongoClient = MongoClients.create(settings);
		
		try
		{
			this.database = this.mongoClient.getDatabase("BananaSL");
		} catch (MongoException e)
		{
			System.exit(0);
		}
	}
	
	public void closeDatabase() {
		this.mongoClient.close();
	}
	
	public MongoDatabase getDatabase() {
		return this.database;
	}
}
