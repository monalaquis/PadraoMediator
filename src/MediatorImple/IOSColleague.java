package MediatorImple;

public class IOSColleague extends Colleague{
	
	public IOSColleague(Mediator m) {
		super(m);
	}
	
	public void receberMensagem(String mensagem) {
		System.out.println("IOS recebeu: " + mensagem);
		System.out.println("*****************************");
	}

}
