package com.myblog.controller;

import com.myblog.entity.pojo.User;
import com.myblog.service.IUserService;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.IOException;

/**
 * @author serenity
 * @date 17-11-11 16:49
 */
@Controller
@Path("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    @Autowired
    private IUserService iUserService;

    @Path("/user")
    @PUT
    @Produces("application/json;charset=utf-8")
    public Response save(String userJson) {
        logger.info("save user:{}",userJson);
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        try {
            User user = objectMapper.readValue(userJson, User.class);
            System.out.println(user);
            System.out.println(iUserService);
            iUserService.save(user);
            objectNode.put("success",true);
        } catch (IOException e) {
            e.printStackTrace();
            objectNode.put("sucess",false);
        }
        return Response.ok().entity(objectNode)
                .header("Access-Control-Allow-Origin","*")
                .header("Access-Control-Allow-Headers","User-Agent,Origin,Cache-Control,Content-type,Date,Server,withCredentials,AccessToken")
                .header("Access-Control-Allow-Credentials","true")
                .header("Access-Control-Allow-Methods","GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .header("Access-Control-Max-Age","1209600")
                .header("Access-Control-Expose-Headers","accesstoken")
                .header("Access-Control-Request-Headers","accesstoken")
                .header("Expires","-1")
                .header("Cache-Control","no-cache")
                .header("pragma","no-cache")
                .build();
    }

    @Path("/user")
    @GET
    @Produces("application/json;charset=utf-8")
    public Response get() {
        logger.info("test run");
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        objectNode.put("test","aaaaaaaaaaaaaaaaaaaaaaafdsafsd");
        return Response.ok().entity(objectNode)
                .header("Access-Control-Allow-Origin","*")
                .header("Access-Control-Allow-Headers","User-Agent,Origin,Cache-Control,Content-type,Date,Server,withCredentials,AccessToken")
                .header("Access-Control-Allow-Credentials","true")
                .header("Access-Control-Allow-Methods","GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .header("Access-Control-Max-Age","1209600")
                .header("Access-Control-Expose-Headers","accesstoken")
                .header("Access-Control-Request-Headers","accesstoken")
                .header("Expires","-1")
                .header("Cache-Control","no-cache")
                .header("pragma","no-cache")
                .build();
    }
}
