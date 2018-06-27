
boolean h=true;
 PImage minecraft;
PImage creeper;
float x;
   float y;
  
void setup(){
  size(500,400);
 minecraft= loadImage("green.jpg");     //in setup method
minecraft.resize(500, 400);          //in setup method
background(minecraft);          //in setup method
  creeper=loadImage("creeper.png");
 
  creeper.resize(10,10);
    x=random(0,500);
    y=random(0,400);
   image(creeper,x,y);
}


void draw(){
  
  if(dist(0,0,mouseX,mouseY)<30&&mousePressed){
    fill(0,255,0);
   ellipse(mouseX,mouseY,10,10); 
  
}
 if(dist(0,0,mouseX,mouseY)>30&&mousePressed){
    fill(255,0,0);
   ellipse(mouseX,mouseY,10,10); 
  
}

   if(dist(x,y,mouseX,mouseY)<20&&mousePressed){
     x=random(0,500);
    y=random(0,400);
   background(minecraft);
    fill(0,255,0);
   ellipse(mouseX,mouseY,10,10);
     image(creeper,x,y);
   
    
  
   println("you are not a complete failure");
  }
 
   
  
  
}