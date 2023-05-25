package Multi_level_inheritance;

public class WhatsAppVersion3 extends WhatsAppVersion2 {


	public void WhatsAppPay()
	{
		System.out.println("User can now make payments through whatsapp");
	}

	
	public static void main(String[] args) {
		
		WhatsAppVersion3 n = new WhatsAppVersion3();
		n.sendMessage();
		n.dpSave();
		n.calling();
		n.ststus();
		n.WhatsAppPay();
	}

}
