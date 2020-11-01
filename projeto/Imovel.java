package projeto;

public class Imovel {

	private double preco;
	private double condominio = 0;
	private int tamanho = 0;
	private int quartos = 0;
	private int banheiros = 0;
	private int suites = 0;
	private int garagem = 0;
	private int elevador = 0;
	private int mobiliado = 0;
	private int piscina = 0;
	private int novo = 0;
	private String bairro;
	private String tipoImovel;
	
	/***
	 * M�todo construtor do Im�vel
	 * @param condominio - Pre�o da mensalidade do condom�nio (R$)
	 * @param tamanho - Tamanho do im�vel (m�)
	 * @param quartos - Quantidade de quartos do im�vel
	 * @param banheiros - Quantidade de banheiros do im�vel
	 * @param suites - Quantidade de su�tes do im�vel
	 * @param garagem - Quantidade de c�modos do im�vel
	 * @param elevador - Indica se o im�vel tem acesso a elevador (0 = falso , 1 = verdadeiro)
	 * @param mobiliado - Indica se o im�vel � mobiliado (0 = falso , 1 = verdadeiro)
	 * @param piscina - Indica se o im�vel tem acesso a piscina (0 = falso , 1 = verdadeiro)
	 * @param novo - Indica se o im�vel � novo (0 = falso , 1 = verdadeiro)
	 * @param bairro - Nome do bairro aonde o im�vel encontra-se
	 * @param tipoImovel - Indica o tipo do im�vel
	 */
	public Imovel(double condominio, int tamanho, int quartos, int banheiros, int suites, int garagem,
			int elevador, int mobiliado, int piscina, int novo, String bairro, String tipoImovel) {
		setCondominio(condominio);
		setTamanho(tamanho);
		setQuartos(quartos);
		setBanheiros(banheiros);
		setSuites(suites);
		setGaragem(garagem);
		setElevador(elevador);
		setMobiliado(mobiliado);
		setPiscina(piscina);
		setNovo(novo);
		setBairro(bairro);
		setTipoImovel(tipoImovel);
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return
	 */
	public double getPreco() {
		return preco;
	}
	
	/***
	 * Define o valor do atributo
	 * @param preco
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Pre�o da mensalidade do condom�nio (R$)
	 */
	public double getCondominio() {
		return condominio;
	}
	
	/***
	 * Define o valor do atributo
	 * @param condominio - Pre�o da mensalidade do condom�nio (R$)
	 */
	public void setCondominio(double condominio) {
		if(condominio >= 0) this.condominio = condominio;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Tamanho do im�vel (m�)
	 */
	public int getTamanho() {
		return tamanho;
	}
	
	/***
	 * Define o valor do atributo
	 * @param tamanho - Tamanho do im�vel (m�)
	 */
	public void setTamanho(int tamanho) {
		if(tamanho >= 0) this.tamanho = tamanho;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Quantidade de quartos do im�vel
	 */
	public int getQuartos() {
		return quartos;
	}
	
	/***
	 * Define o valor do atributo
	 * @param quartos - Quantidade de quartos do im�vel
	 */
	public void setQuartos(int quartos) {
		if(quartos >= 0) this.quartos = quartos;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Quantidade de banheiros do im�vel
	 */
	public int getBanheiros() {
		return banheiros;
	}
	
	/***
	 * Define o valor do atributo
	 * @param banheiros - Quantidade de banheiros do im�vel
	 */
	public void setBanheiros(int banheiros) {
		if(banheiros > 0) this.banheiros = banheiros;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Quantidade de su�tes do im�vel
	 */
	public int getSuites() {
		return suites;
	}
	
	/***
	 * Define o valor do atributo
	 * @param suites - Quantidade de su�tes do im�vel
	 */
	public void setSuites(int suites) {
		if(suites >= 0) this.suites = suites;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Quantidade de c�modos do im�vel
	 */
	public int getGaragem() {
		return garagem;
	}
	
	/***
	 * Define o valor do atributo
	 * @param garagem - Quantidade de c�modos do im�vel
	 */
	public void setGaragem(int garagem) {
		if(garagem >= 0) this.garagem = garagem;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Indica se o im�vel tem acesso a elevador (0 = falso , 1 = verdadeiro)
	 */
	public int getElevador() {
		return elevador;
	}
	
	/***
	 * Define o valor do atributo
	 * @param elevador - Indica se o im�vel tem acesso a elevador (0 = falso , 1 = verdadeiro)
	 */
	public void setElevador(int elevador) {
		if(elevador == 0 || elevador == 1) this.elevador = elevador;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Indica se o im�vel � mobiliado (0 = falso , 1 = verdadeiro)
	 */
	public int getMobiliado() {
		return mobiliado;
	}
	
	/***
	 * Define o valor do atributo
	 * @param mobiliado - Indica se o im�vel � mobiliado (0 = falso , 1 = verdadeiro)
	 */
	public void setMobiliado(int mobiliado) {
		if(mobiliado == 0 || mobiliado == 1) this.mobiliado = mobiliado;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Indica se o im�vel tem acesso a piscina (0 = falso , 1 = verdadeiro)
	 */
	public int getPiscina() {
		return piscina;
	}
	
	/***
	 * Define o valor do atributo
	 * @param piscina - Indica se o im�vel tem acesso a piscina (0 = falso , 1 = verdadeiro)
	 */
	public void setPiscina(int piscina) {
		if(piscina == 0 || piscina == 1) this.piscina = piscina;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Indica se o im�vel � novo (0 = falso , 1 = verdadeiro)
	 */
	public int getNovo() {
		return novo;
	}
	
	/***
	 * Define o valor do atributo
	 * @param novo - Indica se o im�vel � novo (0 = falso , 1 = verdadeiro)
	 */
	public void setNovo(int novo) {
		if(novo == 0 || novo == 1) this.novo = novo;
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Nome do bairro aonde o im�vel encontra-se
	 */
	public String getBairro() {
		return bairro;
	}
	
	/***
	 * Define o valor do atributo
	 * @param bairro - Nome do bairro aonde o im�vel encontra-se
	 */
	public void setBairro(String bairro) {
		if(bairro != "" && bairro.length() > 50) this.bairro = bairro; //Adicionar verifica��o de s�mbolos e somnete n�meros
	}
	
	/***
	 * Retorna o valor do atributo
	 * @return - Indica o tipo do im�velartos do im�vel
	 */
	public String getTipoImovel() {
		return tipoImovel;
	}
	
	/***
	 * Define o valor do atributo
	 * @param tipoImovel - Indica o tipo do im�velartos do im�vel
	 */
	public void setTipoImovel(String tipoImovel) {
		if(bairro == "Casa" || bairro == "Apartamento"|| bairro == "Comercial"|| bairro == "Terreno") this.tipoImovel = tipoImovel;
	}
}
