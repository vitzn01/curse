package lambdas;

public class Threads {

	public static void main(String[] args) {
		
		
		Runnable t2 = new Trabalho1();
		Runnable t1 = new Runnable() {
			
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println("tarefa#02");
					try {
						Thread.sleep(100);
					}catch (Exception e) {
											}
				}
			}
		};
		
		Runnable trabalho3 = () -> {
			
			for(int i = 0; i < 10; i++) {
				System.out.println("tarefa#02");
				try {
					Thread.sleep(100);
				}catch (Exception e) {
										}
		}
		};
		
		Thread t11 = new Thread(t1);
		Thread t22 = new Thread(t2);
		Thread t33 = new Thread(trabalho3);
		t11.start();
		t22.start();
		t33.start();
		
		}
	}
	
