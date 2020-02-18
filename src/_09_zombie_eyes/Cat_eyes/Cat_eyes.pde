
void setup() {
PImage Meow = loadImage("Meow.jpeg");
image(Meow, 0, 0);
Meow.resize(400,400);
size (400,400);
}
void draw() {
ellipse
println(mouseX);
println(mouseY);
}
