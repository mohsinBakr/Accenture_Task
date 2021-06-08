package Runner;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class RestAssured_RunTest {

    @Test(priority = 1)
    public void RestAPI_GET(){

        RestAssured.baseURI ="http://httpbin.org";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
//        requestParams.put("name", "Zion"); // Cast
//        requestParams.put("age", 35);
//        requestParams.put("salary", 500000);
        request.body(requestParams.toJSONString());
        Response response = request.get("/get");
        int statusCode = response.getStatusCode();
        File schema = new File(System.getProperty("user.dir")+"/schema.json");
        request.given().get("/get").then().assertThat().body(matchesJsonSchema(schema));
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);

    }

    @Test(priority = 2)
    public void RestAPI_POST(){

        RestAssured.baseURI ="http://httpbin.org";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
//        requestParams.put("name", "Zion"); // Cast
//        requestParams.put("age", 35);
//        requestParams.put("salary", 500000);
        request.body(requestParams.toJSONString());
        Response response = request.post("/post");
        int statusCode = response.getStatusCode();
        File schema = new File(System.getProperty("user.dir")+"/schema.json");
        request.given().get("/get").then().assertThat().body(matchesJsonSchema(schema));
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);

    }

    @Test(priority = 3)
    public void RestAPI_PUT(){

        RestAssured.baseURI ="http://httpbin.org";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
//        requestParams.put("name", "Zion"); // Cast
//        requestParams.put("age", 35);
//        requestParams.put("salary", 500000);
        request.body(requestParams.toJSONString());
        Response response = request.put("/put");
        int statusCode = response.getStatusCode();
        File schema = new File(System.getProperty("user.dir")+"/schema.json");
        request.given().get("/get").then().assertThat().body(matchesJsonSchema(schema));
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);

    }


    @Test(priority = 4)
    public void RestAPI_DENY(){

        RestAssured.baseURI ="http://httpbin.org";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        request.body(requestParams.toJSONString());
        Response response = request.get("/deny");
        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);

    }

    @Test(priority = 5)
    public void RestAPI_UTF8(){

        RestAssured.baseURI ="http://httpbin.org";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        request.body(requestParams.toJSONString());
        Response response = request.get("/encoding/utf8");
        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);

    }


    @Test(priority = 6)
    public void RestAPI_HTML(){

        RestAssured.baseURI ="http://httpbin.org";
        RequestSpecification request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        request.body(requestParams.toJSONString());
        Response response = request.get("/html");
        int statusCode = response.getStatusCode();
        System.out.println(response.asString());
        Assert.assertEquals(statusCode, 200);

    }
}
