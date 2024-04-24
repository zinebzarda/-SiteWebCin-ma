let backgroundImages = ['url(images/bg1.jpg)', 'url(images/bg2.jpg)', 'url(images/bg3.jpg)', 'url(images/bg4.jpg)', 'url(images/bg5.jpg)', 'url(images/bg6.jpg)', 'url(images/bg7.jpg)'];
let currentIndex = 0;
let bodyElement = document.querySelector(".body-home");

function changeBackgroundImage() {
    bodyElement.style.background = `${backgroundImages[currentIndex]} no-repeat top right/cover`;
    currentIndex = (currentIndex + 1) % backgroundImages.length;
    setTimeout(changeBackgroundImage, 3000);
}

changeBackgroundImage();
