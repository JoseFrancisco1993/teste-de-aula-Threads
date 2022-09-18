package view1;
	

	import java.util.concurrent.Semaphore;
	import controller.Controller2;
	

	public class Principal2 {
		
		public static void main(String[] args) {
			Semaphore semaforoCozinheiro = new Semaphore(5);
			Semaphore semaforoEntrega = new Semaphore(1);
			
			for(int i = 0; i < 20; i++) {
				Controller2 j = new Controller2(semaforoCozinheiro, semaforoEntrega);
				j.start();
			}
		}
	}
