# Java-Hash-Tables-Assignment
Spring 2022 Data Structures &amp; Algorithms Assignment 5

Topic: Hash Tables

Download the code provided by the textbook in order to complete this program.
You will need the Hash Table as well as the BST class.

We would like to store a number of 3-digit hypothetical area-codes/numbers in the range
100-999 in a hash table. These numbers will be randomly created. There are around 320 area
codes in the United States. You will prompt the user for the number of these area codes which
should not exceed 320. They will be randomly created and will be assumed legal area-codes.
Your program must deal with all aspects of a "hashing" strategy: size of the table, hash function,
etc.

The choice of the size of the hash table should take into consideration that we may or may not
have ALL 320 area codes. When you decided on the size of the table and the Hash function, in
order to resolve possible collisions we use BSTs. This means that your Hash Table will be an
array of BSTs. This is similar to "separate chaining" but instead of a linked list in each array
element, we use a BST.

When you made your decisions about the size of the Hash Table and the Hash function, you
should start "hashing" the random area codes in the Hash Table. You may need to come up with a
strategy of converting these area codes into a more manageable keys. You must also deal with
possible duplicate values. As we know, the duplicates could pose some difficulties in terms of
increasing the cost of unsuccessful searches. Therefore we would like to avoid inserting
duplicates in the Hash Table. In an attempt to coming up with the strategy in avoiding duplicates
you may think of the following scenarios:

1. Coming up with a random number generation strategy to avoid duplicates. Tally process
anyone?

2. Create a random number, search for that item in this "BST flavored" Hash Table, and
only insert it in the table if its duplicate is not found.
Clearly indicate your preference, code it, and give your argument supporting your choice in your
report. Make sure you address the running time of your choice in terms of big O notation,
memory efficiency, etc. This is listed as the second question in your report. You will find the list
of report topics at the end of this document.

When done with coding this scenario, you must display the following:

1. Display the load factor of your Hash Table. Also give the actual and precise average size
of the BSTs in the occupied slots of the Hash Table.

2. Display the list of indices of the Hash Table that are non-empty. The user will choose an
index from this list and you must display the BST stored in that array element on the screen as a
visual tree. Use the displayTree method in the textbook.

3. Prompt the user for a chance to look for an area code. In search of this area code, you
must display the "probe sequence" in terms of the nodes you visit, in both successful and
unsuccessful searches, whereas the successful search ends with the target area-code. In separate
chaining we usually do not have a "probe sequence", that is why I have this phrase in quotation, I
am using this term in more of a visited-nodes-sequence sense.
Provide the answers to the following question in a report file, similar to what we had in previous
assignments.

Q1. Discuss the advantages and disadvantages of using BST vs. using a linked list. Present
your argument with respect to running time in big O notation, memory efficiency, etc.

Q2. Discuss your strategy in dealing with duplicates. As was mentioned above, it must be one
of the two ideas outlined. Explain your reasoning, and specify the running time, memory cost and
any other relevant factor in your decision.

Q3. In an unlikely event of the need for rehashing such a Hash Table of BST’s, give your
thoughts on this process in this specific scenario.

Q4. How did you come up with the average size of the BST’s in the occupied cells of the Hash
Table? Explain your strategy
