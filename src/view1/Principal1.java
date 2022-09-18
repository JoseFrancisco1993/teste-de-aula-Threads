package view1;
	

	import java.util.concurrent.Semaphore;
	import controller.Controller1;
	

	public class Principal1 {
		
		public static void main(String[] args) {
			Semaphore semaforo = new Semaphore(1);
			
			for(int i = 0; i < 21; i++) {
				Controller1 tc = new Controller1();
				tc.start();
			}
		}
	

	}
