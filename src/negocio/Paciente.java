package negocio;

import java.util.Calendar;
/**
 *
 * @author Aryel
 */
public class Paciente {
    private int idPaciente;
    private String nome;
    private String cpf;
    private Calendar data_nascimento;
    private String sexo;
    private String endereco;
    private String telefone;
    private String foto;
    private String plano_saude;
    private String observacoes;
    private Calendar data_cadastro;

    public int getIdPaciente() {
        return idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getFoto() {
        return foto;
    }

    public String getPlano_saude() {
        return plano_saude;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Calendar getData_cadastro() {
        return data_cadastro;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setPlano_saude(String plano_saude) {
        this.plano_saude = plano_saude;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setData_cadastro(Calendar data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    @Override
    public String toString() {
        return "{" + "\"idPaciente\":" + idPaciente + ", \"nome\":" + '\"'+ nome + '\"' + ", \"cpf\":" + '\"' + cpf + '\"' + ", \"data_nascimento\":" + '\"' + data_nascimento.getTime() + '\"' + ", \"sexo\":" + '\"' + sexo + '\"' + ", \"endereco\":" + '\"' + endereco + '\"' + ", \"telefone\":" + '\"' + telefone + '\"' + ", \"foto\":" + '\"' + foto + '\"' + ", \"plano_saude\":" + '\"' + plano_saude + '\"' + ", \"observacoes\":" + '\"' + observacoes + '\"' + ", \"data_cadastro\":" + '\"' + data_cadastro + '\"' + "}";
    }
    
}
