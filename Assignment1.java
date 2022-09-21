
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, a, x=0, y;
		for(i=1; i<9; i++) {
			for(a=8; a>i; a--) {
			System.out.printf("%5s", " ");
			}
			for(j=0; j<i; j++) {
				x=1<<j;
			System.out.printf("%5s",x);
			}
			for(j=1; j<i; j++) {
				y=x>>j;
			System.out.printf("%5s",y);
			}
			System.out.println();
			
	}
	}

}
