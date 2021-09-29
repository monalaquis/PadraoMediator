package MediatorImple;

public class SymbiamColleague extends Colleague {
	
	
	public SymbiamColleague(Mediator m) {
		super(m);
	}

	 @Override
	public void receberMensagem(String mensagem) {
		System.out.println("Symbian recebeu:  " + mensagem);
		System.out.println("*****************************");
	}

}
