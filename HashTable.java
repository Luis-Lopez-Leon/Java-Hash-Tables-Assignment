
//Luis Lopez
//Assignment 5

class HashTable
   {
   public Tree[] hashArray;   // array of BSTs
   private int arraySize;
// -------------------------------------------------------------
   public HashTable(int size)        // constructor
      {
      arraySize = size;
      hashArray = new Tree[arraySize];  // create array
      for(int j=0; j<arraySize; j++)          // fill array
         hashArray[j] = new Tree();     // with BSTs
      }
// -------------------------------------------------------------
   public void displayTable()
      {
      for(int j=0; j<arraySize; j++) // for each cell,
         {
         System.out.print(j + ". "); // display cell number
         hashArray[j].displayTree();; // display BST
         }
      }
// -------------------------------------------------------------
   public int hashFunc(int key)      // hash function
      {
      return key % arraySize;//keeping this hash function as it is since our size of data is not too big.
      }
// -------------------------------------------------------------
   public void insertToHash(Node theNode)  // insert a node
      {
      int key = theNode.getKey();
      int hashVal = hashFunc(key);   // hash the key
      hashArray[hashVal].insertToBST(key); // insert at hashVal
      }  // end insert()
// -------------------------------------------------------------
   public void delete(int key)       // delete a node
      {
      int hashVal = hashFunc(key);   // hash the key
      hashArray[hashVal].delete(key); // delete node
      }  // end delete()
// -------------------------------------------------------------
   public Node find(int key)         // find node
      {
      int hashVal = hashFunc(key);   // hash the key
      Node theLink = hashArray[hashVal].find(key);  // get node  
      return theLink;                // return node
      }
// -------------------------------------------------------------
   public void displayLoadFactor(int userInput)
   {
	   int numKeys = 0;
	   int averageSize = 0;
	   double loadFactor = 0.0;
	   
	   for(int j=0; j<arraySize; j++)
       {
       
		   if(hashArray[j].root == null) 
		   {
			   
			  continue;
		   }
		   else if(hashArray[j].root != null)
		   {
			   
			   numKeys++;
			   
		   }
       } 
	   
	   loadFactor = (double)userInput / (double)arraySize;//occupied slots in Hash Table array divided by the array size of the Hash table.
	   averageSize = userInput / numKeys;//total Nodes given by user divided by the occupied slots in the Hash Table array.
	   
	   System.out.printf("Hash Table Load factor: %.1f%n", loadFactor); // display load factor
	   System.out.println("Average Size of BSTs in the occupied slots: " + averageSize); // display load factor
	   
   }
// -------------------------------------------------------------
   
   public void displayIndices()
   {

	   System.out.println("List of Non-Empty Indices: ");
	   
	   for(int j=0; j<arraySize; j++)
       {
       
		   if(hashArray[j].root == null) 
		   {
			   continue;
			  
		   }
		   else if(hashArray[j].root != null)
		   {
			   
			   System.out.printf("[" + j + "] ");//display index
			   
		   }

		   
       } 

	   
   }
// -------------------------------------------------------------
   }  // end class HashTable