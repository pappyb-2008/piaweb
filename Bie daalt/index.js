let cartprice = 0;
let count = document.getElementById("count");
let button = document.getElementById("addbtn");
button.addEventListener("click", function () {
   cartprice++;
   count.textContent = cartprice;
});