package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Regristarqrcode {

public static final int TIMEOUT = 300;

/**
 *
 * @param idloja1
 * @return Var
 */
// regristarqrcode
public static Var registrarpontuacao(Var idloja1) throws Exception {
 return new Callable<Var>() {

   private Var ultimapontuacaodouser = Var.VAR_NULL;
   private Var excep = Var.VAR_NULL;

   public Var call() throws Exception {
    ultimapontuacaodouser = cronapi.database.Operations.query(Var.valueOf("app.entity.pontuacao"),Var.valueOf("select p.data from pontuacao p where p.user.id = :userId AND p.loja.id = :lojaId AND p.data = :data   order by p.data desc"),Var.valueOf("userId",blockly.Obterusuario.obterusuariologado()),Var.valueOf("lojaId",idloja1),Var.valueOf("data",cronapi.dateTime.Operations.getNowNoHour()));
    if (cronapi.logic.Operations.isNullOrEmpty(ultimapontuacaodouser).getObjectAsBoolean()) {
        try {
             cronapi.database.Operations.insert(Var.valueOf("app.entity.pontuacao"),Var.valueOf("data",cronapi.dateTime.Operations.getNowNoHour()),Var.valueOf("pontos",Var.valueOf(1)),Var.valueOf("loja",idloja1),Var.valueOf("user",blockly.Obterusuario.obterusuariologado()));
            cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("warning"), Var.valueOf("Você pontuou "));
         } catch (Exception excep_exception) {
              excep = Var.valueOf(excep_exception);
             cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("erro ao cadastra pontuação"));
         } finally {
         }
    } else {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("warning"), Var.valueOf("Você ja pontuou hoje nessa loja, volte amanhã para pontuar novamente"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

