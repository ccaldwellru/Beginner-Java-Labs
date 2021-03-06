/**
 * SearchDrv -- test driver for Lab 7b -- searching arrays. 
 *			   CS1 (ITEC 120) 
 *
 * @author  Jeff Pittges
 * @version 22-Feb-2013  updated 28-Jul-2015 by Shawn Brenneman
 */ 
public class SearchDrv
{
	public static void main(String[] args)
	{
		//SearchSrv
		System.out.println("\n****TESTING THE SEARCHSRV METHOD****");
		SearchSrv labObj = new SearchSrv(); 
		TestSrv testObj = new TestSrv();

		//******
		// range
		//******

		System.out.println("\nTesting range\n");
		int val;
		int testNum = 1; 
		String result = "";
		
		// empty array
		val = labObj.range(new int[] {});
		System.out.println(testNum + ": " + testObj.validate(0, val));		
		++testNum; 

		// one element array
		val = labObj.range(new int[] {1});
		System.out.println(testNum + ": " + testObj.validate(0, val));		
		++testNum; 

		// multiple elements, ascending order
		val = labObj.range(new int[] {1, 2, 3, 4, 5});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, descending order 
		val = labObj.range(new int[] {5, 4, 3, 2, 1});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, min before max
		val = labObj.range(new int[] {3, 1, 4, 5, 2});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, min after max
		val = labObj.range(new int[] {2, 3, 5, 1, 4});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		//********
		// isFound
		//********

		System.out.println("\nTesting isFound\n");
		testNum = 1; 

		boolean bool = false; 

		// empty array
		bool = labObj.isFound(new int[] {}, 1);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// one element array -- found 
		bool = labObj.isFound(new int[] {1}, 1);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// one element array -- not found 
		bool = labObj.isFound(new int[] {1}, 2);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// multiple elements -- not found 
		bool = labObj.isFound(new int[] {1, 8, 7, 3, 5, 9}, 2);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// multiple elements -- found first position
		bool = labObj.isFound(new int[] {2, 1, 3, 2}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// multiple elements -- found last position
		bool = labObj.isFound(new int[] {5, 1, 3, 2}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// multiple elements -- found middle position
		bool = labObj.isFound(new int[] {5, 1, 2, 5}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		//***********
		// timesFound
		//***********

		System.out.println("\nTesting timesFound\n");
		testNum = 1; 

		// empty array
		val = labObj.timesFound(new int[] {}, 1);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// one element array - found 
		val = labObj.timesFound(new int[] {1}, 1);
		System.out.println(testNum + ": " + testObj.validate(1, val));
		++testNum; 

		// one element array - not found 
		val = labObj.timesFound(new int[] {1}, 2);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// multiple elements - not found 
		val = labObj.timesFound(new int[] {7, 1, 4, 7, 9, 3}, 2);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// multiple elements - found once 
		val = labObj.timesFound(new int[] {3, 7, 5, 4, 2, 7, 8}, 2);
		System.out.println(testNum + ": " + testObj.validate(1, val));
		++testNum; 

		// multiple elements - found first and last
		val = labObj.timesFound(new int[] {3, 7, 5, 4, 2, 7, 3}, 3);
		System.out.println(testNum + ": " + testObj.validate(2, val));
		++testNum; 

		// multiple elements - all elements match 
		val = labObj.timesFound(new int[] {5, 5, 5, 5, 5, 5, 5}, 5);
		System.out.println(testNum + ": " + testObj.validate(7, val));
		++testNum; 

		//********
		// reverse
		//********

		System.out.println("\nTesting reverse\n");

		int[] vals = null; 
		testNum = 1; 

		// empty 
		vals = labObj.reverse(new int[] {});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {}));
		++testNum; 

		// one element 
		vals = labObj.reverse(new int[] {1});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {1}));
		++testNum; 

