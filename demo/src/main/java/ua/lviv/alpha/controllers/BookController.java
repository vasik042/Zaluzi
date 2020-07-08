package ua.lviv.alpha.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BookController {

  @GetMapping("/")
  public String allBooks(HttpServletRequest req) {
    return "book";
  }

  @GetMapping("/1")
  public String allBooks1(HttpServletRequest req) {
    return "index";
  }
}
