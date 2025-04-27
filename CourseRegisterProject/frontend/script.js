function show(){
    fetch("http://localhost:8080/allcourse")//API end point
    .then((response) => response.json())
    .then((courses) => {
       
const datatabless=document.getElementById("tables");
courses.forEach(course => {
    let rows=`<tr> 
    <td>${course.courseID}</td>
    <td>${course.courseName}</td>
    <td>${course.trainer}</td>
    <td>${course.duration}</td>
    </tr>`

    datatabless.innerHTML+=rows;
});
    })
}

function showentrolled(){
    fetch("http://localhost:8080/allcourse/entrolled")//API end point
    .then((response) => response.json())
    .then((students) => {
       
const datatable=document.getElementById("entrolledtables");
students.forEach(student => {
    let row=`<tr> 
    <td>${student.name}</td>
    <td>${student.emailId}</td>
    <td>${student.courseName}</td>
    </tr>`

    datatable.innerHTML+=row;
});
    })
}

window.onload= function()
{
    document.getElementById("refresh").reset();
}