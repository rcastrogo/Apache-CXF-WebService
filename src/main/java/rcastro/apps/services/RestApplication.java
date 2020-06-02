package rcastro.apps.services;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import rcastro.apps.loggin.RequestLoggingFilter;
import rcastro.apps.loggin.ResponseLoggingFilter;

@ApplicationPath("/api2") 
public class RestApplication extends Application{
  private Set<Object> singletons = new HashSet<Object>();

  public RestApplication() {
  	System.out.println("RestApplication");
      singletons.add(new UserService());
      singletons.add(new RequestLoggingFilter());
      singletons.add(new ResponseLoggingFilter());
  }

  @Override
  public Set<Object> getSingletons() {
      return singletons;
  }
}