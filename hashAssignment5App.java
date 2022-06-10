import java.util.Random;
import java.util.Scanner;

//Luis Lopez
//Assignment 5

public class hashAssignment5App {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		Random rand = new Random();
		int rand1;
		int[] tallyArray = new int[1000];
		int userCodesNum, userIndex,userCode;
		int tableSize = 101;//Prime number for hash array size
		HashTable areaCodeHashTable = new HashTable(tableSize);//making Hash table for our area codes
		
		//Using Tally array process to avoid duplicate numbers
		
		for(int i = 100; i < 999; i++)//populating tallyArray to all zeroes
	      {
	    	  
	    	  tallyArray[i] = 0;
	    	  
	      }
	   
		//Ask user for number of area codes but must not exceed 320, then randomly generate them and put into tally array.
		System.out.println("Please enter the number of area codes, do not exceed 320 codes: ");
		
		userCodesNum = userInput.nextInt();
		
		while(userCodesNum > 320)//Making sure user enters a number below 320 and keep asking until they do.
		{
			
			System.out.println("Number must not exceed 320, please enter again: ");
			userCodesNum = userInput.nextInt();
			
		}
		
	   for(int i = 0; i < userCodesNum; i++)//random numbers corresponds to the indices of the tallyArray and is set to 1. if duplicate, find another random num
	      {
		   
		   		rand1 = rand.nextInt(899) + 100;
		   		
		   		tallyArray[rand1]++;
		   		
		   		while(tallyArray[rand1] > 1)//duplicate found, keep choosing a random number until no duplicate is found
		   		{
		   			tallyArray[rand1]--;
		   			rand1 = rand.nextInt(899) + 100;
		   			tallyArray[rand1]++;
		   			
		   		}
	    	  
	      }
		
	   /*
	   int countCode = 0;
	   for(int i = 100; i < 999; i++)//testing tallyArray
	      {
	    	  
		   
		   System.out.print(tallyArray[i]);
		   if(tallyArray[i] == 1)
		   {
			   
			   countCode++;
			   
		   }
	    	  
	      }
	   System.out.println();
	   System.out.print(countCode);
		*/
		
	   

		for(int i = 100; i < 999; i++)//populating hash table array of BSTs
	      {
	    	  
			Node tempNode;
			
	    	 if(tallyArray[i] > 0)//using tally array to insert the area codes with guaranteed no duplicates.
	    	 {
	    		 //Making a temporary node and add the area code into the Node's idata
	    		 tempNode = new Node();
	    		 tempNode.iData = i;
	    	
	    		 //Insert node into Hash table. Using Hash function to get the key and find the location then insert the node to the correct BST.
	    		 areaCodeHashTable.insertToHash(tempNode);
	    		 
	    	 }
	    	  
	      }
	   
		
		
		//areaCodeHashTable.displayTable();

		
		//1. Display the load factor of your Hash Table. Also give the actual and precise average size
		//of the BSTs in the occupied slots of the Hash Table. 
		
		areaCodeHashTable.displayLoadFactor(userCodesNum);
		
		//2. Display the list of indices of the Hash Table that are non-empty. The user will choose an
		//index from this list and you must display the BST stored in that array element on the screen as a
		//visual tree. Use the displayTree method in the textbook. 
		
		areaCodeHashTable.displayIndices();	
		
		System.out.println("\n\nChoose an index from the above to display BST: ");
		
		userIndex = userInput.nextInt();
		
		areaCodeHashTable.hashArray[userIndex].displayTree();
		
		//3. Prompt the user for a chance to look for an area code.
		
		System.out.println("\n\nChoose an area code to search for (100-999): ");
		
		userCode = userInput.nextInt();
		
		areaCodeHashTable.find(userCode);//Will display "Probing sequence"
		
		
		
	}

}
