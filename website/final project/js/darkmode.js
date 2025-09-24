let darkmode = localStorage.getItem('dark-mode');
const themeSwitch = document.getElementById('switch-theme');

const enableDarkMode = () =>{
    document.body.classList.add('dark-mode');
    localStorage.setItem('dark-mode', 'active');
}

const disableDarkMode = () =>{
    document.body.classList.remove('dark-mode');
    localStorage.setItem('dark-mode', 'null');
}

if (darkmode === "active") enableDarkMode();


themeSwitch.addEventListener("click", () => {
    darkmode = localStorage.getItem('dark-mode');
    if (darkmode !== "active") {
        enableDarkMode()
    }
    else {
        disableDarkMode()
    }

    // darkmode !== "active" ? enableDarkMode() : disableDarkMode(); shorter looks
})