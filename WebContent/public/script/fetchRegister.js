const form = document.getElementById('form');
console.log('Hola');
const endpoint = "http://localhost:8080/Proyecto/Register";

    const data = {
        method: "POST",
        headers: new Headers()
    };



form.addEventListener('submit', e =>{
    e.preventDefault();

    fetch(endpoint, data)
        .then((res) => {
            if (res.status == 200) {
                window.alert("HOLIS");
            } else {
                window.alert("Can't logout");
            }
            console.log(res);
        })
        .catch((err) => {
            console.log(err);
        });
})



    