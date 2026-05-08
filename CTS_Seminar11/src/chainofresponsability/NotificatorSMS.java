package chainofresponsability;

public class NotificatorSMS extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String mesaj) {
        if(client.getTelefon()!=null && !client.getTelefon().isEmpty()){
            System.out.println(client.getNume()+" a primit norificarea"+mesaj+ "prin SMS");
        }
        else if(super.getSuccesor()!=null){
            super.getSuccesor().trimiteNotificare(client,mesaj);
        }
        else{
            System.out.println("Clientul nu are nr de telefon!");
        }
    }
}
