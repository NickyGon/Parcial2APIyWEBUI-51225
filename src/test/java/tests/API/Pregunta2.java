package tests.API;

import api.factoryRequest.FactoryRequest;
import api.factoryRequest.RequestInfo;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.dataProperties.TodolyProperties;

import java.util.Base64;
import java.util.Date;

import static org.hamcrest.Matchers.equalTo;

public class Pregunta2 {
    RequestInfo requestInfo = new RequestInfo();
    Response response;

    JSONObject Userbody = new JSONObject();
    JSONObject body= new JSONObject();
    String auth;

    @BeforeEach
    public void setup(){
        auth = Base64.getEncoder().encodeToString((TodolyProperties.user+":"+TodolyProperties.pwd).getBytes());
    }

    @Test
    public void crudPregunta2() {


        for (int i=0;i<4;i++) {
            body.put("Content","Data"+new Date().getTime()+i);
            body.put("Icon",i+1);
            requestInfo.setHost(TodolyProperties.host + "api/projects.json").setBody(body.toString()).setHeader("Authorization", "Basic " + auth);
            response = FactoryRequest.make("post").send(requestInfo);
            response.then()
                    .log().all()
                    .statusCode(200)
                    .body("Content", equalTo(body.get("Content")))
                    .body("Icon", equalTo(body.get("Icon")));
        }
    }
}
