package inheritance;

public class SimpleInheritance {

	public static void main(String[] args) {
		Super superob=new Super();
		Subclass subOb=new Subclass();
		superob.i=10;
		 superob.j = 20;
		    System.out.println("Contents of superOb: ");
		    superob.showij();
		    System.out.println();
		    subOb.i = 7;
		    subOb.j = 8;
		    subOb.k = 9; 
		    System.out.println("Contents of subOb: ");
		    subOb.showij();
		    subOb.showk();
		    System.out.println();

		    System.out.println("Sum of i, j and k in subOb:");
		    subOb.sum();
	}

}
