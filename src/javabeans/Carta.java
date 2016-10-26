package javabeans;


public class Carta {

	private String nomeDoRemetente; // nome do remetente
	private String nomeDoDestinatario; // nome do destinatário
	private String logra; // nome do logradouro

	
	public Carta(String nome,String logra,int num) {
		
		this.nomeDoDestinatario = nomeDoDestinatario;
		this.logra = logra;
		this.nomeDoRemetente = nomeDoRemetente;
		
	}
	
	public String displayCarta() {
		
		return ("Remetente: "+nomeDoRemetente+
				"\nLogradouro: "+logra+", ");
		
	}

	public String getNomeDoDestinatario() {
		return nomeDoDestinatario;
	}

        public String getNomeDoRemetente() {
		return nomeDoRemetente;
	}

}
