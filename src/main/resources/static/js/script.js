let colorElement1 = document.getElementById("status2");
let colorElement2 = document.getElementById("status1");
let color = document.getElementById("status");
let device, location1;


window.addEventListener('load', main);

//colorElement2.addEventListener('click', onClickSquareBox2);
//colorElement2.addEventListener('touch', onClickSquareBox2);
color.addEventListener('click',onClickSquareBox1);
color.addEventListener('touch',onClickSquareBox1);
color.addEventListener('click',display);
color.addEventListener('touch',display);
let incrementer = 1;

function main() {
    console.log('Page is fully loaded');
if(incrementer == 1){
	
}
   
    incrementer = 0;

}




async function display() {
if(incrementer==1){
        window.location.reload()
        incrementer=0;
		
}

}


async function onClickSquareBox1() {

	if(incrementer==0){
	let confirmation = "Treasure is ready";
	let utterance = new SpeechSynthesisUtterance(confirmation);
	speechSynthesis.speak(utterance);
	incrementer=1;
	document.getElementById("spa").innerHTML = confirmation;
}
}

src = "https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
integrity = "sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
crossorigin = "anonymous"

var x = document.getElementById("demo");
function
	getLoc() {
	if
		(navigator.geolocation) {
		navigator.geolocation.getCurrentPosition(showPosition);
	} else {
		x.innerHTML = "Geolocation is not supported by this browser.";
	}
}
function
	showPosition(position) {
	x.innerHTML = "Latitude: " + position.coords.latitude +
		"<br>Longitude: " + position.coords.longitude;
}

function
	start() {
		let confirmation1 = "Treasure is ready";
		color.innerHTML=confirmation1;
	}