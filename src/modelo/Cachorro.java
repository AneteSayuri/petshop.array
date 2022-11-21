package modelo;

public class Cachorro {

    private int idDog;
    private String nomeDog;
    private String raca;
    private int idade;
    private boolean estaDoente;
    private Dono dono;

    public Cachorro(String nomeDog, Dono dono) {
        this.nomeDog = nomeDog;
        this.dono = dono;
    }

    public int getIdDog() {
        return idDog;
    }

    public void setIdDog(int idDog) {
        this.idDog = idDog;
    }

    public String getNomeDog() {
        return nomeDog;
    }

    public void setNomeDog(String nomeDog) {
        this.nomeDog = nomeDog;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.err.println("O cachorro ainda não nasceu.");
        } else if (idade > 20) {
            System.err.println("Informar idade inferior a 20 anos.");
        } else {
            this.idade = idade;
        }
    }

    public boolean isEstaDoente() {
        return estaDoente;
    }

    public void setEstaDoente(boolean estaDoente) {
        this.estaDoente = estaDoente;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Cachorro { " +
                "ID Dog = " + idDog +
                ", Nome Dog = '" + nomeDog + '\'' +
                ", Raca = '" + raca + '\'' +
                ", Idade = " + idade +
                ", estaDoente = " + estaDoente +
                ", " + dono +
                '}';
    }
}
