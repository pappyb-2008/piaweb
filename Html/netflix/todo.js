// Төлөв: ажлуудын массив
const form = document.getElementById("form");
const input = document.getElementById("input");
const list = document.getElementById("list");
let tasks = [
    {
        id: 1, text: "Лекц унших",
        done: true
    },
    {
        id: 2, text: "Апп бичих",
        done: false
    },
];
function render() {
    list.innerHTML = ""; // хоосолно
    tasks.forEach((task) => {
        const li = document.createElement("li");
        li.textContent = task.text;
        if (task.done) li.classList.add("done");
        li.addEventListener("click", () => toggleTask(task.id));
        const del = document.createElement("button");
        del.textContent = " done";
        del.addEventListener("click", (e) => {
            e.stopPropagation(); // li-д бүү дамжуул
            deleteTask(task.id);
        });
        li.append(del);
        list.append(li);
    });
}
form.addEventListener("submit",
    (e) => {
        e.preventDefault();
        tasks.push({
            id: Date.now(),
            text: input.value.trim(),
            done: false,
        });
        input.value = "";
        save();
        render();
    });
    
function toggleTask(id) {
    tasks = tasks.map((t) =>
        t.id === id ? { ...t, done: !t.done } : t
    );
    save();
    render();
}
function deleteTask(id) {
    tasks = tasks.filter((t) => t.id !== id);
    save();
    render();
}
function save() {
    localStorage.setItem("tasks", JSON.stringify(tasks));
}
// Эхлэхдээ хадгалсныг уншина
tasks = JSON.parse(localStorage.getItem("tasks")) ?? [];
render();

