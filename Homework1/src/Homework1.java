public class Homework1 {
	public static void main(String[] args) {
		
		//Veriables
		String book="Matthew";
		int counter=0;
		
		for(int i=book.length()-1;i>=0;i--) {
			if(book.charAt(i)=='a'||book.charAt(i)=='A') {
				counter++;
				//i++;
			}
			else if(book.charAt(i)=='e'||book.charAt(i)=='E') {
				counter++;
				//i++;
			}
			else if(book.charAt(i)=='i'||book.charAt(i)=='I') {
				counter++;
				//i++;
			}
			else if(book.charAt(i)=='o'||book.charAt(i)=='O') {
				counter++;
				//i++;
			}
			else if(book.charAt(i)=='u'||book.charAt(i)=='U') {
				counter++;
				//i++;
			}
			//else {
				//i++;
			//}
		}
		System.out.println(counter);
	}
}
