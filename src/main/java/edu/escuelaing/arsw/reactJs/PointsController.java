package edu.escuelaing.arsw.reactJs;

import java.util.ArrayList;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointsController {
	
	private PointsCache cache = PointsCache.getInstance();
	
	@PostMapping("/points")
	public String processPoints(@RequestBody String points){
		int lentgh = points.length();
		System.out.println(points.substring(13,lentgh-1));
		return points;
	}
	
	@PostMapping("/newPoints")
	public ArrayList<String> getPositions(){
		return cache.getPositions();
	}
}
