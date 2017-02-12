$(function () {
    $("a.ahref").click(function () {
        var id = $(this).attr("value");
        var flag = "del";
        var href = $(this).attr("href");
        $.POST(href, {id: id, flag: flag},
                onAjaxSuccess
                );

    });
});
function onAjaxSuccess(data)
{
  // Здесь мы получаем данные, отправленные сервером и выводим их на экран.
  alert(data);
}