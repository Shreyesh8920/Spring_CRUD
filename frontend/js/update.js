const updateForm = document.getElementById("updateStudentForm");

updateForm.addEventListener("submit", async function (event) {

    event.preventDefault();

    const id = document.getElementById("updateId").value;

    if (id === "") {

        document.getElementById("messageBox").innerHTML = `
            <p class="error">Please Enter Student ID</p>
        `;

        return;
    }

    const student = {

        firstName: document.getElementById("updateFirstName").value,

        lastName: document.getElementById("updateLastName").value,

        email: document.getElementById("updateEmail").value,

        phone: document.getElementById("updatePhone").value,

        branch: document.getElementById("updateBranch").value

    };

    try {

        const response = await updateStudent(id, student);

        document.getElementById("messageBox").innerHTML = `
            <p class="success">${response.message}</p>
        `;

        document.getElementById("studentDetails").innerHTML = `
            <p><strong>ID :</strong> ${response.id}</p>
            <p><strong>Name :</strong> ${response.name}</p>
            <p><strong>Email :</strong> ${response.email}</p>
            <p><strong>Phone :</strong> ${response.phone}</p>
            <p><strong>Branch :</strong> ${response.branch}</p>
        `;

        updateForm.reset();

    }
    catch (error) {

        document.getElementById("messageBox").innerHTML = `
            <p class="error">Unable to Update Student</p>
        `;

        console.log(error);

    }

});