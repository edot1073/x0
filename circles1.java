//// Wild circles #1.

// GLOBAL VARIABLES //
float x,y;

// Setup:  screen size, initialization. //
void setup() {
  size(500, 500);        // Try changing the width & height.
  x=  width/5;
  y=  height/12;
}

// Next frame:  draw three circles. //
void draw() {
  ellipse(x, y, 80, 80);
  ellipse(x+60, y+60, 40, 40);
  ellipse(x+90, y+90, 20, 20);
 
    x=  x + 2;  y=  y + 1;
  // Insert BREAK here ^
  // to uncomment the above code,
}
