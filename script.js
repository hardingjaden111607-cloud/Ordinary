document.addEventListener("DOMContentLoaded", () => {
  const kirbeyImage = document.getElementById("kirbey");
  const kirbeySound = document.getElementById("kirb");

  if (kirbeyImage && kirbeySound) {
    kirbeyImage.addEventListener("mouseenter", () => {
      kirbeySound.currentTime = 0;
      kirbeySound.play();
    });

    kirbeyImage.addEventListener("mouseleave", () => {
      kirbeySound.pause();
      kirbeySound.currentTime = 0;
    });
  }

  const ordinImage = document.getElementById("ordin");
  const ordinSound = document.getElementById("audio2");

  if (ordinImage && ordinSound) {
    ordinImage.addEventListener("mouseenter", () => {
      ordinSound.currentTime = 0;
      ordinSound.play();
    });

    ordinImage.addEventListener("mouseleave", () => {
      ordinSound.pause();
      ordinSound.currentTime = 0;
    });
  }
});
