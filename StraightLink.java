package hw4;

import api.*;

public class StraightLink extends AbstractLink {

	
	/**
	 * The constructor for StraightLink
	 * @param p1 endpoint 1
	 * @param p2 endpoint 2
	 * @param p3 endpoint 3
	 */
	public StraightLink(Point p1, Point p2, Point p3)
	{
		super(new PointPair[] { new PointPair(p1, p2), new PointPair(p2, p1), new PointPair(p3,p1) } );
	}
}
