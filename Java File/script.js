const darkModeToggle = document.getElementById("darkModeToggle");

// Check if user previously enabled dark mode
if (localStorage.getItem("darkMode") === "enabled") {
  document.body.classList.add("dark-mode");
  darkModeToggle.checked = true;
}
console.log("hello");
darkModeToggle.addEventListener("change", () => {
  if (darkModeToggle.checked) {
    document.body.classList.add("dark-mode");
    localStorage.setItem("darkMode", "enabled");
  } else {
    document.body.classList.remove("dark-mode");
    localStorage.setItem("darkMode", "disabled");
  }
}); 
// need not // to clone the things again we use git pull 
// initially we only just pull the changes again  
// yes