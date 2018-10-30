
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

   $('#selectCat').on('change', () => {
        var value = $('#selectCat').val();
        if(value === "Dulces de Leche") {
            newCatId = 1;
        }
        else if(value === "Cremas") {
            newCatId = 2;
        }
        else if(value === "Chocolates") {
            newCatId = 3;
        }
        if(value === "Frutales") {
            newCatId = 4;
        }

        console.log('newCatId: ' + newCatId);
        console.log('idGusto ' + idGusto);
        console.log('newName: ' + newName);
 });

    $('#selectGusto').on('change', function() {
    idGusto = $(this).val();
  });

    newName = $('#newName').val();

 $('#btn-submit').on('submit', (e) => {
    e.preventDefault();
    var url = idGusto + " '/edit' + '/' "+ newName + '/' + newCatId;
    $('#formUpdate').attr('action', url);
 });

