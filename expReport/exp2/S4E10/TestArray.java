public class TestArray{
	public static void main(String args[]){
		int[] array = {3, 1, 4, 7, 5};
		ArraySort as = new ArraySort(array);
		as.setOrder();
		for(int i=0; i<as.sim.length; i++){
			System.out.print(as.sim[i] + " ");
		}
	}
}

class ArraySort{
	int[] sim = new int[5];
	
	ArraySort(int[] array){
		for(int i=0; i<sim.length; i++){
			sim[i] = array[i];
		}
	}
	
	void setOrder(){
				for(int i = 0; i < sim.length - 1; i++){
			for(int j = 0; j <sim.length - i -1; j++){
				if(sim[j] > sim[j+1]){
					int temp = sim[j];
					sim[j]  = sim[j+1];
					sim[j+1] = temp;
				}
			}
		}
	}
}