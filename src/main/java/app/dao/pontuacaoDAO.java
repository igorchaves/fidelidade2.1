package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("pontuacaoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface pontuacaoDAO extends JpaRepository<pontuacao, java.lang.String> {

  /**
   * Obtém a instância de pontuacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM pontuacao entity WHERE entity.id = :id")
  public pontuacao findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de pontuacao utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM pontuacao entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM User entity WHERE entity.pontuacao.id = :id")
  public Page<User> findUser(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key loja
   * @generated
   */
  @Query("SELECT entity FROM pontuacao entity WHERE entity.loja.id = :id")
  public Page<pontuacao> findpontuacaosByLoja(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key user
   * @generated
   */
  @Query("SELECT entity FROM pontuacao entity WHERE entity.user.id = :id")
  public Page<pontuacao> findpontuacaosByUser(@Param(value="id") java.lang.String id, Pageable pageable);

}
