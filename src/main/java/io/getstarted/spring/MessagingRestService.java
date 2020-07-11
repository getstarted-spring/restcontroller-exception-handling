package io.getstarted.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/messaging")
public class MessagingRestService {

  @GetMapping(
      path = "/message",
      params = {"name"})
  public Message getMessage(@RequestParam final String name) {

    final Message message = new Message();
    message.setText("Hello " + name);
    return message;
  }

  @PostMapping(
      path = "/message",
      params = {"name"})
  public Message setMessage(@RequestParam final String name, @RequestBody final Message message) {

    message.setText("Hi, " + name);
    return message;
  }
}
