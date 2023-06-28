	package RequestRepoasitory;

public class RetryPost_Req_Repository {
	
	public static String BaseURI() {
		String baseuri = "https://reqres.in/";
		return baseuri;	
		}
	
	
	public static String Post_Resource() {
		String post_Resource = "/api/login";
		return post_Resource;
		}
	public static String Post_Req_TC01() {
		String RequestBody = "{\r\n"
				+ "    \"email\": \"eve.holt@reqres.in\",\r\n"
				+ "    \"password\": \"cityslicka\"\r\n"
				+ "}";
		return RequestBody;
	}
	
}


