
import java.util.Scanner;
import java.util.Arrays;
public class Test1 {
	/*
	 * 4.1 Create Array of primitive types
	 * 
	 * Objective -- Accept no of data samples(of type double) from User(using
	 * scanner) Create suitable array & display it using for-each loop , to confirm
	 * default values.
	 * 
	 * Accept data from User(scanner) & store it in the array. Display array data
	 * using for loop. Display array data using for-each loop
	 * 
	 */

	public static void main(String[] args) {
//		int count;
//		System.out.println(count);
		Scanner sc = new Scanner(System.in);
		//sc is class type of reference which is refering to Scanner class instance 
		
		System.out.println("How many double numbers to enter");
		double[] data;// da: uninit prim datatype var, array type of reference
        // the stack, for storing the ref.
		//jvm specific bytes allocated to da ref
		//da will refer to array object holding prim double
		data=new double[sc.nextInt()];
		//[D class will be loaded in meta
		//array type of obj created in heap
		//ref assign to data
		//display array contents: def init contents
		// for-each:no indices are required
		System.out.println("default contents");

		for(double d : data) 
		{
			//d=data[0],d=data[1]..d=data[data.length-1]
			
			System.out.println(d);
		}
		
		//display name of the loaded class for this double array
		System.out.println("Class loaded"+data.getClass());
		double[] data2=new double[100];
		//class loaded is same 
		//new obj is created with its ref in data2
		System.out.println("Class loaded"+data2.getClass());
		double[][] data3=new double[3][2];
		///class loaded is [[D
				//new obj is created with its ref in data2
		System.out.println("Class loaded"+data3.getClass());

		//s	 * Accept data from User(scanner) & store it in the array. Display array data
 	   System.out.println("Arraydata");
    for(int i=0;i<data.length;i++) {
    	   
    	   data[i]=sc.nextDouble();
       }
    
	System.out.println("after init default contents");

	for(double d : data) 
	{
		//d=data[0],d=data[1]..d=data[data.length-1]
		
		System.out.println(d);
	}
	System.out.println("String form arraydata");
	for(int i=0;i<data.length;i++) {
 	   
 	   System.out.println(Arrays.toString(data));
    }
 
		sc.close();
	}

}

