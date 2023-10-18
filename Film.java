public class Film{
    
    public Film(){
    }
    
    public void filmAusgeben(int zahl){
        switch (zahl){
            case 1: {
                System.out.println("Lieblingsfilm 1");     
                break;   
            }
            case 2: {
                System.out.println("Lieblingsfilm 2");
                break;
            }
            case 3: {   
                System.out.println("Lieblingsfilm 3");
                break;
            }
        }
    }

}