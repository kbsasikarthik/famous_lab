package co.grandcircus.halloffameAPI.model;

import java.util.Comparator;

public class OrderByYear  implements Comparator<Complete> {
	@Override
	public int compare(Complete o1, Complete o2) {
	    return o1.getYear() > o2.getYear() ? 1 : (o1.getYear() < o2.getYear() ? -1 : 0);
	}
	    
}
