let points = {pointsarr:[]};
let posX=0;
let posY=0;
let timerId = setInterval(() => checkPoints(),5000);
let cachePoints = {cachePointsarr:[]};
 


function checkPoints(){
    let msg = points;
    points = {pointsarr:[]};
         //fetch("/points?payload=" + JSON.strinfify(points))
         //.then(res => console.log(res))     
         fetch("/points",{
             method: 'POST',
             headers: {
                 'Content-Type': 'application/json'
             },
             body: JSON.stringify(msg)
         })
         .then(res=> res.json())
         .then(result=>console.log(result));
 }
 
function getPoints(){
	fetch()
}
        
	//Este código asume que las librerías de P5.js ya están cargadas.
	//Esta función se ejecuta una sola vez al inicio del script.
	function setup() {
  		createCanvas(640, 480);
	}
	// Esta función se ejecuta repetidas veces indefinidamente.
	function draw() {
  		if (mouseIsPressed === true) {
    	fill(0,0,0);
    	ellipse(mouseX, mouseY, 20, 20);
    	points.pointsarr.push([mouseX,mouseY]);
  	}
  		if (mouseIsPressed === false) {
    	fill(255,255,255);
  	}
  
	}
	
	function newDraw() {
  		fill(0,0,0);
    	ellipse(posX, posY, 20, 20);
	}