import java.util.Queue;
import java.util.*; 

public class Agentur{
    private Queue<Statist> statisten;
    public Agentur(){
    }   
    public void neuerStatist(String name, char geschlecht, int score){ 
        statisten.add(new Statist(name, geschlecht, score));
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
    public List<Statist> sortByScore(){
        List<Statist> statistenByScore = new ArrayList<>();
        int zaehler = 0;
        int index = 0;
        while(statisten.element() != null){
            if (statisten.element().getScore() > zaehler){
                statistenByScore.add(index , statisten.element());
                index++;
                zaehler = statisten.element().getScore();
            } else {
                statistenByScore.add(index++, statistenByScore.get(index));
                statistenByScore.add(index, statisten.element());
            }
        }
        return statistenByScore; 
    }
    
}