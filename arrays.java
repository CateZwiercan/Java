// Cate Zwiercan
public class arrays {
	
//methods
//fix23
public static int[] fix23(int[] num){
	for (int k = 0; k < num.length; k++){
		if (num[k]== 2 && num[k + 1] == 3){
			num[k +1] = 0;
		}
	}
	return num;
}

//rowSum
public static void rowSum (int bigArray[][]){
	
	for (int row = 0; row < bigArray.length; row++){
		int totalSum = 0;
		for (int col = 0; col < bigArray[row].length; col++ ){
			totalSum += bigArray[row][col];
		}
		for (int i: bigArray[row])
			System.out.print(i +" ");
			
		System.out.println(" " + totalSum);
			
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// list arrays and there values
		int [] array1 = {1,2,3};
		int [] array2 = {2,4,3};
		int [] array3 = {2,3,9};
		int [][] bigArray = {{1,2,3,4},{5,6,7,8},{9,0,1,2},{5,8,2,7}};
	
	
		
	// call the method fix23
		array1 = fix23(array1);
		array2 = fix23(array2);
		array3 = fix23(array3);
		
	// call the method rowSum
		rowSum(bigArray);
	}

}


