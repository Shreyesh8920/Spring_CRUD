const createForm = document.getElementById("createStudentForm");

createForm.addEventListener("submit", async function (event) {

    event.preventDefault();

    const student = {

        id: Number(document.getElementById("createId").value),

        firstName: document.getElementById("createFirstName").value,

        lastName: document.getElementById("createLastName").value,

        email: document.getElementById("createEmail").value,

        phone: document.getElementById("createPhone").value,

        branch: document.getElementById("createBranch").value

    };

    try {

        const response = await createStudent(student);

        document.getElementById("messageBox").innerHTML = `
            <p class="success">${response.message}</p>
            <p><strong>ID :</strong> ${response.id}</p>
            <p><strong>Name :</strong> ${response.name}</p>
        `;

        createForm.reset();

    }
    catch (error) {

        document.getElementById("messageBox").innerHTML = `
            <p class="error">Unable to Create Student</p>
        `;

        console.log(error);

    }

});