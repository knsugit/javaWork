public class getPrime{
	public static void main(String args[]){
		prime p = new prime(30);
		p.findPrime();
		for(int i=2; i<p.Array.length; i++){
			if(p.Array[i] == 1){
				System.out.println(i);
			}
		}
	}
}

class prime{
	int[] Array = new int[1000];
	int len;
	prime(int n){
		len = n;
	}
	
	void findPrime(){
		int count = 0;
		for(int i=2; i<len; i++){
			for(int j=1; j<=i; j++){
				if(i%j == 0){
					count++;
				}
			}
			if(count<=2){
				Array[i] = 1;
			}
			else{
				Array[i] = 0;
			}
			count = 0;
		}
	}
}