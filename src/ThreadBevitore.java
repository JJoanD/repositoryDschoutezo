public class ThreadBevitore extends Thread{
    private Botte botte;
    private String name;
    
    public ThreadBevitore(Botte botte, String name) {
        this.botte = botte;
        this.name = name;
    }

    

    public String getNome() {
        return name;
    }



    @Override
    public void run() {
        
        try{
            botte.bevi(name);
        }catch(Exception exception){}
    }

    
}
