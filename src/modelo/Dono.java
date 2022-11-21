package modelo;

public class Dono {

    private int idDono;
    private String nomeDono;
    private String cpf;
    private String email;
    private Endereco endereco;

    public Dono(String nomeDono, Endereco endereco) {
        this.nomeDono = nomeDono;
        this.endereco = endereco;
    }

    public int getIdDono() {
        return idDono;
    }

    public void setIdDono(int idDono) {
        if (this.idDono == 0) {
            this.idDono = idDono;
        }
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Dono { " +
                "ID Dono = " + idDono +
                ", Nome Dono = '" + nomeDono + '\'' +
                ", Cpf = '" + cpf + '\'' +
                ", Email = '" + email + '\'' +
                ", " + endereco +
                '}';
    }
}
