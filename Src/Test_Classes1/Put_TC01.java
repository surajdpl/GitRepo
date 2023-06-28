package Test_Classes1;

import java.io.IOException;
import java.time.LocalDateTime;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common_API_Methods.Post_API_Methods;
import RequestRepoasitory.Post_Create_Repo;
import RequestRepoasitory.Put_Repo;
import io.restassured.path.json.JsonPath;

public class Put_TC01 
{
	@Test
	public static void extractor() throws IOException
	{
		int statuscode = Post_API_Methods.ResponseStatusCode(Put_Repo.BaseURI(),
				Post_Create_Repo.Post_Resource(), Put_Repo.post_ReqBody());
		System.out.println(statuscode);
		
		String ResponseBody = Post_API_Methods.ResponseBody(Put_Repo.BaseURI(),
				Post_Create_Repo.Post_Resource(), Put_Repo.post_ReqBody());
		System.out.println( ResponseBody);
		
		//Expected RequestBody 
		JsonPath reqb = new JsonPath (Put_Repo.post_ReqBody());
		String req_name = reqb.getString("name");
		String req_job = reqb.getString("job");
	    //int req_id = reqb.getInt("id");
	    //System.out.println("Print ID from req TC01 "+req_id);
		LocalDateTime currentdate =LocalDateTime.now();
		String Expecteddate =currentdate.toString().substring(0,11);;
		
		//Parsing Response Body
		JsonPath resb = new JsonPath (ResponseBody);
		String res_name = resb.getString("name");
		String res_job = resb.getString("job");
		//System.out.println("Print from pharse response TC01"+resb);
		//int res_id = resb.getInt("id");
	    //System.out.println("Print ID from res TC01 "+res_id);
		String res_date = resb.getString("createdAt");
		res_date = res_date.substring(0,11);
		
		//Validating Response Body
		Assert.assertEquals(req_name,res_name);
		Assert.assertEquals(req_job,res_job);
		//Assert.assertEquals(req_id,res_id);
		Assert.assertEquals(Expecteddate,res_date);
		
	}

}
