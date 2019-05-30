package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", execute = "Public")
public class Cadastro {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// cadastro
public static Var cadastrousuario() throws Exception {
 return new Callable<Var>() {

   private Var senha = Var.VAR_NULL;
   private Var login = Var.VAR_NULL;
   private Var email = Var.VAR_NULL;
   private Var nome = Var.VAR_NULL;
   private Var excep = Var.VAR_NULL;

   public Var call() throws Exception {
    if (Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.senha")).equals(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.senha_confere")))).getObjectAsBoolean()) {
        senha = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.senha"));
        login = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.var_login"));
        email = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.email"));
        nome = cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.senha_confere"));
        try {
             cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),Var.valueOf("password",senha),Var.valueOf("name",nome),Var.valueOf("login",login),Var.valueOf("email",email));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("cadastro realizado com sucesso !"));
         } catch (Exception excep_exception) {
              excep = Var.valueOf(excep_exception);
             cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Ocorreu erro no cadastro, verifique suas informações e tente novamente."));
         } finally {
         }
    } else {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("As senhas não conferem "));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

