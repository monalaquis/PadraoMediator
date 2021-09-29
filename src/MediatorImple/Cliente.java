package MediatorImple;

public class Cliente {

	public static void main(String[] args) {

		MensagemMediator mediador = new MensagemMediator();

		AndroidColleague android = new AndroidColleague(mediador);
		IOSColleague ios = new IOSColleague(mediador);
		SymbiamColleague symbian = new SymbiamColleague(mediador);
		
		mediador.addContatos(android);
		mediador.addContatos(ios);
		mediador.addContatos(symbian);
		
		symbian.enviarMensagem("Oi, eu sou o Symbyan");
		
		android.enviarMensagem("Oi symbiam, eu sou o Android");
		
		ios.enviarMensagem("Olá todos, eu sou o IOS");

	}
}
