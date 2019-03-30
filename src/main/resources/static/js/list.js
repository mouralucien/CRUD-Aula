$(document).ready(function(){
    
    $(".delete").click(function(e){
        let pessoaId = $(this).attr("data-id");
        $.ajax({
            type: "POST",
            url: "/delete",
            data:{
                "Id" : pessoaId
            },
            success: function(result){
                window.location.reload();
            }
        })
    });      
  
});

