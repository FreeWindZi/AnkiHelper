function ExampleSwitch()
{
    var num = document.getElementById("show_example").innerHTML.search("Show example");
    if(num >= 0){
        $("ul").show();
        document.getElementById("show_example").innerHTML = "<span>Hide example</span>"
    }else {
        $("ul").hide();
        document.getElementById("show_example").innerHTML = "<span>Show example</span>"
    }
}