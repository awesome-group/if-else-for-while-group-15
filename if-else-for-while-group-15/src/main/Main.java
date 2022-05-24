package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		// primitive Referans
		// byte short int long float double char boolean

		// 10 eded cutdur
		// eded 5e bolunur

		// 15 ededdi tekdir
		// 15 ededi 5e bolunur

		// 17 ededi tekdir

		// if if if - bu zaman her bir if yoxlanilir
		// if (else if) - bu zaman eger if odenmese else if yoxlanilir ama ife daxil
		// olunarsa else if işləməz
		// if else - if işə düşməsə mütləq else işə düşəcək

		// massivin daxilindeki en boyuk ededin tapilmasi
		// consoldan bir eded daxil edin ve massivin butun elementlerini hemin eded
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("eded daxil edin");
		int a = scanner.nextInt();
		if (a % 2 == 0)
			System.out.println(a + " ededi cutdur");
		if (a % 5 == 0)
			System.out.println(a + " ededi 5e bolunur");
		if (a % 2 == 1)
			System.out.println(a + " ededi tekdir");

//		for (int i = 0; i < 10; i++) { // i=0-j
//			if (i == 6) {
//				continue;
//			}
//			System.out.println(i);
//		}

//		int i=0;
//		while(i>10) {
//			i++;
//			if(i==6) {
//				continue;
//			}
//			System.out.println(i);
//		}

//		do {
//			i++;
//			System.out.println("salam");
//		}while(i>10);

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		System.out.println(arr[11]);
		for (int i = 0; i < arr.length; i++) {// i=0 1 2 3 4 5 6 7 8
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int[][] arr2 = new int[][] {
			{ 1, 2 },
			{ 3, 4 },
			{ 5, 6 }
		};
		System.out.println(arr2[2][1]);

	}
}