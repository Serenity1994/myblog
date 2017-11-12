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
import java.io.Serializable;
import java.util.List;

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
            Serializable id = iUserService.save(user);
            logger.info("user after save:{}",user.toString());
            objectNode.put("success",true);
            objectNode.put("id",id.toString());
        } catch (IOException e) {
            e.printStackTrace();
            objectNode.put("sucess",false);
        }
        return Response.ok().entity(objectNode).build();
    }

    @GET
    @Produces("application/json;charset=utf-8")
    public Response get() {
        logger.info("test run");
        ObjectMapper objectMapper = new ObjectMapper();
        ObjectNode objectNode = objectMapper.createObjectNode();
        List<User> users = iUserService.loadAll();
        try {
            objectNode.put("data", objectMapper.writeValueAsString(users));
        } catch (IOException e) {
            e.printStackTrace();
        }
        objectNode.put("test","aaaaaaaaaaaaaaaaaaaaaaafdsafsd");
        return Response.ok().entity(objectNode).build();
    }
}
