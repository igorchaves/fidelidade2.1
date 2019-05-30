package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRODUTOS
 * @generated
 */
@Entity
@Table(name = "\"PRODUTOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.produtos")
public class produtos implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nome;

  /**
  * @generated
  */
  @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String descricao;

  /**
  * @generated
  */
  @Column(name = "preco", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String preco;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_loja_1", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private loja loja_1;

  /**
   * Construtor
   * @generated
   */
  public produtos(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public produtos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nome
   * return nome
   * @generated
   */
  
  public java.lang.String getNome(){
    return this.nome;
  }

  /**
   * Define nome
   * @param nome nome
   * @generated
   */
  public produtos setNome(java.lang.String nome){
    this.nome = nome;
    return this;
  }

  /**
   * Obtém descricao
   * return descricao
   * @generated
   */
  
  public java.lang.String getDescricao(){
    return this.descricao;
  }

  /**
   * Define descricao
   * @param descricao descricao
   * @generated
   */
  public produtos setDescricao(java.lang.String descricao){
    this.descricao = descricao;
    return this;
  }

  /**
   * Obtém preco
   * return preco
   * @generated
   */
  
  public java.lang.String getPreco(){
    return this.preco;
  }

  /**
   * Define preco
   * @param preco preco
   * @generated
   */
  public produtos setPreco(java.lang.String preco){
    this.preco = preco;
    return this;
  }

  /**
   * Obtém loja_1
   * return loja_1
   * @generated
   */
  
  public loja getLoja_1(){
    return this.loja_1;
  }

  /**
   * Define loja_1
   * @param loja_1 loja_1
   * @generated
   */
  public produtos setLoja_1(loja loja_1){
    this.loja_1 = loja_1;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    produtos object = (produtos)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
