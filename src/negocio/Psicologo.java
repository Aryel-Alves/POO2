package negocio;

import persistencia.PsicologoDAO;

/**
 *
 * @author Aryel
 */
public class Psicologo {
    private int idPsicologo;
    private String nome;
    private String cpf;
    private String crp;
    private String telefone;
    private String login;
    private String senha;

    public int getIdPsicologo() {
        return idPsicologo;
    }
    
    public void setIdPsicologo(int id) {
        this.idPsicologo = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    /*public static boolean fazLogin(String login, String senha){
        PsicologoDAO dao = new PsicologoDAO();
        return dao.checkLogin(login, senha);
    }*/
}
