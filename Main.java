import classes.*;

public class Main{
    public static void main(String[] args) {
        // start new game or load from file
        loadOrNew();

        
    }

    public static void loadOrNew(){
        // System.out.println("Load Game or Start New Game[L/N]");
        Input i = new Input("Load Game or Start New Game", new String[]{"l","n"});
        i.askQuestion();
    }
}