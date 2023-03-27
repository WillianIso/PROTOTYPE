public class Carro implements Cloneable {

    private int codigoCarro;
    private String nome;
    private String modelo;
    private Concessionaria concessionaria;
    private String valor;

    public Carro(int codigoCarro, String nome, Concessionaria concessionaria, String valor) {
        this.codigoCarro = codigoCarro;
        this.nome = nome;
        this.concessionaria = concessionaria;
        this.valor = valor;
    }

    public int getCodigoCarro() {
        return codigoCarro;
    }

    public void setCodigoCarro(int codigoCarro) {
        this.codigoCarro = codigoCarro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Concessionaria getConcessionaria() {
        return concessionaria;
    }

    public void setConcessionaria(Concessionaria concessionaria) {
        this.concessionaria = concessionaria;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public Carro clone() throws CloneNotSupportedException
    {
        Carro carroClone = (Carro) super.clone();
        carroClone.concessionaria = (Concessionaria) carroClone.concessionaria.clone();
        return carroClone;
    }


    @Override
    public String toString()
    {
        return "Carro{" +
                "codigoCarro=" + codigoCarro +
                ", nome='" + nome + '\'' +
                ", concessionaria=" + concessionaria +
                ", valor='" + valor + '\'' +
                '}';
    }

}
