package main;

import businessobject.Internacoes;
import modelo.Cachorro;
import modelo.Dono;
import modelo.Endereco;
import repository.CachorroRepository;

public class TestPetShop {

    public static void main(String[] args){

        Endereco endereco1 = new Endereco();
        endereco1.setRua("Rua das Laranjeiras");
        endereco1.setNumero("10");
        endereco1.setBairro("Das Laranjas");
        endereco1.setEstado("Sao Paulo");

        Dono dono1 = new Dono("Caterine");
        dono1.setEndereco(endereco1);

        Cachorro cachorro1 = new Cachorro("Cacau");
        cachorro1.setRaca("Vira lata caramelo");
        cachorro1.setIdade(1);
        cachorro1.setDono(dono1);

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua dos Limoes");
        endereco2.setNumero("12");
        endereco2.setBairro("Das Limoes");
        endereco2.setEstado("Sao Paulo");

        Dono dono2 = new Dono("Maria");
        dono2.setEndereco(endereco2);

        Cachorro cachorro2 = new Cachorro("Eddie");
        cachorro2.setRaca("Caramelo");
        cachorro2.setIdade(15);
        cachorro2.setEstaDoente(true);
        cachorro2.setDono(dono2);

        Endereco endereco3 = new Endereco();
        endereco3.setRua("Rua das Mexericas");
        endereco3.setNumero("123");
        endereco3.setBairro("Das Mexericas");
        endereco3.setEstado("Sao Paulo");

        Dono dono3 = new Dono("Paula");
        dono3.setEndereco(endereco3);

        Cachorro cachorro3 = new Cachorro("Bob");
        cachorro3.setRaca("Pastor Alemao");
        cachorro3.setIdade(10);
        cachorro3.setEstaDoente(true);
        cachorro3.setDono(dono3);

        Cachorro cachorro4 = new Cachorro("Toro");
        cachorro4.setRaca("Rottweiler");
        cachorro4.setIdade(10);
        cachorro4.setEstaDoente(true);
        cachorro4.setDono(dono3);

        CachorroRepository repository1 = new CachorroRepository();
        repository1.cadastrar(cachorro1);
        repository1.cadastrar(cachorro2);
        repository1.cadastrar(cachorro3);
        repository1.cadastrar(cachorro4);

        repository1.printCachorrosCadastrados();

        Internacoes internacoes  = new Internacoes();
        internacoes.internar(cachorro1);
        internacoes.internar(cachorro2);
        internacoes.internar(cachorro3);
//        internacoes.internar(cachorro4);

        internacoes.mostrarCachorrosInternados();
    }
}
