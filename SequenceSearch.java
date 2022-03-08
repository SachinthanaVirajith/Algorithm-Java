class SequenceSearch{

	

	public static void main(String[]args){

		int flag = 0; // flag = 0
		int[] a = {10,45,67,34,5,68,90,43,32,47,65};
		int val = 100;

		for(int i=0; i<a.length; i++){
			if(val == a[i]){
				System.out.println(i);
				flag = 1;//flag = 1
				break;
			}

		}

		//flag=0
		if(flag==0){
			System.out.println("Number is not available");
		}
	}
}


