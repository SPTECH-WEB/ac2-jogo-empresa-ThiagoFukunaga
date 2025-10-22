package school.sptech;

import school.sptech.exception.ArgumentoInvalidoException;
import school.sptech.exception.JogoInvalidoException;
import school.sptech.exception.JogoNaoEncontradoException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empresa {
     private String nome;
     private List<Jogo> jogos;

    public Empresa() {
        this.nome = nome;
        this.jogos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }
    public void adicionarJogo (Jogo jogo) throws JogoInvalidoException {
    if(jogo == null ){
    throw new JogoInvalidoException();
    }if(jogo.getCodigo() == null || jogo.getCodigo() == ""){
        throw new JogoInvalidoException();
        }if(jogo.getNome() == null || jogo.getNome() == ""){
            throw new JogoInvalidoException();
            }if(jogo.getGenero() == null || jogo.getGenero() == ""){
                throw new JogoInvalidoException();
                    }if(jogo.getPreco() == null || jogo.getPreco() <= 0 ){
                    throw new JogoInvalidoException();
                        }if(jogo.getAvaliacao() >5 || jogo.getAvaliacao() < 0 ){
                            throw new JogoInvalidoException();
                            }if(jogo.getDataLancamento() == null){
                                throw new JogoInvalidoException();
                                }
                                    jogos.add(jogo);
    }

    public Jogo buscarJogoPorCodigo(String codigo) throws ArgumentoInvalidoException, JogoNaoEncontradoException {
           if(codigo == null || codigo.isBlank() || codigo == "" || codigo.isEmpty()){
               throw new ArgumentoInvalidoException();
           }
           if(codigo != nome ) {
               throw new JogoNaoEncontradoException();
           }
            return null;
    }


    public void removerJogoPorCodigo(String codigo) throws ArgumentoInvalidoException, JogoNaoEncontradoException{
        if(codigo == null || codigo.isBlank() || codigo == "" || codigo.isEmpty()){
            throw new ArgumentoInvalidoException();
        }
        if(codigo != nome ) {
            throw new JogoNaoEncontradoException();
        }

    }
    public Jogo buscarJogoComMelhorAvaliacao() throws JogoNaoEncontradoException{
        if (jogos.isEmpty()){
            throw new JogoNaoEncontradoException();
        }
        return null;
    }
    public List<Jogo> buscarJogoPorPeriodo(LocalDate dataInicio, LocalDate dataFim)throws ArgumentoInvalidoException{
        if(dataInicio == null || dataFim == null){
        throw new ArgumentoInvalidoException();
        }
        return null;
    }


    }
