package fios3;

/**
 *
 * @author epastorizalorenzo
 */
public class Fios3 extends Thread {
    
    public static void main(String[] args) throws InterruptedException {
       Thread juan = new Thread (new Fios3("Juan"));
       Thread luis = new Thread (new Fios3("Luis"));
       Thread noelia = new Thread (new Fios3("Noelia"));
       Thread pepe = new Thread (new Fios3("Pepe"));
       Thread ana = new Thread (new Fios3("Ana"));
        
       juan.start();
       juan.join();

       luis.start();
       luis.join();
       
       noelia.start();
       noelia.join();

       pepe.start();
       pepe.join();
       
       ana.start();
        
    }
    
     public Fios3 (String str) {
        super(str);    
         
     }
     public void run(){
        for (int i=0; i<10; i++)
            System.out.println(i + " " + getName());
            System.out.println(" Termina thread " + getName());
                
       try {   
        System.out.println("Esperando a recibir dato");
        Thread.sleep(300);

    } catch
        (InterruptedException e){
        System.out.println ("Fío interrumpido");
        return;
        
}
    
}
            }   
       
      
