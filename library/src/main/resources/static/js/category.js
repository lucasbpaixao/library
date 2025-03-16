function createCategory(){
    let categoryName = document.getElementById("inputCategoryName").value;
    let postObj = `{"name": "${categoryName}"}`;
    let path = "/category/create-category"
    let response = post(postObj, path);
    if(response){
        alert("Deu Certo");
    }else{
        alert("Deu Errado");
    }
}

function getCategories(){
    get("/category/get-categories").then(res => fillTableCategories(JSON.parse(res)));
}

function fillTableCategories(categories){
    let tableCategories = document.getElementById("tableCategories");
    tableCategories.innerHTML = "";
    categories.forEach(category => {
        tableCategories.innerHTML += `
            <tr>
                <td>${category.id}</td>
                <td>${category.name}</td>
                <td class="tdBtnAction"><button type="button" class="btn btn-primary" onclick="getCategories()">Editar</button></td>
                <td class="tdBtnAction"><button type="button" class="btn btn-danger" onclick="getCategories()">Excluir Categoria</button></td>
            </tr>
        `
    });
}