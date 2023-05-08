package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive 测试项目 热部署";
    }

    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_JSON)
    public User test() {
        User user = new User();
        user.setUserName("张三");
        user.setPassWord("1232213");
        return user;
    }
}
