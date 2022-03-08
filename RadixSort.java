class RadixSort{
	public static void main(String[]args){
		int a[] = {10,2,15,321,18,9,52,31,5};
		String newA[] = new String[a.length];

		int max=a[0];
		for(int i=0; i<a.length; i++){
			if (max<a[i]){
				max = a[i];
			}
		}

		int ml = 0;
		while(max>0){
			max = max/10;
			ml++;
		}
		
		String c;
		String newC = "";
		int dl = 0; //dynamic length
		for(int i=0; i<a.length; i++){
			c = Integer.toString(a[i]);
			int ln = c.length();
			dl = ml-1;

			for(int j=0; j<ml; j++){
				if (dl==ln){
					while(ln<ml){
						c = "0"+c;
						ln++;
					}
				}
				dl--;
			}
			newA[i] = c;
		}

		String tempChar="";

		String a0[] = new String[a.length];
		String a1[] = new String[a.length];
		String a2[] = new String[a.length];
		String a3[] = new String[a.length];
		String a4[] = new String[a.length];
		String a5[] = new String[a.length];
		String a6[] = new String[a.length];
		String a7[] = new String[a.length];
		String a8[] = new String[a.length];
		String a9[] = new String[a.length];
		char charc[] = new char[ml];

		int chechChar = ml-1;
		int aa0, aa1, aa2, aa3, aa4, aa5, aa6, aa7, aa8, aa9 = 0;
		for(int i=2; i<ml; i++){
			for(int i=0; i<newA.length; i++){
				char charc[] = newA[i].toCharArray();
				tempChar = charc[chechChar];

				switch(tempChar){
					case 0:
						a0[aa0] = newA[i];
						aa0++;
						break;
					case 1:
						a1[aa1] = newA[i];
						aa1++;
						break;
					case 2:
						a2[aa2] = newA[i];
						aa2++;
						break;
					case 3:
						a3[aa3] = newA[i];
						aa3++;
						break;
					case 4:
						a4[aa4] = newA[i];
						aa4++;
						break;
					case 5:
						a5[aa5] = newA[i];
						aa5++;
						break;
					case 6:
						a6[aa6] = newA[i];
						aa6++;
						break;
					case 7:
						a7[aa7] = newA[i];
						aa7++;
						break;
					case 8:
						a8[aa8] = newA[i];
						aa8++;
						break;
					case 9:
						a9[aa9] = newA[i];
						aa9++;
						break;
				}
			}
			aa0=0;aa1=0; aa2=0; aa3=0; aa4=0; aa5=0; aa6=0; aa7=0; aa8=0; aa9=0;
			chechChar--;

			int x = 0;
			for(int i=0; i<a.length; i++){
				if(a0[i]!=""){
					newA[x] = a0[i];
				}
				else{
					break;
				}
			}
			x++;

			for(int i=0; i<a.length; i++){
				if(a1[i]!=""){
					newA[x] = a1[i];
				}
				else{
					break;
				}
			}
			x++;
			for(int i=0; i<a.length; i++){
				if(a2[i]!=""){
					newA[x] = a2[i];
				}
				else{
					break;
				}
			}
			x++;
			for(int i=0; i<a.length; i++){
				if(a3[i]!=""){
					newA[x] = a3[i];
				}
				else{
					break;
				}
			}
			x++;
			for(int i=0; i<a.length; i++){
				if(a4[i]!=""){
					newA[x] = a4[i];
				}
				else{
					break;
				}
			}
			x++;
			for(int i=0; i<a.length; i++){
				if(a5[i]!=""){
					newA[x] = a5[i];
				}
				else{
					break;
				}
			}
			x++;
			for(int i=0; i<a.length; i++){
				if(a6[i]!=""){
					newA[x] = a6[i];
				}
				else{
					break;
				}
			}
			x++;
			for(int i=0; i<a.length; i++){
				if(a7[i]!=""){
					newA[x] = a7[i];
				}
				else{
					break;
				}
			}
			x++;
			for(int i=0; i<a.length; i++){
				if(a8[i]!=""){
					newA[x] = a8[i];
				}
				else{
					break;
				}
			}
			x++;
			for(int i=0; i<a.length; i++){
				if(a9[i]!=""){
					newA[x] = a9[i];
				}
				else{
					break;
				}
			}
		}

		for(int i=0; i<newA.length; i++){
			System.out.println(newA[i]);
		}


	}
}