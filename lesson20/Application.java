package lesson20;

public class Application {

	public static void main(String[] args) {
		
		MyThread tr = new MyThread("���� Thread: --");
		tr.start();

		RunnableThread runnable = new RunnableThread("���� Runnable: --");
		Thread rt = new Thread(runnable);
		rt.run();
		
	}

}
