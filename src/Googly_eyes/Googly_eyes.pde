void setup(){
  size(600,400);
  background(200,200,200);
noFill();
ellipse(450,200,200,100);
ellipse(150,200,200,100);
fill(255,255,255);
ellipse(450,200,200,100);
ellipse(150,200,200,100);
}
void draw(){
  fill(200,200,200);
rect(0,0,600,400);
 
  if(mouseX>220){
    mouseX=220;
  }
  
   if(mouseX<80){
    mouseX=80;
  }
  
    if(mouseY>217){
    mouseY=217;
  }
  
    if(mouseY<183){
    mouseY=183;
  }
  
  fill(255,255,255);
ellipse(450,200,200,100);
ellipse(150,200,200,100);

 fill(0,0,0);
  ellipse(mouseX,mouseY,40,40);
  ellipse(mouseX+300,mouseY,40,40);
  
  
}
//x,y,width,height