package com.squadra.blade.entities;

import javax.persistence.*;

@Entity
@Table(name = "rebelde")
public class Rebelde {

    @Id
    @GeneratedValue
    private long id;

    private String nome;

    private int idade;

    private String genero;

    private boolean traidor = false;

    private Localizacao localizacao;

    /**
     * @return current id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return current nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return current idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return current genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return current traidor
     */
    public boolean isTraidor() {
        return traidor;
    }

    /**
     * @param traidor to set
     */
    public void setTraidor(boolean traidor) {
        this.traidor = traidor;
    }

    /**
     * @return current localizacao
     */
    public Localizacao getLocalizacao() {
        return localizacao;
    }

    /**
     * @param localizacao to set
     */
    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
}
