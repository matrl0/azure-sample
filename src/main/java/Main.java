import com.azure.storage.blob.*;
import com.azure.storage.blob.models.*;

public class Main
{
    public static void main(String[] args)
    {
        String connectionString = "";
	String containerName = "";
        BlobContainerClient blobContainerClient = new BlobContainerClientBuilder().connectionString(connectionString).containerName(containerName).buildClient();
        for (BlobItem blobItem : blobContainerClient.listBlobs()) {
	    System.out.println("This is the blob name: " + blobItem.getName());
	}
    }
}
