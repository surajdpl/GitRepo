package Common_API_Methods;

import static io.restassured.RestAssured.given;

import io.restassured.RestAssured;

public class Post_API_Methods {
	
	public static int ResponseStatusCode(String BaseURI,String Resource,String RequestBody) {
		
		RestAssured.baseURI = BaseURI;
		
		int statusCode = given().header("content-type","application/json")
				.body(RequestBody).when().post(Resource).then().extract()
				.statusCode();
		return statusCode ;
	}
		
	public static String ResponseBody(String BaseURI,String Resource,String RequestBody) {
			
		RestAssured.baseURI = BaseURI;
			
		String Responsebody = given().header("content-type","application/json")
				.body(RequestBody).when().post(Resource).then().extract()
				.response().asPrettyString();
		return Responsebody;
		

	}

}
