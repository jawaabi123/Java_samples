import java.util.*;

public class Tree 
{
    public static class Node //class for tree node
    {
        Node left;
        Node right;
        int value;
        public Node(int value)//constructor for node
        {
            this.value=value;
            this.left=null;
            this.right=null;
        }
    }
    public static class BinaryTree
    {
        public BinaryTree()
        {
            
        }
        
        // public void insertNode(Node root)
        // {
        //     Scanner input=new Scanner(System.in);
        //     populate(input,root);
        // }
        public void populate(Scanner input,Node node)
        {
            System.out.println("Do you want to enter left value of current node?");
            boolean left=input.nextBoolean();
            if(left)
            {
                System.out.println("Enter left value:");
                int leftval=input.nextInt();
                node.left=new Node(leftval);
                populate(input,node.left);
            }
            System.out.println("Do you want to enter right value of current node?");
            boolean right=input.nextBoolean();
            if(right)
            {
                System.out.println("Enter right value:");
                int rightval=input.nextInt();
                node.right=new Node(rightval);
                populate(input,node.right);
            }
        }
    }
     public static class BinarySearchTree
        {
            Node root;
            public BinarySearchTree()//constructor
            {

            }
            public void insert(Node node,int value)
            {
                if(value>node.value)
                {
                    if(node.right==null)
                    {
                        node.right=new Node(value);
                    }
                    else
                    {
                        insert(node.right,value);
                    }
                }
                else if(value<node.value)
                {
                    if(node.left==null)
                    {
                        node.left=new Node(value);
                    }
                    else
                    {
                        insert(node.left,value);
                    }
                }
            }
            public void levelOrderTraversal()
            {
                Queue<Node>queue=new LinkedList<>();
                queue.poll();
                while(queue.size()!=0)
                {
                    Node current=queue.poll();
                    if(current.left!=null)queue.offer(current.left);
                    if(current.right!=null)queue.offer(current.right);
                    System.out.println(current.value);
                }
            }
        }
    public static void main(String args[])
    {
        Node root=new Node(5);//creating root node
        // BinaryTree tree = new BinaryTree();
        // Scanner input=new Scanner(System.in);
        // tree.populate(input,root);

        //binary search tree
        BinarySearchTree bsttree=new BinarySearchTree();
        bsttree.root=root;
        bsttree.insert(bsttree.root,6);
        bsttree.insert(bsttree.root,7);
        bsttree.insert(bsttree.root,4);
        bsttree.insert(bsttree.root,3);
        bsttree.insert(bsttree.root,10);
        bsttree.levelOrderTraversal();
    }
}
