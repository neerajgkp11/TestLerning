package test;

public class Test {

	public static void main(String[] args) {
		System.out.println("x ki value find karni h \r\n" + "091180422478189X");
		String num = "091180422478189";
		System.out.println("num is: " + num);
		char numArry[] = num.toCharArray();
		char numEvenPos[] = new char[num.length() / 2 + 1];
		char numOddPos[] = new char[num.length() / 2];

		System.out.println("1. calculate even and odd positions and separate them");

		for (int i = 0; i < numArry.length; i++) {
			if (i % 2 == 0) {
				numEvenPos[i / 2] = numArry[i];
			} else {
				numOddPos[i / 2] = numArry[i];
			}
		}

		System.out.println("numEvenPos  : " + String.valueOf(numEvenPos));
		System.out.println("numOddPos  : " + String.valueOf(numOddPos));

		System.out.println("2. even ko multiply by 2, with in elements first");
		System.out.println(
				"3. if the multiplied number is greater or equal to 10, then split them and add them , finally put them back in the stack ");
		for (int j = 0; j < numEvenPos.length; j++) {
			int a = Character.getNumericValue(numEvenPos[j]) * 2;
			if (a < 10) {
				numEvenPos[j] = Integer.toString(a).charAt(0);
			} else {
				char numCharArry[] = Integer.toString(a).toCharArray();
				numEvenPos[j] = Integer.toString(Integer.sum(Character.getNumericValue(numCharArry[0]),
						Character.getNumericValue(numCharArry[1]))).charAt(0);
			}

		}
		System.out.println("numEvenPos  : " + String.valueOf(numEvenPos));

		System.out.println("4. add all even, and all odd");
		int total = 0;
		for (int k = 0; k < numEvenPos.length; k++) {
			total = total + Character.getNumericValue(numEvenPos[k]);
			try {
				total = total + Character.getNumericValue(numOddPos[k]);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("total= " + total);

		System.out.println("5 total mod with 10");
		System.out.println(
				"6. check if that is equal to 0, if zero print the number , else minus it by 10 and print the number");

		int modBy10 = total % 10;
		if (modBy10 == 0) {
			System.out.println("final Result: " + modBy10);
		} else {
			System.out.println("final Result: " + (10 - modBy10));
		}

	}

}
