package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Obterusuario {

public static final int TIMEOUT = 300;

/**
 *
 * @param Entidade
 * @return Var
 */
// obterusuario
public static Var obterusuario(Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var id_user = Var.VAR_NULL;

   public Var call() throws Exception {
    id_user = cronapi.database.Operations.query(Var.valueOf("app.entity.loja"),Var.valueOf("select l.user.id from loja l where l.user.login = :userLogin"),Var.valueOf("userLogin",cronapi.util.Operations.getCurrentUserName()));
    id_user = cronapi.list.Operations.getFirst(id_user);
    System.out.println(id_user.getObjectAsString());
    return id_user;
   }
 }.call();
}

}

