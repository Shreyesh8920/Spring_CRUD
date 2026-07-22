const readButton = document.getElementById("readButton");

readButton.addEventListener("click", async function () {

    const id = document.getElementById("readId").value;

    if (id === "") {

        document.getElementById("messageBox").innerHTML = `
            <p class="error">Please Enter Student ID</p>
        `;

        return;
    }

    try {

        const response = await readStudent(id);

        document.getElementById("studentDetails").innerHTML = `
            <p><strong>ID :</strong> ${response.id}</p>
            <p><strong>Name :</strong> ${response.name}</p>
            <p><strong>Email :</strong> ${response.email}</p>
            <p><strong>Phone :</strong> ${response.phone}</p>
            <p><strong>Branch :</strong> ${response.branch}</p>
        `;

        document.getElementById("messageBox").innerHTML = `
            <p class="success">Student Found</p>
        `;

    }
    catch (error) {

        document.getElementById("studentDetails").innerHTML = `
            <p>No Student Found</p>
        `;

        document.getElementById("messageBox").innerHTML = `
            <p class="error">Unable to Fetch Student</p>
        `;

        console.log(error);

    }

});