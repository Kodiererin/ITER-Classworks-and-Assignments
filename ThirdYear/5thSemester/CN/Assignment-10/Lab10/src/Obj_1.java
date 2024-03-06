import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Obj_1 {
	public static void main(String[] args) {
        try {
        	System.out.println("Name : Ujjwal Kumar\r Registration Number : 2141011063\n\n");
        	Thread.sleep(1000);
            String urlStr = "https://en.wikipedia.org/wiki/Wiki";
            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            System.out.println(response.toString());
            System.out.println("Name : Ujjwal Kumar\r Registration Number : 2141011063\n\n");
            reader.close();
            connection.disconnect();

        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}
