public class Main{

    public static void main(String[] args){
        Agentur agentur1 = new Agentur();
        agentur1.neuerStatist("name", 'm');
        agentur1.neuerStatist("name2",'w');
        System.out.println(agentur1.mannOderFrau('w').element().getGeschlecht());
        
    }
}