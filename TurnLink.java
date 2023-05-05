package hw4;

import api.*;

public class TurnLink extends AbstractLink  {

	
	/**Creates a new instance of the TurnLink class.
@param p1 the first endpoint of the turn link.
@param p2 the second endpoint of the turn link.
@param p3 the third endpoint of the turn link.
	 */
	public TurnLink(Point p1, Point p2, Point p3)
	{
		super (new PointPair[] {new PointPair(p1, p3), new PointPair (p2, p1), new PointPair (p3, p1)});
	}
}

