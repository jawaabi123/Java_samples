public class Graph 
{
    public static class GraphNode
    {
        int val;
        GraphNode left;
        GraphNode right;
        public GraphNode(int val)
        {
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    public Graph()//constructor
    {
        
    }
    
}
