//$(function(){
//    // Activate mobile nav toggle button
//    $(".button-collapse").sideNav({edge: 'right'});
//});
//
//
// ----------------------------- MODALES -----------------------------------------------

 document.querySelector('#img-choco').addEventListener('click', () => {
  var element = document.querySelector('#chocolateModal');
    var modal = M.Modal.init(element, {});
    modal.open();
 });

 document.querySelector('#img-cremas').addEventListener('click', () => {
  var element = document.querySelector('#cremaModal');
    var modal = M.Modal.init(element, {});
    modal.open();
});

 document.querySelector('#img-dulceDeLeche').addEventListener('click', () => {
  var element = document.querySelector('#dulceDeLecheModal');
    var modal = M.Modal.init(element, {});
    modal.open();
});

 document.querySelector('#img-frutales').addEventListener('click', () => {
  var element = document.querySelector('#frutalesModal');
    var modal = M.Modal.init(element, {});
    modal.open();
});


