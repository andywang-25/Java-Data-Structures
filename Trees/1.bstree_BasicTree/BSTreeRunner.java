//(c) A+ Computer Science
//www.apluscompsci.com

//Name -Andy Wang, Algs and Data E block

import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		//add test cases here
      
      BinarySearchTree tree = new BinarySearchTree();
      tree.add(90);
      tree.add(100);
      tree.add(80);
      tree.add(70);
      tree.add(85);
      tree.add(98);
      tree.add(120);
      tree.add(86);
      tree.add(97);
      tree.add(71);
      tree.add(69);

      out.println("in order: ");
      tree.inOrder();

      out.println("pre-order: ");
      tree.preOrder();

      

      out.println("post-order: ");
      tree.postOrder();

      out.println("reverse order: ");
      tree.revOrder();

      


      out.println("\nTree height is " + tree.getHeight());
      out.println("\nTree width is " + tree.getWidth());
      out.println("\nTree leaves  is " + tree.getNumLeaves());
      out.println("\nTree levels is " + tree.getNumLevels());

      out.println("\nTree as a string " + tree.toString());

      out.println("\n Number of nodes is " + tree.getNumNodes());
 
      out.println(tree.isFull()?"\nThe tree is full." : "\nThe tree is not full");

      out.println(tree.search(120));

      out.println("in order: ");
      tree.inOrder();

      tree.deleteNode(80);
      System.out.println("");

      tree.deleteNode(100);


      out.println("in order: ");
      tree.inOrder();
      
      out.println("display like a tree"); 
      tree.display();



 
   }
}