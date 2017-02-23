$("button").click( function() {
$("ul").empty();
    $.getJSON( "json_data.json", function(obj) { 
         $.each(obj, function(key, value) { 
		     $("table").append("<tr><td>"+value.name+"</td><td>"+ value.age+"</td><td>"+ value.company+"</td></tr>");
             $("ul").append("<li>Nombre y Apellido: "+value.name+" - Edad: "+ value.age+" - Empresa: " + value.company+"</li>");
        });
    });
});
