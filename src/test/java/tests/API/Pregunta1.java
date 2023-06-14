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

public class Pregunta1 {
    RequestInfo requestInfo = new RequestInfo();
    Response response;

    JSONObject Userbody = new JSONObject();
    JSONObject ProjectBody= new JSONObject();
    String auth;

    @BeforeEach
    public void setup(){
        Userbody.put("Email","fake"+new Date().getTime()+"@gmail.com");
        Userbody.put("FullName","Alessandra Mele");
        Userbody.put("Password","estoesitalia");

        ProjectBody.put("Content","Data");
        ProjectBody.put("Icon",5);

    }

    @Test
    public void crudPregunta1(){
        requestInfo.setHost(TodolyProperties.host+"api/user.json").setBody(Userbody.toString());



        response= FactoryRequest.make("post").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("Email",equalTo(Userbody.get("Email")))
                .body("FullName",equalTo(Userbody.get("FullName")));

        auth = Base64.getEncoder().encodeToString((Userbody.get("Email")+":"+Userbody.get("Password")).getBytes());

        requestInfo.setHost(TodolyProperties.host+"api/projects.json").setBody(ProjectBody.toString()).setHeader("Authorization","Basic "+auth);

        response=FactoryRequest.make("post").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("Content",equalTo(ProjectBody.get("Content")))
                .body("Icon",equalTo(ProjectBody.get("Icon")));

        requestInfo.setHost(TodolyProperties.host+"api/user/0.json").setBody(ProjectBody.toString()).setHeader("Authorization","Basic "+auth);

        response=FactoryRequest.make("delete").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("Email",equalTo(Userbody.get("Email")))
                .body("FullName",equalTo(Userbody.get("FullName")));

        requestInfo.setHost(TodolyProperties.host+"api/projects.json").setBody(ProjectBody.toString()).setHeader("Authorization","Basic "+auth);

        response=FactoryRequest.make("post").send(requestInfo);
        response.then()
                .log().all()
                .statusCode(200)
                .body("ErrorMessage",equalTo("Account doesn't exist"))
                .body("ErrorCode",equalTo(105));

    }
}
