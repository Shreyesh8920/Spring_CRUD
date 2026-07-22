const BASE_URL = "http://localhost:8080/students";


// ================= CREATE =================

async function createStudent(student){

    const response = await fetch(`${BASE_URL}/create`,{

        method:"POST",

        headers:{
            "Content-Type":"application/json"
        },

        body:JSON.stringify(student)

    });

    return await response.json();

}



// ================= READ =================

async function readStudent(id){

    const response = await fetch(`${BASE_URL}/read/${id}`);

    return await response.json();

}



// ================= UPDATE =================

async function updateStudent(id,student){

    const response = await fetch(`${BASE_URL}/update/${id}`,{

        method:"PUT",

        headers:{
            "Content-Type":"application/json"
        },

        body:JSON.stringify(student)

    });

    return await response.json();

}



// ================= DELETE =================

async function deleteStudent(id){

    const response = await fetch(`${BASE_URL}/delete/${id}`,{

        method:"DELETE"

    });

    return await response.json();

}