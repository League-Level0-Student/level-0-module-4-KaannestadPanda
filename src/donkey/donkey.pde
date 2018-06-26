PImage donkey;
PImage tail;
 int x;
 int y;
boolean g=false;
void setup(){
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
rect(368,162,30,30);
if(mousePressed==false&&g==false){
  x=mouseX;
  y=mouseY;
  image(tail,mouseX,mouseY);

}
else{
g=true;

image(tail,x,y);

}





}




//372,163