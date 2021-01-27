package api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/vols")
public class Vols {
	VolsDB lesvols = new VolsDB();
	@GET
	@Produces("text/json")
	public String getVols() {
		
		String jsonVols = "";
		jsonVols += "{";
		for (Vol vols : lesvols.getVols()) {
			jsonVols += "\n \"numVol\"" + "\""+vols.getNumVol() +"\"";
			jsonVols += "\n \"villedepart\"" + "\""+vols.getVilleDepart() +"\"";
			jsonVols += "\n \"villearrivee\"" + "\""+vols.getVilleArrivee() +"\"";
			jsonVols += "\n \"heurearrivee\"" + "\""+vols.getHeureDepart() +"\"";
			jsonVols += "\n";
		}
		jsonVols += "bonjour";
		jsonVols += "}";
		return jsonVols;
	}
	
	@GET
	@Path( "numVol-{id}" )
	@Produces("text/json")
	public String getVolById (
			@PathParam ("id") String id) {
	
	
		Vol v = lesvols.getVol(id);
		String jsonvol = "";
		jsonvol+="{";
		jsonvol += "\n \"numVol\"" + "\""+v.getNumVol() +"\"";
		jsonvol += "\n \"villedepart\"" + "\""+v.getVilleDepart() +"\"";
		jsonvol += "\n \"villearrivee\"" + "\""+v.getVilleArrivee() +"\"";
		jsonvol += "\n \"heurearrivee\"" + "\""+v.getHeureDepart() +"\"";
		jsonvol += "\n";
		jsonvol += "}";
		return jsonvol;
	 }

}
