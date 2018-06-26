import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch


// put these lines where you want the sound to play





// put these lines where you want the sound to play


PImage donkey;
PImage tail;
 int x;
 int y;
boolean g=false;
void setup(){
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("ha.wav");     //In setup. Change the file name if you need to
  donkey = loadImage("Donkey.jpg");
tail = loadImage("tail.png");
  size(640,480);
tail.resize(100,100);
}


void draw(){
 background(donkey);
 
 
if(dist(0,0,mouseX,mouseY)<30){
  background(donkey);
}
else{
 background(0,255,0); 
}
 rect(0,0,40,40);
if(mousePressed==false&&g==false){
  x=mouseX;
  y=mouseY;
  image(tail,mouseX,mouseY);

}
else{
g=true;

image(tail,x,y);

}
if(x>=368&&x<=398&&y>=162&&y<=192&&g==true){
  background(donkey);
  image(tail,x,y);
  if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
}
else if(mousePressed){
  exit();
}



}




//372,163