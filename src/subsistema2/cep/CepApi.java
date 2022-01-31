package subsistema2.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();

	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Pa�o do Lumiar";
	}
	
	public String recuperarEstado(String cep) {
		return "MA";
	}
}
