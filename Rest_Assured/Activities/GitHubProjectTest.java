package activities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class GitHubProjectTest {
    // SSH Key to test with
    String sshKey = "ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAAAgQC8qqAp4aKKkjstHxB4CfjeeU9LaJj+EUufO6imi7TBa3ckn+AD/Tkr7BUSXn6FhAlEUgx1oKdaAaAll0IzbjuL0iIcWJbRq6r74tSM93LRYkeAbD7r6Mo025FyyD9ExfLSd/lK8mtZ5/W36kAvvjZhDHBfoSa5JyJGzugydsvRCQ==";
    int sshKeyId;

    // Request specification
    RequestSpecification requestSpec = new RequestSpecBuilder().
            setBaseUri("https://api.github.com/ManjushaGuntupalli/keys").
            addHeader("Authorization", "token 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").
            addHeader("Content-Type", "application/json").
            build();

    // Response Specification
    ResponseSpecification responseSpec = new ResponseSpecBuilder().
            expectResponseTime(lessThan(4000L)).
            expectBody("key", equalTo(sshKey)).
            expectBody("title", equalTo("TestAPIKey")).
            build();

    @Test(priority = 1)
    public void postRequestTest() {
        // Path: https://api.github.com/user/keys
        // Request body
        Map<String, String> reqBody = new HashMap<>();
        reqBody.put("title", "TestAPIKey");
        reqBody.put("key", sshKey);

        // Generate response
        Response response = given().spec(requestSpec).body(reqBody).when().post();

        // Extract the id and save it
        sshKeyId = response.then().extract().path("id");

        // Assertions
        response.then().statusCode(201).spec(responseSpec);
    }

    @Test(priority = 2)
    public void getRequestTest() {
        // Path: https://api.github.com/user/keys/{keyId}
        // Generate response and assert
        given().spec(requestSpec).pathParam("keyId", sshKeyId).
        when().get("/{keyId}").
        then().statusCode(200).spec(responseSpec);
    }

    @Test(priority = 3)
    public void deleteRequestTest() {
        // Path: https://api.github.com/user/keys/{keyId}
        // Generate response and assert
        given().spec(requestSpec).pathParam("keyId", sshKeyId).
        when().delete("/{keyId}").
        then().statusCode(201).time(lessThan(3000L));
    }

}