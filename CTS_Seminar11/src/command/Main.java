package command;

import clase.*;

public class Main{
    static void main(String[] args) {
        Medic medic1=new Medic("Daniel");
        Command comanda1=new ComandaInternare("Maria",medic1);
        Command comanda2=new ComandaTratareImediata("Ana",medic1);
        Command comanda3=new ComandaTratareImediata("Maria",medic1);
        OperatorTriaj operatorTriaj=new OperatorTriaj();
        operatorTriaj.adaugaComanda(comanda1);
        operatorTriaj.adaugaComanda(comanda2);
        operatorTriaj.adaugaComanda(comanda3);
        operatorTriaj.trimiteComanda();
        operatorTriaj.trimiteComanda();
        operatorTriaj.trimiteComanda();
        operatorTriaj.trimiteComanda();

        operatorTriaj.anuleazaComanda();
        operatorTriaj.anuleazaComanda();
        operatorTriaj.anuleazaComanda();
        operatorTriaj.anuleazaComanda();

        operatorTriaj.refcareComanda();
        operatorTriaj.refcareComanda();



    }
}