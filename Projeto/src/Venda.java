
public class Venda implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Getters and setters
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private float valor;

    public Float getValor() {
        return valor;
    }

    // Construtor sem argumentos
    public void setValor(Float valor) {
        this.valor = valor;
    }

    // Define os atributos com seus tipos
    public Venda(String codigo, float valor, String data) {
        this.codigo = codigo;
        this.valor = valor;
        this.data = data;
    }
}