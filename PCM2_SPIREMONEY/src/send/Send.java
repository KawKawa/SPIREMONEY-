package send;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/send")
public class Send {
	String date;
	String open;
	String high;
	String low ;
	String close;
	String volume; 
	String id_comp;
	public void init()//for the teste 
	{
		date ="2018-03-01 10:10:00";
		open="178.68";
		high="178.72";
		low="178.58";
		close="178.58";
		volume="38397.0";
		id_comp="0";
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)// exchange format Json XML
	@Path("{symbole}/put")
	public String sayHellohtml3(@PathParam("symbole") String sy)
		{
			String response = "{ \"open\":\""+sy+"\", \"low\":\""+sy+"\", \"high\":\""+sy+"\", \"close\":\""+sy+"\" }";
		    
			return response ;
		}

	@GET
	@Produces(MediaType.APPLICATION_JSON)// exchange format Json XML
	@Path("/put")
	public String puts()
		{
		    // point=RequestAlpha.requestLast("AAPL", "1min");
			init();
			String resp="{\"date\":\""+date+"\",\"open\":\""+open+"\",\"high\":\""+high+"\",\"low\":\""+low+"\",\"close\":\""+close+"\",\"volume\":\""+volume+"\",\"id_company\":\""+id_comp+"\"}";
			return resp ;
		}

	
}
