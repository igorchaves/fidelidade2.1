package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Gerarqrcode {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// gerarqrcode
public static Var gerarqrcode() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("vars.QR7336"), cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.combobox2124")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

