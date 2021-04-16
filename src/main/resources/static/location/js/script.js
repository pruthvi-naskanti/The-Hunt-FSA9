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
let incrementer = 0;

function main() {
    console.log('Page is fully loaded');
   
    incrementer = 0;
window.location.reload()
if(incrementer=1){
	let confirmation = "Treasure is ready YEsh";
	document.getElementById("spa").innerHTML = confirmation;
	let utterance = new SpeechSynthesisUtterance(confirmation);
	speechSynthesis.speak(utterance);
	incrementer=0;
	
	
}



}
async function display() {

        window.location.reload()
        incrementer=0;
 

}
async function onClickSquareBox1() {
	//location1 = locationsArray[0];
	
	incrementer=1;
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