
// -------------------------------- addGusto.HTML ------------------------------------------------


$('#idCategoria').val(1); // para que por defecto sea Dulces de Leche !

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

// Por defecto escondo el warning
$('.warning').hide();

// Validar si el input para el Nombre del Gusto está vacio!
$('form').on('submit', function(e){
        if($('#gustoNombre').val() === ''){
          e.preventDefault();
          $('.warning').show();
      };
});

// ------------------------------------------- deleteGusto.html --------------------------------------------

  $('#selectGustos').on('change', function() {
  var value = $(this).val();
  $('#gustosForm').attr('action', value + '/delete');
});


// ------------------------------------------- updateGusto.html --------------------------------------------

   var newCatId;
   var idGusto;
   var newName;

   $('#selectCat').on('change', function() {
   newCatId = $(this).val();
 });

    $('#selectGusto').on('change', function() {
    idGusto = $(this).val();
  });

    newName = $('#newName').val();

 $('#btn-submit').on('submit', () => {
    $('#gustosForm').attr('action', idGusto + '/edit' + '/' + newName + '/' + catValue);
 });

