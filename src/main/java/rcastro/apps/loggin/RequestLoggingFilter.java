package rcastro.apps.loggin;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class RequestLoggingFilter implements ContainerRequestFilter {
  
  @Override
  public void filter(final ContainerRequestContext requestContext) throws IOException {
    final String invokedPath = requestContext.getUriInfo().getPath();
    System.out.println("Request to path has been made" + invokedPath);
  }
  
}