function delete (id) {
    var flag = id;
    $.ajax({
        url: 'Controller',
        type: 'post',
        data: {id: id, flag: flag},
        success: function (response) {
            console.log(response);
        }
    });
}
;