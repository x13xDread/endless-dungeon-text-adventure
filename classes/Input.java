package classes;

import java.util.Scanner;
import java.util.Arrays;

public class Input {
    Scanner input = new Scanner(System.in);
    String[] options;
    String question;

    public Input(String question, String[] options){
        //options
        this.options = options;
        for(int x = 0; x < this.options.length; x++){
            this.options[x].toLowerCase();
        }

        //question w/ options
        StringBuilder s = new StringBuilder(question+" [");
        for (String string : options) {
            s.append(string+"/");
        }
        //change last '/' to ']'
        s.setCharAt(s.length()-1, ']');
        
        this.question = s.toString();
        
    }

    public String question(String question){
        //question w/ options
        StringBuilder s = new StringBuilder(question+" [");
        for (String string : options) {
            s.append(string+"/");
        }
        //change last '/' to ']'
        s.setCharAt(s.length()-1, ']');
        
        this.question = s.toString();

        return this.question;
    }
    public String question(){
        return this.question;
    }

    public String options(String[] options){
        //options
        this.options = options;
        for(int x = 0; x < this.options.length; x++){
            this.options[x].toLowerCase();
        }

        return this.options.toString();
    }
    public String options(){
        return this.options.toString();
    }
    public String[] optionsArray(){
        return this.options;
    }

    public String askQuestion(){
        System.out.println(question);
        String choice = input.nextLine();

        while(!testInput(choice)){
            System.out.println("ERROR: Previous choice was invalid, please re-enter your choice from the apropriate options");
            System.out.println(question);
            choice = input.nextLine();
        }
        return choice.toLowerCase();
    }

    private boolean testInput(String test){
        //convert options to list to see if it contains the test string (users input) as a valid option or not
        if(Arrays.asList(options).contains(test.toLowerCase()))
            return true;
        else
            return false;
    }
}
