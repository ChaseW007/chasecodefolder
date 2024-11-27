// Happens at launcgh
int ballx, bally;
void setup(){
    size(1280, 720);
    background(200,200,200);
    ballx = width/2; 
    bally = height/2;
}

// Happens constantly (screen refresh)
void draw(){
    background(200,200,200);

}

void moveball() {
    if(bally <= height - 200/2) {
        ballx++;
        bally++;
    }

}

class Ball {
    int x, y, r;
    //Constructor
    Ball() {
        x = 300;
        y = 300;
        r = 100;
    }

    void display() {
        circle(x,y,r*2);
    }

    void move() {
        if (y <= height - r) {
            y++;
            x++;
        }
    }
}


    
