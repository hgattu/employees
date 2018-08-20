
package com.first.restservice.Employees;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET()
    @Path("/get1")
    @Produces("text/plain")
    public String getIt() {
        return "Hi Haaris!";
    }
    
    @GET()
    @Path("/get2")
    @Produces("text/plain")
    public String getIt2() {
        return "Hi Haaris2!";
    }
    
   
}
