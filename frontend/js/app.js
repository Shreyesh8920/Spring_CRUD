const messageBox = document.getElementById("messageBox");
const studentDetails = document.getElementById("studentDetails");

function showSuccessMessage(message) {

    messageBox.innerHTML = `
        <p class="success">${message}</p>
    `;

}

function showErrorMessage(message) {

    messageBox.innerHTML = `
        <p class="error">${message}</p>
    `;

}

function showStudentDetails(student) {

    studentDetails.innerHTML = `
        <p><strong>ID :</strong> ${student.id}</p>
        <p><strong>Name :</strong> ${student.name}</p>
        <p><strong>Email :</strong> ${student.email}</p>
        <p><strong>Phone :</strong> ${student.phone}</p>
        <p><strong>Branch :</strong> ${student.branch}</p>
    `;

}

function clearStudentDetails() {

    studentDetails.innerHTML = `
        <p>No Student Selected</p>
    `;

}