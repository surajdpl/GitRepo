package RequestRepoasitory;

import java.io.IOException;
import java.util.ArrayList;

import Common_API_Methods.Common_Utility_Method;

public class Post_Create_Repo
{
	public static String BaseURI()
	{
		String baseuri = "https://reqres.in";
		return baseuri;
	}
	
	public static String Post_Resource()
	{
		String post_Resource ="/api/users";
		return post_Resource ;
	}
	
	public static String post_ReqBody() throws IOException
	{
		ArrayList<String> Req_Data = Common_Utility_Method.ReadDataExcel("Post_Ref", "TC2");
		
		String Req_name = Req_Data.get(1);
		String Req_job = Req_Data.get(2);
		
		String RequestBody = "{\r\n"
				+ "    \"name\": \""+Req_name+"\",\r\n"
				+ "    \"job\": \""+Req_job+"\"\r\n"
				+ "}\r\n"
				+ "";
		return RequestBody;
	}

}
