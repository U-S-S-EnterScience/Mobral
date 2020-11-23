package projeto;

import java.text.NumberFormat;

import weka.classifiers.trees.RandomForest;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


public class Previsor {
	/***
	 * Metodo previsor para valor de venda
	 * @param ap imóvel a sofrer a previsão do preço de venda
	 * @return valor de venda previsto para o imóvel (R$)
	 */
	public static Double calcularVenda(Imovel ap){
		try {
		String modelo = "src/files/PrecificadorVenda.model",
			   fonte = "src/files/Sale.csv";
		RandomForest pv = (RandomForest) weka.core.SerializationHelper.read(modelo);
		DataSource source = new DataSource(fonte);
		Instances novo = source.getDataSet();
		novo.setClassIndex(novo.numAttributes()-1);
		
		Instance Imovel = new DenseInstance(11);
		Imovel.setDataset(novo);
		
		Imovel.setValue(0,ap.getCondominio());
		Imovel.setValue(1,ap.getTamanho());
		Imovel.setValue(2,ap.getQuartos());
		Imovel.setValue(3,ap.getBanheiros());
		Imovel.setValue(4,ap.getSuites());
		Imovel.setValue(5,ap.getGaragem());
		Imovel.setValue(6,ap.getElevador());
		Imovel.setValue(7,ap.getMobiliado());
		Imovel.setValue(8,ap.getPiscina());
		Imovel.setValue(9,ap.getBairro());
		Imovel.setValue(10,0);

		Double preco = pv.classifyInstance(Imovel);
		return preco;
		}
		
		catch (Exception e) {
			return null;
		}
		
	}
	
	/***
	 * Metodo previsor para valor de venda
	 * @param ap imóvel a sofrer a previsão do preço de venda
	 * @return valor de aluguel previsto para o imóvel (R$)
	 */
	public static Double calcularAluguel(Imovel ap) {
		try{
		String modelo = "src/files/PrecificadorAluguel.model",
			   fonte = "src/files/Rent.csv";
		RandomForest pv = (RandomForest) weka.core.SerializationHelper.read(modelo);
		DataSource source = new DataSource(fonte);
		Instances novo = source.getDataSet();
		novo.setClassIndex(novo.numAttributes()-1);
		
		Instance Imovel = new DenseInstance(11);
		Imovel.setDataset(novo);
		
		Imovel.setValue(0,ap.getCondominio());
		Imovel.setValue(1,ap.getTamanho());
		Imovel.setValue(2,ap.getQuartos());
		Imovel.setValue(3,ap.getBanheiros());
		Imovel.setValue(4,ap.getSuites());
		Imovel.setValue(5,ap.getGaragem());
		Imovel.setValue(6,ap.getElevador());
		Imovel.setValue(7,ap.getMobiliado());
		Imovel.setValue(8,ap.getPiscina());
		Imovel.setValue(9,ap.getBairro());
		Imovel.setValue(10,0);

		Double preco = pv.classifyInstance(Imovel);
		return preco;
		}
		catch (Exception e) {
			return null;
		}
		
		
	}
}
