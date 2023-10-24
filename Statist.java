public class Statist{
    
    private String name; 
    private char geschlecht; 
    private int score;

    public Statist(String name, char geschlecht, int score){
        this.name = name; 
        this.geschlecht = geschlecht; 
        this.score = score;
        if(geschlecht != 'm' && geschlecht != 'f' && geschlecht != 'd'){
            System.out.println("Ungültige Angabe für Geschlecht!");
        }
    }

    public String getName(){return name;}
    public char getGeschlecht(){return geschlecht;}
    public void setName(String name){this.name = name;}
    public void setGeschlecht(char geschlecht){this.geschlecht = geschlecht;}
    public int getScore(){return score;}
    public void setScore(int score){this.score = score;}



}