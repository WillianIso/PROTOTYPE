public class Concessionaria implements Cloneable {

    private String logradouro;
    private int numero;

    public Concessionaria(String logradouro, int numero) {
        super();
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Concessionaria{" +
                "logradouro='" + logradouro + '\'' +
                ", numero=" + numero +
                '}';
    }
}
