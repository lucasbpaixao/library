function initialize(){
    let body = document.getElementById("body");
    generateNavBar(body);
}

function generateNavBar(body){
    let nav = `
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="/">Biblioteca</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/">Home</a>
                        </li>
                        ${generateNavBarLinks()}
                    </ul>
                </div>
            </div>
        </nav>
    `
    let oldHTML = body.innerHTML
    body.innerHTML = nav;
    body.innerHTML += oldHTML;
}

function generateNavBarLinks(){
    return pages.map((page) => {
        return `
            <li class="nav-item">
                <a class="nav-link" href="${page.path}">${page.name}</a>
            </li>
        `;
    });
}

var pages = [{name: "Gestão de Categorias", path: "category", status: "active"}]