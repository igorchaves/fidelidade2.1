package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PONTUACAO
 * @generated
 */
@Entity
@Table(name = "\"PONTUACAO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.pontuacao")
public class pontuacao implements Serializable {

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
  @Column(name = "pontos", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer pontos;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_loja", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private loja loja;

  /**
   * Construtor
   * @generated
   */
  public pontuacao(){
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
  public pontuacao setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém pontos
   * return pontos
   * @generated
   */
  
  public java.lang.Integer getPontos(){
    return this.pontos;
  }

  /**
   * Define pontos
   * @param pontos pontos
   * @generated
   */
  public pontuacao setPontos(java.lang.Integer pontos){
    this.pontos = pontos;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public pontuacao setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * Obtém loja
   * return loja
   * @generated
   */
  
  public loja getLoja(){
    return this.loja;
  }

  /**
   * Define loja
   * @param loja loja
   * @generated
   */
  public pontuacao setLoja(loja loja){
    this.loja = loja;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    pontuacao object = (pontuacao)obj;
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
