package api;

import java.util.ArrayList;
import java.util.List;

public class VolsDB {
	  private static List<Vol> vols = new ArrayList<Vol>(); 
	  static { 
	    vols.add(new Vol("SXB123", "Strasbourg", "Paris", 1250)); 
	    vols.add(new Vol("SXB127", "Strasbourg", "Paris", 1420)); 
	    vols.add(new Vol("CDC129", "Poitiers", "Paris", 1710)); 
	   // ...
	  } 

	  public static List<Vol> getVols() { return vols; }
	  
	  
	  public Vol getVol(String id) {
		  for (Vol v : vols) {
			  if (v.getNumVol().equals(id)) {
				  return v;
			  }
			  
		  }
		 return new Vol("not found","not found", "not found", 404);
		  
		  
	  }
	}