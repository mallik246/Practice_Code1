package practice_code;

public class Fabbicinno {

	public static void main(String[] args) {
		int previous=0;
		int next=1;
		
		for(int i =0; i<=10; ++i) {
			
			System.out.print(previous + " " );
			
			int start=previous+next;
			
			previous=next;
			
			next=start;
			
		}

	}

}
