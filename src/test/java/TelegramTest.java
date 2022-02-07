import org.junit.Test;
import ru.dasreda.RestSRC;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class TelegramTest extends RestSRC {

    @Test
    public void getRequest() {
        given().get(getURL)
                .then()
                .log().all()
                .assertThat().body("result.first_name", equalTo("dasreda"))
                .statusCode(200);
    }

    @Test
    public void postRequest(){
        given()
                .header("Content-type", "application/json")
                .and()
                .body(json)
                .when()
                .post(postURL)
                .then()
                .log().all()
                .assertThat().body("ok", equalTo(true))
                .statusCode(200);
    }
}
