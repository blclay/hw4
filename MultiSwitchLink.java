package hw4;

import api.*;

public class MultiSwitchLink extends AbstractLink {

	/**
	 * The constructor for MultiSwitchLink
	 * @param pts the name of the array
	 */
	public MultiSwitchLink(PointPair[] pts) {
		super(pts);
	}

	/**
	 * Switches the connection at the given index to use the given point pair. 
	 * If the train is currently crossing, this method has no effect.
	 * 
	 * @param pair  the new point pair to use
	 * @param index the index of the point pair to be replaced
	 */
	public void switchConnection(PointPair pair, int index) {
	    if (isTrainCrossing()) {
	        return;
	    }
	    
	    PointPair targetPair = getPointPair(index);
	    targetPair.setPointA(pair.getPointA());
	    targetPair.setPointB(pair.getPointB());
	}


}
