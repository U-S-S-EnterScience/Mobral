package projeto;

import java.sql.SQLException;

import projeto.BD;

public class ImovelDAO {

	private String sql, men;
	private BD bd;

	public ImovelDAO() {
		bd = new BD();
	}

	/***
	 * Realiza a gravação de um produto no banco de dados
	 * @param p - o produto a ser salvo
	 * @return - uma mensagem informando o ocorrido
	 */
	public String salvar(Imovel ap){
		sql = "insert into consulta values (?,?,?,?,?,?,?,?,?,?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setDouble(1, ap.getCondominio());
			bd.st.setInt(2, ap.getTamanho());
			bd.st.setDouble(3, ap.getQuartos());
			bd.st.setInt(4, ap.getBanheiros());
			bd.st.setInt(5, ap.getSuites());
			bd.st.setInt(6, ap.getGaragem());
			bd.st.setInt(7, ap.getElevador());
			bd.st.setInt(8, ap.getMobiliado());
			bd.st.setInt(9, ap.getPiscina());;
			bd.st.setString(10, ap.getBairro());
			bd.st.setDouble(11, ap.getPreco());
			bd.st.setString(12, App.tipoNegociacao);
			bd.st.executeUpdate();
			men = "Imóvel inserido com sucesso!";
		}
		catch (SQLException erro) {
			men = "Falha: "+erro.toString();
		}	
		finally {
			bd.closeConnection();
		}
		return men;
	}

}
