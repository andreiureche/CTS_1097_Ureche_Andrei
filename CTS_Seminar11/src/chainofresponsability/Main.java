package chainofresponsability;

import clase.*;

import java.util.Arrays;
import java.util.List;

public class Main{

    static void main(String[] args) {

        Client client1=new Client("Ana",null,"mail.@ase.ro");
        Client client2=new Client("Denisa","1234567",null);
        Client client3=new Client("Vlad",null,null);
        Notificator notificatorSms=new NotificatorSMS();
        Notificator notificatorEmail=new NotificatorEmail();
        Notificator notificatorManager=new NotificatorManager();

        notificatorSms.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);


        List<Client> clienti= Arrays.asList(client1,client2,client3);
        clienti.forEach(client->notificatorSms.trimiteNotificare(client,"ai primit o notifiacre"));


    }
}
