package hw4;

import api.*;

public class SwitchLink extends AbstractLink {

	
	/**
	 * Variables to hold the given point value from the constructor
	 */
	private Point p1 = null;
	private Point p2 = null;
	private Point p3 = null;

	/**
	 * The constructor for SwitchLink
	 * @param p1 endpoint 1
	 * @param p2 endpoint 2
	 * @param p3 endpoint 3
	 */
	public SwitchLink(Point p1, Point p2, Point p3)
	{
		super(new PointPair[] { new PointPair(p1, p2), new PointPair(p3, p1), new PointPair(p2, p3) });
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	/**
	 * Sets the turn for this link. If the train is currently crossing, this method has no effect.
	 * 
	 * @param turn true if the turn should be set to p3, false if it should be set to p2
	 */
	public void setTurn(boolean turn) {
	    if (isTrainCrossing()) {
	        return;
	    }
	    
	    if (turn) {
	        getPointPair(0).setPointB(p3);
	    } else {
	        getPointPair(0).setPointB(p2);
	    }
	}

}

