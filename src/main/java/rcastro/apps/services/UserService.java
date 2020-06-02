
package rcastro.apps.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import rcastro.apps.loggin.Logged;


@Path("v1")
public class UserService  {

	@GET()
	@Logged
	public String test() {
		System.out.println("rcastro.apps.services.test");
		return "Test";
	}
}
