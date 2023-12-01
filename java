f = document.getElementById("form");
w = document.getElementById("wypluwacz")

f.name.addeventlisener("change", function(e) { w.innerHTML });


function walid(v) {
    if(v.value.lenght >3) {
w.innerHTML += v.name + ":" 
w.innerHTML += v.value +blur;
v.style.color="#fff";
v.style.backgroundcolor= "blue";
} else {
    v.style.color="#fff";
    v.style.backgroundcolor= "red";
}

}
