async function post(obj, path) {

    const host = window.location.host;
    const protocol = window.location.protocol;

    const url = protocol + "//" + host + path;

    const headers = new Headers();
    headers.append("Content-Type", "application/json");

    let res = await fetch(url, {
        headers: headers,
        method: "POST",
        body: obj
    });

    if(res.status == 201){
        return true;
    }else{
        return false;
    }

}

async function get(path){
    const host = window.location.host;
    const protocol = window.location.protocol;

    const url = protocol + "//" + host + path;

    let res = await fetch(url, {
        method: "GET"
    });

    return res.text();
}
