package hw4;

import api.*;

public class DeadEndLink extends AbstractLink {

	/**
	 * Constructor for the DeadEndLink class
	 */
	public DeadEndLink() {
		super(new PointPair[]  {new PointPair(null,null) } );
	}
	
	/**
	 * This method is overridden in order to avoid a NullPointerException being thrown
	 */
	@Override
	public void shiftPoints(PositionVector positionvector)
	{
		
	}
	
	/**
	 * This method is overridden in order to avoid a NullPointerException being thrown
	 */
	@Override
	public Point getConnectedPoint(Point point)
	{
		return null;
	}
}
