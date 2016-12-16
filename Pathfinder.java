public class Pathfinder
{
	public static void main(String args[])
	{
		Nodee nodeA = new Nodee("A", null, 0, null, 0);
		Nodee nodeB = new Nodee("B", null, 0, null, 0);
		Nodee nodeC = new Nodee("C", null, 0, null, 0);
		Nodee nodeD = new Nodee("D", null, 0, null, 0);
		Nodee nodeE = new Nodee("E", null, 0, null, 0);
		Nodee nodeF = new Nodee("F", null, 0, null, 0);
		Nodee nodeG = new Nodee("G", null, 0, null, 0);
		Nodee nodeH = new Nodee("H", null, 0, null, 0);
		Nodee nodeI = new Nodee("I", null, 0, null, 0);

		nodeA.right     = nodeB;
		nodeA.rightCost = 1;
		nodeA.down      = nodeD;
		nodeA.downCost  = 7;

		nodeB.right     = nodeC;
		nodeB.rightCost = 3;
		nodeB.down      = nodeE;
		nodeB.downCost  = 2;

		// nodeC.right 	= ;
		// nodeC.rightCost = ;
		nodeC.down 		= nodeF;
		nodeC.downCost 	= 3;

		nodeD.right 	= nodeE;
		nodeD.rightCost = 1;
		nodeD.down 		= nodeG;
		nodeD.downCost 	= 1;

		nodeE.right 	= nodeF;
		nodeE.rightCost = 4;
		nodeE.down 		= nodeH;
		nodeE.downCost 	= 0;

		// nodeF.right 	= ;
		// nodeF.rightCost = ;
		nodeF.down 		= nodeI;
		nodeF.downCost 	= 5;

		nodeG.right 	= nodeH;
		nodeG.rightCost = 1;
		// nodeG.down 		= ;
		// nodeG.downCost 	= ;

		nodeH.right 	= nodeI;
		nodeH.rightCost = 7;
		// nodeH.down 		= ;
		// nodeH.downCost 	= ;

		// nodeI.right 	= ;
		// nodeI.rightCost = ;
		// nodeI.down 		= ;
		// nodeI.downCost 	= ;

		// ------------------------------------------------------------

		nodeA.findPath(0);

		Nodee.printSetOfAllWeights();

		// ------------------------------------------------------------

	} // main()

} // class Pathfinder

