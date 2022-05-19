package lesson20;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		super();
		this.name = name;

	}

	@Override
	public synchronized void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть к≥льк≥сть чисел, €к≥ мають в≥добразитись по зростанню " + " (починаючи в≥д 1 лише ц≥л≥ числа ");
		int n = sc.nextInt();

		long[] arr = new long[n + 1];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			System.out.println(name + arr[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
