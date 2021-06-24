package edu.escuelaing.arsw.reactJs;

import java.util.ArrayList;

public class PointsCache {
	
	public ArrayList<String> positions = new ArrayList<String>();
	private static PointsCache _instance = new PointsCache();
	private PointsCache() {}
	public static PointsCache getInstance() {
		return _instance;
	}
	
	
	public void addPositions(String newPositions) {
		positions.add(newPositions);
	}
	
	public ArrayList<String> getPositions() {
		return positions;
	}
}