		// small array 
		vals = labObj.reverse(new int[] {1,2,3});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {3,2,1}));
		++testNum; 

		// large array 
		vals = labObj.reverse(new int[] {5, 17, 41, 2, 13, 6, 21, 23, 19, 35, 49, 86});
		System.out.println(testNum + ": " + testObj.validate(vals, 
							   new int[] {86, 49, 35, 19, 23, 21, 6, 13, 2, 41, 17, 5}));
		++testNum; 
		
		
		
		
		//SearchFor
		System.out.println("\n****TESTING THE SEARCHFOR METHOD****");
		SearchFor forObj = new SearchFor();

		//******
		// range
		//******

		System.out.println("\nTesting range\n");
		testNum = 1; 
		result = "";
		
		// empty array
		val = forObj.range(new int[] {});
		System.out.println(testNum + ": " + testObj.validate(0, val));		
		++testNum; 

		// one element array
		val = forObj.range(new int[] {1});
		System.out.println(testNum + ": " + testObj.validate(0, val));		
		++testNum; 

		// multiple elements, ascending order
		val = forObj.range(new int[] {1, 2, 3, 4, 5});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, descending order 
		val = forObj.range(new int[] {5, 4, 3, 2, 1});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, min before max
		val = forObj.range(new int[] {3, 1, 4, 5, 2});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, min after max
		val = forObj.range(new int[] {2, 3, 5, 1, 4});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		//********
		// isFound
		//********

		System.out.println("\nTesting isFound\n");
		testNum = 1; 

		bool = false; 

		// empty array
		bool = forObj.isFound(new int[] {}, 1);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// one element array -- found 
		bool = forObj.isFound(new int[] {1}, 1);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// one element array -- not found 
		bool = forObj.isFound(new int[] {1}, 2);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// multiple elements -- not found 
		bool = forObj.isFound(new int[] {1, 8, 7, 3, 5, 9}, 2);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// multiple elements -- found first position
		bool = forObj.isFound(new int[] {2, 1, 3, 2}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// multiple elements -- found last position
		bool = forObj.isFound(new int[] {5, 1, 3, 2}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// multiple elements -- found middle position
		bool = forObj.isFound(new int[] {5, 1, 2, 5}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		//***********
		// timesFound
		//***********

		System.out.println("\nTesting timesFound\n");
		testNum = 1; 

		// empty array
		val = forObj.timesFound(new int[] {}, 1);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// one element array - found 
		val = forObj.timesFound(new int[] {1}, 1);
		System.out.println(testNum + ": " + testObj.validate(1, val));
		++testNum; 

		// one element array - not found 
		val = forObj.timesFound(new int[] {1}, 2);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// multiple elements - not found 
		val = forObj.timesFound(new int[] {7, 1, 4, 7, 9, 3}, 2);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// multiple elements - found once 
		val = forObj.timesFound(new int[] {3, 7, 5, 4, 2, 7, 8}, 2);
		System.out.println(testNum + ": " + testObj.validate(1, val));
		++testNum; 

		// multiple elements - found first and last
		val = forObj.timesFound(new int[] {3, 7, 5, 4, 2, 7, 3}, 3);
		System.out.println(testNum + ": " + testObj.validate(2, val));
		++testNum; 

		// multiple elements - all elements match 
		val = forObj.timesFound(new int[] {5, 5, 5, 5, 5, 5, 5}, 5);
		System.out.println(testNum + ": " + testObj.validate(7, val));
		++testNum; 

		//********
		// reverse
		//********

		System.out.println("\nTesting reverse\n");

		vals = null; 
		testNum = 1; 

		// empty 
		vals = forObj.reverse(new int[] {});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {}));
		++testNum; 

		// one element 
		vals = forObj.reverse(new int[] {1});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {1}));
		++testNum; 

		// small array 
		vals = forObj.reverse(new int[] {1,2,3});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {3,2,1}));
		++testNum; 

		// large array 
		vals = forObj.reverse(new int[] {5, 17, 41, 2, 13, 6, 21, 23, 19, 35, 49, 86});
		System.out.println(testNum + ": " + testObj.validate(vals, 
							   new int[] {86, 49, 35, 19, 23, 21, 6, 13, 2, 41, 17, 5}));
		++testNum; 
		
		
		
		
		//SeachWhile
		System.out.println("\n****TESTING THE SEARCHWHILE METHOD****");
		SearchWhile whileObj = new SearchWhile();

		//******
		// range
		//******

		System.out.println("\nTesting range\n");
		testNum = 1; 
		result = "";
		
		// empty array
		val = whileObj.range(new int[] {});
		System.out.println(testNum + ": " + testObj.validate(0, val));		
		++testNum; 

		// one element array
		val = whileObj.range(new int[] {1});
		System.out.println(testNum + ": " + testObj.validate(0, val));		
		++testNum; 

		// multiple elements, ascending order
		val = whileObj.range(new int[] {1, 2, 3, 4, 5});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, descending order 
		val = whileObj.range(new int[] {5, 4, 3, 2, 1});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, min before max
		val = whileObj.range(new int[] {3, 1, 4, 5, 2});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, min after max
		val = whileObj.range(new int[] {2, 3, 5, 1, 4});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		//********
		// isFound
		//********

		System.out.println("\nTesting isFound\n");
		testNum = 1; 

		bool = false; 

		// empty array
		bool = whileObj.isFound(new int[] {}, 1);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// one element array -- found 
		bool = whileObj.isFound(new int[] {1}, 1);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// one element array -- not found 
		bool = whileObj.isFound(new int[] {1}, 2);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// multiple elements -- not found 
		bool = whileObj.isFound(new int[] {1, 8, 7, 3, 5, 9}, 2);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// multiple elements -- found first position
		bool = whileObj.isFound(new int[] {2, 1, 3, 2}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// multiple elements -- found last position
		bool = whileObj.isFound(new int[] {5, 1, 3, 2}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// multiple elements -- found middle position
		bool = whileObj.isFound(new int[] {5, 1, 2, 5}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		//***********
		// timesFound
		//***********

		System.out.println("\nTesting timesFound\n");
		testNum = 1; 

		// empty array
		val = whileObj.timesFound(new int[] {}, 1);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// one element array - found 
		val = whileObj.timesFound(new int[] {1}, 1);
		System.out.println(testNum + ": " + testObj.validate(1, val));
		++testNum; 

		// one element array - not found 
		val = whileObj.timesFound(new int[] {1}, 2);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// multiple elements - not found 
		val = whileObj.timesFound(new int[] {7, 1, 4, 7, 9, 3}, 2);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// multiple elements - found once 
		val = whileObj.timesFound(new int[] {3, 7, 5, 4, 2, 7, 8}, 2);
		System.out.println(testNum + ": " + testObj.validate(1, val));
		++testNum; 

		// multiple elements - found first and last
		val = whileObj.timesFound(new int[] {3, 7, 5, 4, 2, 7, 3}, 3);
		System.out.println(testNum + ": " + testObj.validate(2, val));
		++testNum; 

		// multiple elements - all elements match 
		val = whileObj.timesFound(new int[] {5, 5, 5, 5, 5, 5, 5}, 5);
		System.out.println(testNum + ": " + testObj.validate(7, val));
		++testNum; 

		//********
		// reverse
		//********

		System.out.println("\nTesting reverse\n");

		vals = null; 
		testNum = 1; 

		// empty 
		vals = whileObj.reverse(new int[] {});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {}));
		++testNum; 

		// one element 
		vals = whileObj.reverse(new int[] {1});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {1}));
		++testNum; 

		// small array 
		vals = whileObj.reverse(new int[] {1,2,3});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {3,2,1}));
		++testNum; 

		// large array 
		vals = whileObj.reverse(new int[] {5, 17, 41, 2, 13, 6, 21, 23, 19, 35, 49, 86});
		System.out.println(testNum + ": " + testObj.validate(vals, 
							   new int[] {86, 49, 35, 19, 23, 21, 6, 13, 2, 41, 17, 5}));
		++testNum; 
		
		
		
		
		//SearchDo
		System.out.println("\n****TESTING THE SEARCHDO METHOD****");
		SearchDo doObj = new SearchDo();

		//******
		// range
		//******

		System.out.println("\nTesting range\n");
		testNum = 1; 
		result = "";
		
		// empty array
		val = doObj.range(new int[] {});
		System.out.println(testNum + ": " + testObj.validate(0, val));		
		++testNum; 

		// one element array
		val = doObj.range(new int[] {1});
		System.out.println(testNum + ": " + testObj.validate(0, val));		
		++testNum; 

		// multiple elements, ascending order
		val = doObj.range(new int[] {1, 2, 3, 4, 5});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, descending order 
		val = doObj.range(new int[] {5, 4, 3, 2, 1});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, min before max
		val = doObj.range(new int[] {3, 1, 4, 5, 2});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, min after max
		val = doObj.range(new int[] {2, 3, 5, 1, 4});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		//********
		// isFound
		//********

		System.out.println("\nTesting isFound\n");
		testNum = 1; 

		bool = false; 

		// empty array
		bool = doObj.isFound(new int[] {}, 1);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// one element array -- found 
		bool = doObj.isFound(new int[] {1}, 1);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// one element array -- not found 
		bool = doObj.isFound(new int[] {1}, 2);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// multiple elements -- not found 
		bool = doObj.isFound(new int[] {1, 8, 7, 3, 5, 9}, 2);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// multiple elements -- found first position
		bool = doObj.isFound(new int[] {2, 1, 3, 2}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// multiple elements -- found last position
		bool = doObj.isFound(new int[] {5, 1, 3, 2}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// multiple elements -- found middle position
		bool = doObj.isFound(new int[] {5, 1, 2, 5}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		//***********
		// timesFound
		//***********

		System.out.println("\nTesting timesFound\n");
		testNum = 1; 

		// empty array
		val = doObj.timesFound(new int[] {}, 1);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// one element array - found 
		val = doObj.timesFound(new int[] {1}, 1);
		System.out.println(testNum + ": " + testObj.validate(1, val));
		++testNum; 

		// one element array - not found 
		val = doObj.timesFound(new int[] {1}, 2);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// multiple elements - not found 
		val = doObj.timesFound(new int[] {7, 1, 4, 7, 9, 3}, 2);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// multiple elements - found once 
		val = doObj.timesFound(new int[] {3, 7, 5, 4, 2, 7, 8}, 2);
		System.out.println(testNum + ": " + testObj.validate(1, val));
		++testNum; 

		// multiple elements - found first and last
		val = doObj.timesFound(new int[] {3, 7, 5, 4, 2, 7, 3}, 3);
		System.out.println(testNum + ": " + testObj.validate(2, val));
		++testNum; 

		// multiple elements - all elements match 
		val = doObj.timesFound(new int[] {5, 5, 5, 5, 5, 5, 5}, 5);
		System.out.println(testNum + ": " + testObj.validate(7, val));
		++testNum; 

		//********
		// reverse
		//********

		System.out.println("\nTesting reverse\n");

		vals = null; 
		testNum = 1; 

		// empty 
		vals = doObj.reverse(new int[] {});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {}));
		++testNum; 

		// one element 
		vals = doObj.reverse(new int[] {1});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {1}));
		++testNum; 

		// small array 
		vals = doObj.reverse(new int[] {1,2,3});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {3,2,1}));
		++testNum; 

		// large array 
		vals = doObj.reverse(new int[] {5, 17, 41, 2, 13, 6, 21, 23, 19, 35, 49, 86});
		System.out.println(testNum + ": " + testObj.validate(vals, 
							   new int[] {86, 49, 35, 19, 23, 21, 6, 13, 2, 41, 17, 5}));
		++testNum; 
		
		
		
		
		//SearchForEach
		System.out.println("\n****TESTING THE SEARCHFOREACH METHOD****");
		SearchForEach forEachObj = new SearchForEach();

		//******
		// range
		//******

		System.out.println("\nTesting range\n");
		testNum = 1; 
		result = "";
		
		// empty array
		val = forEachObj.range(new int[] {});
		System.out.println(testNum + ": " + testObj.validate(0, val));		
		++testNum; 

		// one element array
		val = forEachObj.range(new int[] {1});
		System.out.println(testNum + ": " + testObj.validate(0, val));		
		++testNum; 

		// multiple elements, ascending order
		val = forEachObj.range(new int[] {1, 2, 3, 4, 5});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, descending order 
		val = forEachObj.range(new int[] {5, 4, 3, 2, 1});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, min before max
		val = forEachObj.range(new int[] {3, 1, 4, 5, 2});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		// multiple elements, min after max
		val = forEachObj.range(new int[] {2, 3, 5, 1, 4});
		System.out.println(testNum + ": " + testObj.validate(4, val));		
		++testNum; 

		//********
		// isFound
		//********

		System.out.println("\nTesting isFound\n");
		testNum = 1; 

		bool = false; 

		// empty array
		bool = forEachObj.isFound(new int[] {}, 1);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// one element array -- found 
		bool = forEachObj.isFound(new int[] {1}, 1);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// one element array -- not found 
		bool = forEachObj.isFound(new int[] {1}, 2);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// multiple elements -- not found 
		bool = forEachObj.isFound(new int[] {1, 8, 7, 3, 5, 9}, 2);
		System.out.println(testNum + ": " + testObj.validate(false, bool));		
		++testNum; 

		// multiple elements -- found first position
		bool = forEachObj.isFound(new int[] {2, 1, 3, 2}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// multiple elements -- found last position
		bool = forEachObj.isFound(new int[] {5, 1, 3, 2}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		// multiple elements -- found middle position
		bool = forEachObj.isFound(new int[] {5, 1, 2, 5}, 2);
		System.out.println(testNum + ": " + testObj.validate(true, bool));		
		++testNum; 

		//***********
		// timesFound
		//***********

		System.out.println("\nTesting timesFound\n");
		testNum = 1; 

		// empty array
		val = forEachObj.timesFound(new int[] {}, 1);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// one element array - found 
		val = forEachObj.timesFound(new int[] {1}, 1);
		System.out.println(testNum + ": " + testObj.validate(1, val));
		++testNum; 

		// one element array - not found 
		val = forEachObj.timesFound(new int[] {1}, 2);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// multiple elements - not found 
		val = forEachObj.timesFound(new int[] {7, 1, 4, 7, 9, 3}, 2);
		System.out.println(testNum + ": " + testObj.validate(0, val));
		++testNum; 

		// multiple elements - found once 
		val = forEachObj.timesFound(new int[] {3, 7, 5, 4, 2, 7, 8}, 2);
		System.out.println(testNum + ": " + testObj.validate(1, val));
		++testNum; 

		// multiple elements - found first and last
		val = forEachObj.timesFound(new int[] {3, 7, 5, 4, 2, 7, 3}, 3);
		System.out.println(testNum + ": " + testObj.validate(2, val));
		++testNum; 

		// multiple elements - all elements match 
		val = forEachObj.timesFound(new int[] {5, 5, 5, 5, 5, 5, 5}, 5);
		System.out.println(testNum + ": " + testObj.validate(7, val));
		++testNum; 

		//********
		// reverse
		//********

		System.out.println("\nTesting reverse\n");

		vals = null; 
		testNum = 1; 

		// empty 
		vals = forEachObj.reverse(new int[] {});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {}));
		++testNum; 

		// one element 
		vals = forEachObj.reverse(new int[] {1});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {1}));
		++testNum; 

		// small array 
		vals = forEachObj.reverse(new int[] {1,2,3});
		System.out.println(testNum + ": " + testObj.validate(vals, new int[] {3,2,1}));
		++testNum; 

		// large array 
		vals = forEachObj.reverse(new int[] {5, 17, 41, 2, 13, 6, 21, 23, 19, 35, 49, 86});
		System.out.println(testNum + ": " + testObj.validate(vals, 
							   new int[] {86, 49, 35, 19, 23, 21, 6, 13, 2, 41, 17, 5}));
		++testNum; 
	}
}

