package TestNG;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import  io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
public class PostMethod {
	
	private String id;
	private String name;
	private String name1;

	@Test(priority=1)
	public void PostMethod1() {
		Map<String, Object>  jsonAsMap = new HashMap<String, Object>();
		jsonAsMap.put("name", "Vikasssssssssssarrrrrrr");
		jsonAsMap.put("salary", "5200");
		jsonAsMap.put("age", "30");
	
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";

		Response ress = RestAssured.given().body(jsonAsMap).post();
		Assert.assertEquals(ress.getStatusCode(), 200);
		String json	=	ress.getBody().asString();
		System.out.println(json);
		JsonPath jsonPath = new JsonPath(json);		
				id = jsonPath.getString("id");
		
		 System.out.println(id);
		 name=jsonPath.getString("name");

		System.out.println(name);
		
}
	@Test(priority=2)
	public void test2() {
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee/"+id;
	Response hee= RestAssured.given().get();
	String str2= hee.getBody().asString();
	
System.out.println(str2);
		
	JsonPath jsonPath = new JsonPath(str2);
		
		String id1 = jsonPath.getString("id");
		System.out.println(id1);
		
		
	
		Assert.assertEquals(id1,id );
		
	}
	@Test(priority=3)
	public void test3() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employees";
		
	Response hrr	=RestAssured.given().get();
	String str3=hrr.getBody().asString();
	System.out.println(str3);
	
	
		
	}
	
@Test(priority=4)
	public void test4() {
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/update/"+id;
		
		
	
		 String requestBody = "{\r\n" + 
				 " \"name\":\"Vikasssssssssarrrr\",\r\n" + 
				 " \"salary\":\"1123\",\r\n" + 
				 " \"age\":\"23\"\r\n" + 
				 "}";
		
		
		Response response = null;
		 response = RestAssured.given()
		 .body(requestBody)
		 .put();
		 System.out.println("Response :" + response.asString());
		 System.out.println("Status Code :" + response.getStatusCode());
		 String json1	=	response.getBody().asString();
			System.out.println(json1);
			JsonPath jsonPath = new JsonPath(json1);
			name1=jsonPath.getString("name");
			
		 System.out.println("Does Reponse contains 'tammy'? :" + response.asString().contains("tammy"));
		 System.out.println(name1);
		Assert.assertNotSame(name, name1);
		 
		 
		 }
	@Test(priority=5)
	public void Test5() {
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/employee/"+id;
		Response ress2=RestAssured.given().get();
		String str5= ress2.getBody().asString();
		System.out.println(str5);
JsonPath jsonPath = new JsonPath(str5);
		
		String id2 = jsonPath.getString("id");
		System.out.println(id2);
		
		Assert.assertEquals(id2, id);
	}
@Test(priority=6)
	public void Test6() {
	RestAssured.baseURI="http://dummy.restapiexample.com/api/v1/delete/"+id;
	Response response = null;

	response = RestAssured.given().delete();

	System.out.println("Response :" + response.asString());
	System.out.println("Status Code :" + response.getStatusCode());

Assert.assertEquals(response.getStatusCode(), 200);

	
	}
@Test(priority=7)
public void Test7() {
	RestAssured.baseURI= "http://dummy.restapiexample.com/api/v1/employee/"+id;
	Response response23= RestAssured.given().get();
	String str10 =response23.getBody().asString();
	System.out.println(str10);
	Assert.assertEquals(response23.getStatusCode(), 200);
	

}
		 
}
	
		
	

		