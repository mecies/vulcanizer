package org.doublem.vulcanizer.greet;

import io.quarkus.test.junit.DisabledOnNativeImage;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

//@QuarkusTest
//@DisabledOnNativeImage
public class GreetingResourceTest {

//    @Test
//    public void testHelloEndpoint() {
//        given()
//          .when().get("/hello")
//          .then()
//             .statusCode(200)
//             .body(is("henlo"));
//    }
//
//    @Test
//    public void testGreetingEndpoint() {
//        String uuid = UUID.randomUUID().toString();
//        given()
//                .pathParam("name", uuid)
//                .when().get("/hello/{name}")
//                .then()
//                .statusCode(200)
//                .body(is("henlo " + uuid));
//    }

}