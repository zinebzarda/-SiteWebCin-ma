let backgroundImages = ['https://lh3.googleusercontent.com/drive-viewer/AKGpihaLyQWG5IPh_7MSC47R33WjvQbXeQU6c-9_fFrD15nWL-lVIqt0r-kt0VJlrJA193Cbtz7CSMGm7FEMlQFSJFzSFrakF2s1BBg=s1600-rw-v1', 'url(https://lh3.googleusercontent.com/drive-viewer/AKGpihaLyQWG5IPh_7MSC47R33WjvQbXeQU6c-9_fFrD15nWL-lVIqt0r-kt0VJlrJA193Cbtz7CSMGm7FEMlQFSJFzSFrakF2s1BBg=s1600-rw-v1)', 'url(https://lh3.googleusercontent.com/drive-viewer/AKGpihaLyQWG5IPh_7MSC47R33WjvQbXeQU6c-9_fFrD15nWL-lVIqt0r-kt0VJlrJA193Cbtz7CSMGm7FEMlQFSJFzSFrakF2s1BBg=s1600-rw-v1)', 'url(images/bg4.jpg)', 'url(images/bg5.jpg)', 'url(images/bg6.jpg)', 'url(images/bg7.jpg)'];
let currentIndex = 0;
let bodyElement = document.querySelector(".body-home");

function changeBackgroundImage() {
    bodyElement.style.background = `${backgroundImages[currentIndex]} no-repeat top right/cover`;
    currentIndex = (currentIndex + 1) % backgroundImages.length;
    setTimeout(changeBackgroundImage, 3000);
}

changeBackgroundImage();
