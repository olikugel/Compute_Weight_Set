import java.util.*;


public class Nodee 
{
	// instance variables
	public String name;
	public Nodee  right;
	public int    rightCost;
	public Nodee  down;
	public int    downCost;
	

	// constructor
	public Nodee(String requiredName, Nodee requiredRight, int requiredRightCost,
									  Nodee requiredDown,  int requiredDownCost)
	{
		name      = requiredName;
		right     = requiredRight;
		rightCost = requiredRightCost;
		down      = requiredDown;
		downCost  = requiredDownCost;
	} // Nodee()


	// class variables
	private static HashSet<Integer> weights = new HashSet<Integer>();
	private static int weight;
    private static ArrayList<Integer> costs = new ArrayList<Integer>();
    private static ArrayList<String> path = new ArrayList<String>();


	// instance method 
	public void findPath(int cost) 
	{
		System.out.println("\t\t\t" + "findPath() is called on " + name);

		costs.add(cost);
		path.add(name);

		if (down == null  &&  right == null) // we've reached the destination node
		{
			weight = costs.stream().mapToInt(Integer::intValue).sum();
			weights.add(weight); // add to the Set weights, no duplicates will be added
			System.out.println("Weight:\t" + weight);
			System.out.print("Costs:\t");
			System.out.println(costs);
			System.out.print("Path:\t");
			System.out.println(path);
			System.out.println();
			
			costs.remove(costs.size() - 1);
			path.remove(path.size() - 1);
			return;
		}

		if (right != null) // there is a node to the right
			right.findPath(rightCost);

		if (down != null) // there is a node downwards
			down.findPath(downCost);

	    costs.remove(costs.size() - 1);
	    path.remove(path.size() - 1);
		return;
	} // findPath()


	// class method
	public static void printSetOfAllWeights()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Set of all weights of all valid paths:");
		System.out.println(weights);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	} // printSetOfAllWeights()


} // class Nodee

