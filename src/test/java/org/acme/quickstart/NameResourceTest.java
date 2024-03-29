package org.acme.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class NameResourceTest {

    @Test
    public void testRandomNameEndpoint() {
        given()
          .when().get("/name/random")
          .then()
             .statusCode(200);
    }

}