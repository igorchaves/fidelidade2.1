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
@Repository("produtosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface produtosDAO extends JpaRepository<produtos, java.lang.String> {

  /**
   * Obtém a instância de produtos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM produtos entity WHERE entity.id = :id")
  public produtos findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de produtos utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM produtos entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key loja_1
   * @generated
   */
  @Query("SELECT entity FROM produtos entity WHERE entity.loja_1.id = :id")
  public Page<produtos> findprodutossByLoja_1(@Param(value="id") java.lang.String id, Pageable pageable);

}
