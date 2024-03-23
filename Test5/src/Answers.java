public class Answers {
	public static void main(String[] args) {
		Ex1();
		Ex2();
		Ex3();
		Ex4();
		Ex5();
		Ex6();
	}
	//--------------------------------------------------------------------
	public static void Ex1(){
		int[] arrA = {1,2,3,4,5,9,6};
		int[] arrB ={3,4,5,6,7,8,9};
		aCuttingB(arrA,arrB);
	}
	public static void aCuttingB(int[] arrA,int[] arrB){
		String strA = "";
		String strB = "";
		String res = "";
		int length = arrB.length;
		if (arrA.length > arrB.length){
			length = arrA.length;
		}
		for (int i = 0; i <arrA.length; i++) {
			strA += arrA[i];
		}
		for (int i = 0; i < arrB.length; i++) {
			strB += arrB[i];
		}
		for (int i = 0; i <= length-1; i++) {
			for (int j = 0; j < length; j++) {
				if (strA.charAt(i) == strB.charAt(j)){
					if (!(res.contains(strA.charAt(i)+""))){
						res += strA.charAt(i);
					}
				}
			}
		}
		for (int i = 0; i < res.length(); i++) {
			System.out.print(res.charAt(i)+" ");
		}

	}
	//--------------------------------------------------------------------
	public static void Ex2(){
		String[] strArr ={"aba", "AMA","YAKOV", "noa"}; //Big
		String res = moreLowercaseOrUppercaseLetters(strArr);
		System.out.println(res);
	}
	public static String moreLowercaseOrUppercaseLetters(String[] strArr){
		int countSmall = 0;
		int countBig = 0;
		for (int i = 0; i < strArr.length -1; i++) {
			if (strArr[i].charAt(i) >= 'A' && strArr[i].charAt(i) <='Z'){
				countBig++;
			}else {
				countSmall++;
			}
		}
		String res ="";
		if (countBig > countSmall){
			res = "big";
		}else {
			res = "small";
		}
		return res;
	}
	//--------------------------------------------------------------------
	public static void Ex3(){
		int[] arr ={12,20,36,18,6,8,100,50,10};
		int[] newArr = howManyNumbersDiv(arr);
		for (int index : newArr){
			System.out.print(index +" ");
		}
	}
	public static int[] howManyNumbersDiv(int[] arr){
		int[] newArr = new int[9];
		int index = 0;
		for (int i = 2; i <= arr.length; i++) {
			for (int j = 0; j <= arr.length -1; j++) {
				if (arr[j] % i == 0){
					newArr[index]++;
				}
			}
			index++;
		}
		return newArr;
	}
	//--------------------------------------------------------------------
	public static void Ex4(){
		String str = "This is an example";
		String str2 = "Hi whats up";
		printReversedSentence(str);
		System.out.println();
		printReversedSentence(str2);
	}
	public static void printReversedSentence(String str){
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			String res = reversStr(strArr[i]);
			System.out.print(res+" ");
		}
	}
	public static String reversStr(String str){
		String revers = "";
		for (int i = str.length()-1; i >= 0 ; i--) {
			revers += str.charAt(i);
		}
		return revers;
	}
	//--------------------------------------------------------------------
	public static void Ex5(){
		int number = 5643;
		int[] reducing = reducingNumber(number);
		for(int index : reducing){
			System.out.print(index);
		}
	}
	public static int[]  reducingNumber(int number){
		int end = 0;
		int temp = number;
		for (int i = 0; i <= 9 ; i++) {
			if (temp % 10 == i){
				end = i;
			}
		}
		int start = 0;
		while (number > 0){
			start = number %10;
			number /=10;
		}
		int[] arr = new int[2];
		arr[0] = start;
		arr[1] = end;
		return arr;
	}
	//--------------------------------------------------------------------
	public static void Ex6(){
		int num = 9;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= 9; j++) {
				if (i + j == num){
					System.out.print(i + "," + j +" ");
				}
				}
			}
		}
	}

