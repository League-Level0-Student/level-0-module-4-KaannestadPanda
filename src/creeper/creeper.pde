int x=270;
int y=350;


PImage creeper;
void setup(){
  size(500,400);
 PImage minecraft = loadImage("green.jpg");     //in setup method
minecraft.resize(500, 400);          //in setup method
background(minecraft);          //in setup method
  creeper=loadImage("creeper.png");
 
  creeper.resize(10,10);
  image(creeper,x,y);
}


void draw(){
  if(dist(0,0,mouseX,mouseY)<30&&mousePressed){
    fill(0,255,0);
   ellipse(mouseX,mouseY,10,10); 
  }
  else if(dist(270,350,mouseX,mouseY)<20&&mousePressed){
    fill(0,255,0);
   ellipse(mouseX,mouseY,10,10);
   float k=random(0,400);
   float a=random(0,400);
   println("you are not a complete failure");
   image(creeper,k,a);
  }
  else if(dist(0,0,mouseX,mouseY)>30&&mousePressed){
    fill(255,0,0);
   ellipse(mouseX,mouseY,10,10); 
  }
  
  
  
}