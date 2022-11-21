package modelo;

public class Endereco {

    private int idEnd;
    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private String estado;

    public Endereco() {
    }

    public int getIdEnd() {
        return idEnd;
    }

    public void setIdEnd(int idEnd) {
        if (this.idEnd == 0) {
            this.idEnd = idEnd;
        }
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Endereco { " +
                "ID End= " + idEnd +
                ", Rua = '" + rua + '\'' +
                ", Numero = '" + numero + '\'' +
                ", Cep = '" + cep + '\'' +
                ", Bairro = '" + bairro + '\'' +
                ", Estado = '" + estado + '\'' +
                '}';
    }
}
