/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aryel.sa
 */
public class SessaoDAO implements ISessaoDAO {
    private Connection connection;
    
    public SessaoDAO (){
        this.connection = new ConFactory().getConnection();;
    }
    
    @Override
    public void adiciona(negocio.Sessao uma_sessao) {
        String sql = "insert into sessao " + 
                "(data, queixas_paciente, plano_tratamento, diagnostico_final, evolucao, pago, idAnamnese)" +
                " values (?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            
            stmt.setDate(1, (java.sql.Date) new java.sql.Date(uma_sessao.getData().getTimeInMillis()));
            stmt.setString(2, uma_sessao.getQueixas_paciente());
            stmt.setString(3, uma_sessao.getPlano_tratamento());
            stmt.setString(4, uma_sessao.getDiagnostico_final());
            stmt.setInt(5, uma_sessao.getEvolucao());
            stmt.setBoolean(6, uma_sessao.isPago());
            stmt.setInt(7, uma_sessao.getIdAnamnese());
            
            stmt.execute();
            System.out.println("SESSAO CADASTRADA!");
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void altera(negocio.Sessao uma_sessao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<negocio.Sessao> listarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public negocio.Sessao getByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
