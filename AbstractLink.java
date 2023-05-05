package hw4;

import api.*;

/**
 * Abstract class for link objects
 * @author Braydon Clay
 * 
 * I decided to have implement Crossable into my abstract class, so I have a baseline for all my classes.
 * Then I used AbstractLink as a superclass for all the other classes, so that way I drastically reduce the amount of redundant code
 *
 */
public abstract class AbstractLink implements Crossable{

	// array of PointPair objects representing the link
	private PointPair[] linkPoints;
	
	// flag indicating whether a train is currently crossing the link
	private boolean isTrainCrossing = false;
	
	/**
	 * Constructor for the AbstractLink class
	 * @param pair - an array of PointPair objects representing the link
	 */
	protected AbstractLink(PointPair[] pair) {
		linkPoints = pair;
	}
	
	/**
	 * Gets the point that is connected to the given point.
	 * Returns null if no point is connected.
	 * @param point - the point to check
	 * @return the point connected to the given point
	 */
	public Point getConnectedPoint(Point point) {
		for (PointPair pair : linkPoints) {
			if (pair.getPointB().equals(point)) {
				return pair.getPointA();
			}
		}
		return null;
	}
	
	/**
	 * Returns whether a train is currently crossing the link.
	 * @return true if a train is crossing the link, false otherwise
	 */
	protected boolean isTrainCrossing() {
		return isTrainCrossing;
	}
	
	/**
	 * Returns the number of paths in the link.
	 * @return the number of paths
	 */
	public int getNumPaths() {
		return linkPoints.length;
	}
	
	/**
	 * Sets the flag indicating that a train has entered the link.
	 */
	public void trainEnteredCrossing() {
		isTrainCrossing = true;
	}
	
	/**
	 * Sets the flag indicating that a train has exited the link.
	 */
	public void trainExitedCrossing() {
		isTrainCrossing = false;
	}
	
	/**
	 * Shifts from one vector to the next vector.
	 * @param positionVector - the vector to shift
	 */
	public void shiftPoints(PositionVector positionVector) {
		Point pointA = getConnectedPoint(positionVector.getPointB());
		positionVector.setPointA(pointA);
		
		Path path = pointA.getPath();
		if (pointA.getPointIndex() == 0) {
			positionVector.setPointB(path.getPointByIndex(1));
		}
		else {
			positionVector.setPointB(path.getPointByIndex(path.getNumPoints() - 2));
		}
	}
	
	/**
	 * Gets the PointPair object at the given index.
	 * @param index - the index of the desired PointPair
	 * @return the PointPair object at the given index
	 */
	protected PointPair getPointPair(int index) {
		return linkPoints[index];
	}
}
