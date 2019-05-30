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
 * @return Var
 */
// Descreva esta função...
public static Var obterusuariologado() throws Exception {
 return new Callable<Var>() {

   private Var id_user = Var.VAR_NULL;

   public Var call() throws Exception {
    id_user = cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id from User u where u.login = :login"),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName()));
    id_user = cronapi.list.Operations.getFirst(id_user);
    return id_user;
   }
 }.call();
}

}

