package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ApiviaCEP {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// apiviaCEP
public static Var consultarCEP() throws Exception {
 return new Callable<Var>() {

   private Var url = Var.VAR_NULL;
   private Var objetojson = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(Var.valueOf("01").getObjectAsString());
    url = Var.valueOf(Var.valueOf("https://viacep.com.br/ws/").toString() + cronapi.screen.Operations.getValueOfField(Var.valueOf("loja.active.cep")).toString() + Var.valueOf("/json/").toString());
    System.out.println(url.getObjectAsString());
    objetojson = cronapi.util.Operations.getURLFromOthers(Var.valueOf("GET"), Var.valueOf("application/json"), url, Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);
    objetojson = cronapi.json.Operations.toJson(objetojson);
    System.out.println(objetojson.getObjectAsString());
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("loja.active.endereco"), cronapi.json.Operations.getJsonOrMapField(objetojson, Var.valueOf("logradouro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("loja.active.cidade"), cronapi.json.Operations.getJsonOrMapField(objetojson, Var.valueOf("localidade")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("loja.active.bairro"), cronapi.json.Operations.getJsonOrMapField(objetojson, Var.valueOf("bairro")));
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"), Var.valueOf("loja.active.uf"), cronapi.json.Operations.getJsonOrMapField(objetojson, Var.valueOf("uf")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

