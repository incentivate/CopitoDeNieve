$(function(){
    // Activate mobile nav toggle button
    $(".button-collapse").sideNav({edge: 'right'});
});


// ----------------------------- MODALES -----------------------------------------------
/*
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
});*/


// Borrar si no anda !
$('#categorias').on('change', () => {
    var value = $('#categorias').val();
    if(value === "Dulces de Leche") {
        $('#idCategoria').val(1);
    }
    else if(value === "Cremas") {
        $('#idCategoria').val(2);
    }
    else if(value === "Chocolates") {
        $('#idCategoria').val(3);
    }
    if(value === "Frutales") {
        $('#idCategoria').val(4);
    }
});