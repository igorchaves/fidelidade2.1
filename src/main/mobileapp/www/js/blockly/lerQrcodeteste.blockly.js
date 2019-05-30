window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.LerQrcodeteste = window.blockly.js.blockly.LerQrcodeteste || {};

/**
 * lerQrcode
 */
window.blockly.js.blockly.LerQrcodeteste.leitorQRCode = function() {
 var item, pontuacao;
  this.cronapi.cordova.camera.qrCodeScanner('QR_CODE', 'Aponte a Câmera para o código QR code  para pontuar nessa loja ', function(sender_pontuacao) {
      pontuacao = sender_pontuacao;
    this.cronapi.util.callServerBlocklyNoReturn('blockly.Regristarqrcode:registrarpontuacao', pontuacao);
    this.cronapi.screen.changeValueOfField("pontuacao.active.loja", pontuacao);
  }.bind(this), function(sender_item) {
      item = sender_item;
    this.cronapi.screen.notify('error','Errao oa ler QR code');
  }.bind(this));
  return pontuacao;
}
