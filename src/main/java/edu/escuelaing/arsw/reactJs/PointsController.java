package edu.escuelaing.arsw.reactJs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointsController {
	
	private PointsCache cache = PointsCache.getInstance();
	
	@PostMapping("/points")
	public String processPoints(@RequestBody String points){
		System.out.println(points);
		cache.setPositions(points);
		return points;
	}
}
