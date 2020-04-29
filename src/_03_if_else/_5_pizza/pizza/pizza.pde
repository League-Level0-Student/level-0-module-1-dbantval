
void setup() {
    size(2000,2000);fill(#FFD390);
    ellipse(1000,270,500,500);
    fill(#FF0320);
    ellipse(1000,270,400,400);
    fill(#FAF58B);
    ellipse(1000,270,390,390);
}
void draw() {
PImage pepp=loadImage("Pepp.jpg");
pepp.resize(70,70);
image(pepp,1070,350);
pepp.resize(50,50);
image(pepp,900,300);
pepp.resize(100,100);
image(pepp,950,100);
}
