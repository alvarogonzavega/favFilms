package pack;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static String [] list = {"The Godfather (1972)", "2001 (1968)", "Apocalypse Now (1979)", "Raging Bull (1980)", "The Godfather: Part 2 (1974)",
			"12 Angry Men (1957)", "Goodfellas (1990)", "The Apartment (1960)", "Psycho (1960)", "Before Sunrise (1995)", "Vertigo (1958)",
			"Taxi Driver (1976)", "Alien (1979)", "Pulp Fiction (1994)", "Schindler List (1993)", "Shawshank Redemption (1994)", "Sunset Boulevard (1950)",
			"Wolf of Wall Street (2013)", "The Good, The Bad & The Ugly (1966)", "The Thing (1982)", "Big Lebowski (1998)", "City Lights (1931)",
			"The Irishman (2019)", "The Shining (1980)", "Rear Window (1954)", "Full Metal Jacket (1987)", "Boogie Nights (1997)", "Double Indemnity (1944)",
			"The Dark Knight (2008)", "The Silence of the Lambs (1992)", "Gold Rush (1925)", "Se7en (1995)", "Manchester by the Sea (2016)", "Annie Hall (1977)",
			"The Departed (2006)", "Rosemary Baby (1968)", "Heat (1995)", "The Lord of the Rings: The Return of the King (2003)"};

	public static int[] preference(int[] sort) {
		
		Scanner in = new Scanner (System.in);
		for(int i=0; i<sort.length; i++) {
			
			for(int j=i+1; j<sort.length; j++) {
				
				System.out.println("Which one do you prefer? Click 1 if the left, 0 if none and 2 if right");
				System.out.println(list[i]+" vs "+ list[j]);
				String u = in.nextLine();
				int x = Integer.parseInt(u);
				if(x==1) { sort[i]++; sort[j]--; }
				else if(x==2) { sort[i]--; sort[j]++; }
				
			}
			
		}
		return sort;
		
	}
	
	public static void order(int[] a, int[] b) {
		
		int c=0;
		do {
			
			for(int i=0; i<list.length; i++) {
				
				if(a[c]==b[i]) {
					
					System.out.println((c+1)+". "+list[i]+" ("+a[c]+")");
					c++;
					if(c==list.length) break;
					
				}
				
			}
			
		}while(c<list.length);
		
	}
	
	
	public static int[] reverse(int[] b) {
		
		int[] a = new int[b.length];
		int j = b.length;
		for(int i=0; i<b.length; i++) {
			
			a[j-1] = b[i];
			j--;
			
		}
		
		return a;
		
	}
	
	
	public static void main(String[] args) {
		
		
		int [] sort = new int[list.length];
		sort = preference(sort);
		int [] backup = Arrays.copyOf(sort, sort.length);
		Arrays.sort(sort);
		sort=reverse(sort);
		System.out.println("\n\n\n\n\n");
		order(sort, backup);
		

	}

}
