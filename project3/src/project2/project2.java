package project2;

import java.util.Scanner;

public class project2 {
	public static void main(String args[])
	{
		int i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence: "); //user input
		String str = sc.nextLine(); //storing input 
		String arr[] = str.split(" "); //finding spaces ,split,store in array
		System.out.println("required words in a set: ");
		n= sc.nextInt(); //storing input 
		if(n==0||n>=arr.length) //if n equals to zero or greater or equal to given n 
			System.out.println("Invalid number");//then print invalid
		else {
			System.out.printf("Words in the sentence are: \n");
			//since the index starts from zero i should be less than length-(n-1) 
			for (i = 0; i < (arr.length-(n-1));i++) {
				//print n words
				for(j = 0;j<n;j++) {
					//print each word 
					System.out.print(arr[i+j]);
					System.out.print("\t");
				}
				//newline
				System.out.print("\n");
			}
		
		
	}

}
}
