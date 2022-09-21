
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		final int ROWNUM = 8; // constantvariable for number of rows
		int row, column, emptySpace, ascNum=0, descNum;
		
		
		for(row=1; row<ROWNUM+1; row++) {   // for loop to iterate rows
			for(emptySpace=ROWNUM; emptySpace>row; emptySpace--) { // for loop to place spaces
			System.out.printf("%5s", " ");
			}
			for(column=0; column<row; column++) {  // for loop for ascending part
				ascNum=1<<column;
			System.out.printf("%5s",ascNum);
			}
			for(column=1; column<row; column++) {  // for loop for descending part
				descNum=ascNum>>column;
			System.out.printf("%5s",descNum);
			}
			System.out.println();
			
	}
	}

}
