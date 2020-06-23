$(document).ready(function(){
    $(document).on('submit','#form1',function(event){
        event.preventDefault();
        var dados=$(this).serialize();

        $.ajax({
            url: 'deletar.php',
            type: 'post',
            data: dados,
            success: function(data){
                $('#resultado').empty().html(data);
            }

        });
    }

}