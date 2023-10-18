public class Statist{
    
    private String name; 
    private char geschlecht; 

    public Statist(String name, char geschlecht){
        this.name = name; 
        this.geschlecht = geschlecht; 
        if(geschlecht != 'm' && geschlecht != 'f' && geschlecht != 'd'){
            System.out.println("Ungültige Angabe für Geschlecht!");
        }
    }

    public String getName(){return name;}
    public char getGeschlecht(){return geschlecht;}
    public void setName(String name){this.name = name;}
    public void setGeschlecht(char geschlecht){this.geschlecht = geschlecht;}
<<<<<<< HEAD



=======
>>>>>>> 26cbf075db0b3d286cc86842533e9cba115578f9
}