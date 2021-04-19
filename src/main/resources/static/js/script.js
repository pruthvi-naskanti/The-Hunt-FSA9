let colorElement1 = document.getElementById("status1");
let colorElement2 = document.getElementById("status2");
let color = document.getElementById("status");
let device, location1;
let lat2;
let lon2;


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
function showPosition(position) {
	let pos1 = position.coords.latitude;
	let pos2 = position.coords.longitude;
	let lat2 = financial(pos1);
	let lon2 = financial(pos2);
	let lat1 = financial(pos3);
	let lon1 = financial(pos4);
	let ddd = distance(lat1, lon1, lat2, lon2,"K");
	
	let msg ="";
	if(ddd<= 40){
		msg = "You're inside location"
		let confirmation="Congratulations!!! You won the Game. You are in location"
	    let utterance = new SpeechSynthesisUtterance(confirmation);
	    speechSynthesis.speak(utterance);
		alert("Congratulations!!! You won the Game")
	}else{
		msg="You're outside of the location."
		let confirmation="You are not in location"
	    let utterance = new SpeechSynthesisUtterance(confirmation);
	    speechSynthesis.speak(utterance);
	}
	console.log(ddd, "===> dist")
	
	
	x.innerHTML = "Latitude: " + position.coords.latitude +
		"<br>Longitude: " + position.coords.longitude +
		"<br>Distance: in Meters:"+ ddd+
		"<br>"+ msg;
//	let confirmation="You are not in location"
//	let utterance = new SpeechSynthesisUtterance(confirmation);
//	speechSynthesis.speak(utterance);
		
		//return lat2, lon2;
}

		
	function distance(lat1, lon1, lat2, lon2, unit) {
	if ((lat1 == lat2) && (lon1 == lon2)) {
		return 0;
	}
	else {
		var radlat1 = Math.PI * lat1/180;
		var radlat2 = Math.PI * lat2/180;
		var theta = lon1-lon2;
		var radtheta = Math.PI * theta/180;
		var dist = Math.sin(radlat1) * Math.sin(radlat2) + Math.cos(radlat1) * Math.cos(radlat2) * Math.cos(radtheta);
		if (dist > 1) {
			dist = 1;
		}
		dist = Math.acos(dist);
		dist = dist * 180/Math.PI;
		dist = dist * 60 * 1.1515;
		if (unit=="K") { dist = dist * 1.609344 }
		if (unit=="N") { dist = dist * 0.8684 }
		return (dist*1000);
		
		
	}
	

}

	function financial(x) {
  return Number.parseFloat(x).toFixed(6);
	
}



