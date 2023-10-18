import java.util.Queue;
import java.util.LinkedList;
import java.util.*; 

public class Agentur{
    private Queue<Statist> statisten;
    public Agentur(){
    }   
    public void neuerStatist(String name, char geschlecht){ 
        statisten.add(new Statist(name, geschlecht));
        System.out.println("Neuer Statist erstellt mit Namen " + name);
    }
    public Queue<Statist> statistVermitteln(char geschlecht){
        Queue <Statist> gefunden = new LinkedList<Statist>();

        while(!gefunden.contains(statisten.element())){
            if (statisten.element().getGeschlecht() == geschlecht){
                gefunden.add(statisten.element());
            } else if (statisten.element().getGeschlecht() != geschlecht){
                statisten.remove();
            }
        }
        return statisten;
    }
    public Queue<Statist> mannOderFrau(char geschlecht){
        Queue <Statist> gefunden = new LinkedList<Statist>();

        while(statisten.element() != null){
            if (statisten.element().getGeschlecht() == geschlecht){
                gefunden.add(statisten.element());
                statisten.remove();
            } 
        }
        return gefunden; 
    }
    
}