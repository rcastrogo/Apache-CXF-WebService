
package rcastro.apps;

import javax.jws.WebService;

@WebService(endpointInterface = "rcastro.apps.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

