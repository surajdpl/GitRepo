package Test_Classes1;



import org.testng.annotations.Test;

import Common_API_Methods.Get_API_Methods;
import RequestRepoasitory.Get_Repo;

public class Get_TC01 
{
	@Test 
	
	public static void extractor ()
	{
		
		int statusCode = Get_API_Methods.ResponseStatusCode(Get_Repo.BaseURI(),
				Get_Repo.Get_Resource());
		System.out.println(statusCode);
		
		String ResponseBody = Get_API_Methods.ResponseBody(Get_Repo.BaseURI(),
				Get_Repo.Get_Resource() ) ;
		System.out.println(ResponseBody);		
	}

}
