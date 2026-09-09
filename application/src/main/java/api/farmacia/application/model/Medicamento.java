package api.farmacia.application.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "medicamento" )
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome_medicamento", length = 100, nullable = false)
    private String nome;
    @Column(name = "quantidade_medicamento",nullable = false)
    private Integer quantidade;
    @Column(name = "descricao_medicamento",length = 255,nullable = false)
    private String descricao;
    @Column(name = "preço",nullable = false)
    private Double preco;
    @Column(name = "data_entrada",nullable = false)
    private Date dataEntrada;
    @Column(name = "data_validade",nullable = false)
    private Date dataValidade;

    public Medicamento(String nome, Integer quantidade, String descricao,Double preco, Date dataEntrada, Date dataValidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.preco = preco;
        this.dataEntrada = dataEntrada;
        this.dataValidade = dataValidade;
    }

    public Medicamento() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }


    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
}
