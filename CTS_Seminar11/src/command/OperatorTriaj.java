package command;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class OperatorTriaj {
    private Queue<Command> comenzi;
    private Stack<Command> undo;
    private Stack<Command> redo;

    public OperatorTriaj() {
        this.comenzi = new LinkedList<>();
        this.undo=new Stack<>();
        this.redo=new Stack<>();
    }


    public void trimiteComanda(){
        if(!this.comenzi.isEmpty()){
            Command comanda=this.comenzi.poll();
            comanda.executa();
            undo.push(comanda);
            this.redo.clear();
        }
        else{
            System.out.println("Nu exista comenzi in coada");
        }
    }

    public void adaugaComanda(Command comanda){
        this.comenzi.add(comanda);
    }

    public void anuleazaComanda(){
        if(!this.undo.isEmpty()){
            Command command=this.undo.pop();
            command.executa();
            this.redo.push(command);
        }
        else{
            System.out.println("nu mai exista comenzi");
        }
    }

    public void refcareComanda(){
        if(!this.redo.isEmpty()){
            Command command=this.redo.pop();
            command.executa();
            this.undo.push(command);
        }
        else{
            System.out.println("nu mai exista comenzi");
        }
    }
}
