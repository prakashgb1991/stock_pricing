package com.example.stockpricing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

	  @GetMapping(value = "/**/{path:[^\\.]*}")
	  public String forward() {
	    return "forward:/";
	  }
}
