
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int x = 200;
  int y = 200;
  for(int i = 0; i <5; i++){
    if(i % 2 == 0){
      fill(123,176,222);
    }
    else{
      fill(152,146,148);
    }
    ellipse(250, 250, x, y);
    x = x - 50;
    y = y - 50;
  }
  //Use an if statement and remainder to alternate the color of your rings.
  
    
    
  
}
