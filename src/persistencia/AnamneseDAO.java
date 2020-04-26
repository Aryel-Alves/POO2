/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import negocio.Anamnese;

/**
 *
 * @author aryel.sa
 */
public class AnamneseDAO implements IAnamneseDAO {
    private Connection connection;
    
    public AnamneseDAO() {
        this.connection = new ConFactory().getConnection();
    }

    @Override
    public void adiciona(Anamnese uma_anamnese) {
        String sql = "insert into anamnese " + 
                "(queixas, sintomas, tratamentos_anteriores, medicamentos, infancia, rotina, vicios, trabalho, historico_familiar, comportamento, linguagem, humor, hipotese_diagnostica, observacoes, numero_sessoes, valor_sessao, periodicidade, idPaciente, idPsicologo)" +
                " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            
            stmt.setString(1, uma_anamnese.getQueixas());
            stmt.setString(2, uma_anamnese.getSintomas());
            stmt.setString(3, uma_anamnese.getTratamentos_anteriores());
            stmt.setString(4, uma_anamnese.getMedicamentos());
            stmt.setString(5, uma_anamnese.getInfancia());
            stmt.setString(6, uma_anamnese.getRotina());
            stmt.setString(7, uma_anamnese.getVicios());
            stmt.setString(8, uma_anamnese.getTrabalho());
            stmt.setString(9, uma_anamnese.getHistorico_familiar());
            stmt.setString(10, uma_anamnese.getComportamento());
            stmt.setString(11, uma_anamnese.getLinguagem());
            stmt.setString(12, uma_anamnese.getHumor());
            stmt.setString(13, uma_anamnese.getHipotese_diagnosticada());            
            stmt.setString(14, uma_anamnese.getObservacoes());
            stmt.setInt(15, uma_anamnese.getNumero_sessoes());
            stmt.setInt(16, uma_anamnese.getValor_sessao());
            stmt.setString(17, uma_anamnese.getPeriodicidade());
            stmt.setInt(18, uma_anamnese.getIdPaciente());
            stmt.setInt(19, uma_anamnese.getIdPsicologo());
            
            stmt.execute();
            stmt.close();
            System.out.println("ANAMNESE CADASTRADA!");
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(Anamnese uma_anamnese) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Anamnese> listarTodos() {
        try{
            List<Anamnese> anameneses;
            anameneses = new ArrayList<>();
            PreparedStatement stmt = this.connection.prepareStatement("select * from anamnese");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                Anamnese anamnese = new Anamnese();
                
                anamnese.setIdAnamnese(rs.getInt("idAnamnese"));
                anamnese.setQueixas(rs.getString("queixas"));
                anamnese.setSintomas(rs.getString("sintomas"));
                anamnese.setTratamentos_anteriores(rs.getString("tratamentos_anteriores"));
                anamnese.setSintomas(rs.getString("medicamentos"));
                anamnese.setSintomas(rs.getString("infancia"));
                anamnese.setSintomas(rs.getString("rotina"));
                anamnese.setSintomas(rs.getString("vicios"));
                anamnese.setSintomas(rs.getString("trabalho"));
                anamnese.setSintomas(rs.getString("historico_familiar"));
                anamnese.setComportamento(rs.getString("comportamento"));
                anamnese.setLinguagem(rs.getString("linguagem"));
                anamnese.setHumor(rs.getString("humor"));
                anamnese.setHipotese_diagnosticada(rs.getString("hipotese_diagnostica"));
                anamnese.setObservacoes(rs.getString("observacoes"));
                anamnese.setNumero_sessoes(rs.getInt("numero_sessoes"));
                anamnese.setValor_sessao(rs.getInt("valor_sessao"));
                anamnese.setPeriodicidade(rs.getString("periodicidade"));
                anamnese.setIdPaciente(rs.getInt("idPaciente"));
                anamnese.setIdPsicologo(rs.getInt("idPsicologo"));
                
                anameneses.add(anamnese);
            }
            
            rs.close();
            stmt.close();
            
            return (ArrayList<Anamnese>) anameneses;
        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public Anamnese getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
