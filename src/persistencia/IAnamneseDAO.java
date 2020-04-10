package persistencia;
import negocio.Paciente;
import java.util.ArrayList; 
/**
 *
 * @author Aryel
 */
public interface IAnamneseDAO {
    public void adiciona(Paciente um_paciente);
    public void altera(Paciente um_paciente);
    public void remove(int id);
    public ArrayList<Paciente> listarTodos();
    public Paciente getByID(int id);
}
