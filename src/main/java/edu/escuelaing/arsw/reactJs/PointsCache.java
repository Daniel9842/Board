package edu.escuelaing.arsw.reactJs;

public class PointsCache {
	
	public String positions = "";
	
	private static PointsCache _instance = new PointsCache();
	private PointsCache() {}
	public static PointsCache getInstance() {
		return _instance;
	}
	
	
	public void setPositions(String pos) {
		positions = pos;
	}
	
	public String getPositions() {
		return positions;
	}
}
