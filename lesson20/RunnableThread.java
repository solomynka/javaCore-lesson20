package lesson20;

import java.util.Arrays;
import java.util.Scanner;

public class RunnableThread implements Runnable {

	private String name;

	public RunnableThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public synchronized void run() {

		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть к≥льк≥сть чисел, €к≥ мають в≥добразитись по зменшенню" + ""
				+ " (починаючи в≥д 1 лише ц≥л≥ числа ");
		int n = sc.nextInt();

		long[] arr = new long[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		int n2;

		if (n < 1) {
			System.out.println("");
		} else {

			for (int i = 2; i <= n; i++) {
				arr[i] = arr[i - 1] + arr[i - 2];
				n2 = (int) arr[i];	
			}
			for (int i = arr.length-1; i >=2 ; i--) {
				System.out.println(name + arr[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println();
			
		}

	}

}
