package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Obterpntuacaototal {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// obterpntuacaototal
public static Var obterpntuacaototal() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("pontuacaouser"), cronapi.database.Operations.query(Var.valueOf("app.entity.pontuacao"),Var.valueOf("select COUNT(p) from pontuacao p where p.user.id = :userId"),Var.valueOf("userId",blockly.Obterusuario.obterusuariologado())));
    return Var.VAR_NULL;
   }
 }.call();
}

}

