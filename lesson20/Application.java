package lesson20;

public class Application {

	public static void main(String[] args) {
		
		MyThread tr = new MyThread("Потік Thread: --");
		tr.start();

		RunnableThread runnable = new RunnableThread("Потік Runnable: --");
		Thread rt = new Thread(runnable);
		rt.run();
		
	}

}
