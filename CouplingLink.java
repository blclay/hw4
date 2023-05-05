package hw4;

import api.*;

public class CouplingLink extends AbstractLink implements Crossable {


	/**
	 * Constructor for CouplingLink
	 * @param 1st end point
	 * @param 2nd end point
	 */
	public CouplingLink(Point p1, Point p2)
	{
		super(new PointPair[] {new PointPair(p1, p2), new PointPair(p2, p1) } );
	}
}
