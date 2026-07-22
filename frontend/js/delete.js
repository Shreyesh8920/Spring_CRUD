const deleteButton = document.getElementById("deleteButton");

deleteButton.addEventListener("click", async function () {

    const id = document.getElementById("deleteId").value;

    if (id === "") {

        document.getElementById("messageBox").innerHTML = `
            <p class="error">Please Enter Student ID</p>
        `;

        return;
    }

    try {

        const response = await deleteStudent(id);

        document.getElementById("messageBox").innerHTML = `
            <p class="success">${response.message}</p>
            <p><strong>ID :</strong> ${response.id}</p>
        `;

        document.getElementById("studentDetails").innerHTML = `
            <p>No Student Selected</p>
        `;

        document.getElementById("deleteId").value = "";

    }
    catch (error) {

        document.getElementById("messageBox").innerHTML = `
            <p class="error">Unable to Delete Student</p>
        `;

        console.log(error);

    }

});