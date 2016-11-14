package demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Natasha on 14/11/2016.
 */
@Path("/hi")
public class HiWorld {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getPlainMessage() {
        return "Hi World!";
    }

    @GET
    @Produces(MediaType.TEXT_XML)
    public String getMessage() {
        return "<hi>Hi World!</hi>";
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getHTMLMessage() {
        return "<b>Hi World!</b>";
    }
}
