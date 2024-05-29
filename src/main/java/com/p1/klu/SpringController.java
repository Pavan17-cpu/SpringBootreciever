package com.p1.klu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringController {
 
	
	Currency c1 =new Currency();
	@GetMapping("/recevier/{a}")
	@ResponseBody
	public String receiver(@PathVariable("a") double a)
	{
		return "Currency Conversion from USD to INR is"+String.valueOf(c1.convert(a));
	}

	  @PostMapping("/receiver")
	  @ResponseBody
	  public String receiver2(@RequestBody Currency c1) {
	    System.out.println(c1.convert(c1.getA()));
	    return String.valueOf(c1.convert(c1.getA()));
	  }
	
	
}
