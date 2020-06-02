package rcastro.apps;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
  String sayHi(String text); 
}

