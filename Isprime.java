package week1.day1;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		int n=10;
		
		for (int i=2;i<=n;i++) {
			
			int cnt=0;
		
			for (int j=1;j<i;j++) {

				if (i%j==0) 
				cnt++;
			
		}
			if (cnt > 1)
			{ 
				System.out.println("Non-Prime No :" +i);
			}else {
				System.out.println("Prime No :" +i);
			}
				
			}
		}
	}

