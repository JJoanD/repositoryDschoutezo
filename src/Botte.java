public class Botte {
  private int litri = 100;
  private int rubinetti = 3;
  private int bevitoriInAttesa = 0;
  public synchronized void bevi(String bevitore) throws InterruptedException{

    if(litri == 0){
        System.out.println("Non c'è più vino");
        wait();
    }

    if(rubinetti == 0 || bevitoriInAttesa > rubinetti ){
        System.out.println("Tutti i rubinetti sono occupati");
        System.out.println(bevitore + " è in attesa di bere");
        bevitoriInAttesa++;
        wait();
    }

    litri--;
    if(bevitoriInAttesa > 0) bevitoriInAttesa--;
    if(rubinetti > 0)rubinetti--;
    System.out.println(bevitore + " sta bevendo");
    System.out.println("bevitori in attesa tot : " + bevitoriInAttesa);
    Thread.sleep(2000);
    notifyAll();
  }

  public synchronized void finitoDiBere(String bevitore) throws InterruptedException{
        System.out.println(bevitore + " ha finito di bere");
        Thread.sleep(1000);
        if(rubinetti >= 0 && rubinetti <4)rubinetti++;
        
            System.out.println("Nrubinetti: "+ rubinetti + " sono liberi");
        
        notifyAll();
    }

public int getLitri() {
    return litri;
}
    
    
    


}
