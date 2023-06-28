package Test_Classes1;

import java.io.IOException;
import java.time.LocalDateTime;

import org.testng.Assert;
import org.testng.annotations.Test;

import Common_API_Methods.Patch_API_Methods;
import RequestRepoasitory.Patch_Repo;
import io.restassured.path.json.JsonPath;

public class Patch_TC01 
{
	@Test 
	public static void extractor() throws IOException
	{
		int statuscode = Patch_API_Methods.ResponseStatusCode(Patch_Repo.BaseURI(),
				Patch_Repo.Post_Resource(), Patch_Repo.post_ReqBody());
		System.out.println(statuscode);
		
		String ResponseBody = Patch_API_Methods.ResponseBody(Patch_Repo.BaseURI(),
				Patch_Repo.Post_Resource(), Patch_Repo.post_ReqBody());
		System.out.println( ResponseBody);
		
		//Expected RequestBody 
		JsonPath reqb = new JsonPath (Patch_Repo.post_ReqBody());
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
		String res_date = resb.getString("updatedAt");
		res_date = res_date.substring(0,11);
		
		//Validating Response Body
		Assert.assertEquals(req_name,res_name);
		Assert.assertEquals(req_job,res_job);
		//Assert.assertEquals(req_id,res_id);
		Assert.assertEquals(Expecteddate,res_date);
		
	}

}
