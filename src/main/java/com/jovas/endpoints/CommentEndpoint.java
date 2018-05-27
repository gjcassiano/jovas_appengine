package com.jovas.endpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.users.User;
import com.jovas.models.Comment;
import com.jovas.models.HelloGreeting;
import com.jovas.services.CommentService;
import com.jovas.utils.Constants;

import javax.inject.Named;
import java.util.ArrayList;

@Api(name = "jovas",
    version = "v1",
    scopes = {Constants.EMAIL_SCOPE},
    clientIds = {Constants.WEB_CLIENT_ID, Constants.ANDROID_CLIENT_ID, Constants.IOS_CLIENT_ID},
    audiences = {Constants.ANDROID_AUDIENCE}
)
public class CommentEndpoint{

  @ApiMethod(name = "comment.add",
          path = "comment",
          httpMethod = ApiMethod.HttpMethod.POST)
  public Comment addComment(User user, @Named("message") String message) {

    HelloGreeting response = new HelloGreeting("hello " + user.getEmail());
    CommentService commentService = new CommentService();
    return commentService.add(message);
  }

  @ApiMethod(name = "comment.remove",
          path = "comment",
          httpMethod = ApiMethod.HttpMethod.DELETE)
  public Comment deleteComment(User user, @Named("id") Long id) {

//    HelloGreeting response = new HelloGreeting("hello " + user.getEmail());
    Comment comment = new Comment();
    return comment;
  }

}
