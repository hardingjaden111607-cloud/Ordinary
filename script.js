
const image = document.getElementById('kirbey');
const sound = document.getElementById('kirb');
image.addEventListener("mouseenter", () => {
    sound.play()
});
image.addEventListener("mouseleave", () => {
    sound.pause();
    sound.currentTime = 0; 
  });

  document.addEventListener("DOMContentLoaded", () => {
  const image2 = document.getElementById('ordin');
  const sound2 = document.getElementById('audio2');

  image2.addEventListener("mouseenter", () => {
    sound2.currentTime = 0;
    sound2.play();
  });

  image2.addEventListener("mouseleave", () => {
    sound2.pause();
    sound2.currentTime = 0;
  });
});
