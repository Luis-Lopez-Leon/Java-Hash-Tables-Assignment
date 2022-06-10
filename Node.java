
//Luis Lopez
//Assignment 5

class Node
   {
   public int iData;              // data item (key)
  
   public Node leftChild;         // this node's left child
   public Node rightChild;        // this node's right child

   public void displayNode()      // display yourself
      {
      System.out.print('{');
      System.out.print(iData);
      System.out.print("} ");
      }
   public int getKey()
   { return iData; }
   }  // end class Node