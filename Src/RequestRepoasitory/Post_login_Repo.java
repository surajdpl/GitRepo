	package RequestRepoasitory;

import java.io.IOException;
import java.util.ArrayList;

import Common_API_Methods.Common_Utility_Method;

public class Post_login_Repo {
	
	public static String BaseURI() {
		String baseuri = "https://reqres.in/";
		return baseuri;	
		}
	
	
	public static String Post_Resource() {
		String post_Resource = "/api/user";
		return post_Resource;
		}
	public static String Post_Req_TC01() throws IOException {
		ArrayList<String> Req_Data = Common_Utility_Method.ReadDataExcel("Post_Ref", "TC10"); 
		//System.out.println(Req_Data);
		String Req_email = Req_Data.get(1);
		//System.out.println("Print From Repo "+Req_email);
		String Req_pwd = Req_Data.get(2);
		//System.out.println("Print From Repo " +Req_pwd);
		String RequestBody = "{\r\n"
				+ "    \"email\": \""+Req_email+"\",\r\n"
				+ "    \"password\": \""+Req_pwd+"\"\r\n"
				+ "}";
		return RequestBody;
	}
	
}


