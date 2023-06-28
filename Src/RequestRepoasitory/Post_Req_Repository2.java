package RequestRepoasitory;

import java.io.IOException;
import java.util.ArrayList;

import Common_API_Methods.Common_Utility_Method;

public class Post_Req_Repository2 {
	
	public static String BaseURI() {
		String baseuri = "https://reqres.in/";
		return baseuri;	
		}
	
	
	public static String Post_Resource() {
		String post_Resource = "/api/users";
		return post_Resource;
		}
	public static String Post_Req_TC01() throws IOException {
		ArrayList<String> Req_Data = Common_Utility_Method.ReadDataExcel("Post_API1", "TC1"); 
		System.out.println(Req_Data);
		String RequestBody ="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		return RequestBody;
	}
	
}


