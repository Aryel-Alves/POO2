package persistencia;
import java.util.ArrayList; 
import negocio.Anamnese;
/**
 *
 * @author Aryel
 */
public interface IAnamneseDAO {
    public void adiciona(Anamnese uma_anamnese);
    public void altera(Anamnese uma_anamnese);
    public void remove(int id);
    public ArrayList<Anamnese> listarTodos();
    public Anamnese getByID(int id);
}
