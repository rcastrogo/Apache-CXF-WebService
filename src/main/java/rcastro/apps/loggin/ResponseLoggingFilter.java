package rcastro.apps.loggin;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;


@Provider
public class ResponseLoggingFilter implements ContainerResponseFilter {
  
  @Override
  public void filter(final ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
    final String invokedPath = requestContext.getUriInfo().getPath();
    System.out.println("Response to path has been made" + invokedPath);
  }

  
}