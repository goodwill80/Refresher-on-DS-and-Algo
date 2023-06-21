Big-O-Notation
- Time Complexity and Space Complexity
- Time complexity is measured with the NUMBER of operations it takes to complete something. It is not measured in time as different computers processed at different speed
- Space Complexity is measured with MEMORY SPACE

Time Complexity
- Big O always measure the worst case of an operation
- o(n)
  - for(int i=0; i < 10; i++) System.out.print(i)
  - The above is o(n)
  - Event with 2 x loops at o(2n), it will be simplified to o(n)

- o(n^2)
  - This is a nested loop, hence, n * n
  - Less efficient than o(n) as it takes multiples of n to run the operation

- o(1)
  - public int sum(int n) return n + n + n + n;
  - This is the most efficient of Big-O

- o(log n)
  - An example will be if you are asked to find an item in an array
  - The most efficient would be to cut the array into half, and it goes on again and again until you find the item
  - An array with a million items will only require it to be cut 31 times to find an item
  - Recursion will produce a o(log n)

Ranking of Efficiency
1. o(1) - single operation / Constant
2. o(log n) - recursion / Divide and conquer
3. o(n) - single loop
4. o(a + b + n..) - multiple single loops with different n
5. o(nlog n) - sorting algo
6. o(n^2) - nested loops

Examples using ArrayList
1. Arr.remove(), Arr.add() -  o(1)
2. Arr.remove(0), Arr.add(0, item)  - o(n) 