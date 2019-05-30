window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.LerQrcode = window.blockly.js.blockly.LerQrcode || {};

/**
 * lerQrcode
 */
window.blockly.js.blockly.LerQrcode.leitorQRCode = function() {
 var item, pontuacao;
  this.cronapi.cordova.camera.qrCodeScanner('QR_CODE', 'Aponte a Câmera para o código QR code  para pontuar nessa loja ', function(sender_pontuacao) {
      pontuacao = sender_pontuacao;
    this.cronapi.screen.notify('success','QR code lido com sucesso !');
  }.bind(this), function(sender_item) {
      item = sender_item;
    this.cronapi.screen.notify('success','Errao oa ler QR code');
  }.bind(this));
  return pontuacao;
}
