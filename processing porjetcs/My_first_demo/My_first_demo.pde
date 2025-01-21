// Happens at launcgh
Ball[] ballGroup;
int pos = 0; 

void setup(){
    size(1280, 720);
    background(200,200,200);
    ballGroup = new Ball[100];
  
}

// Happens constantly (screen refresh)
void draw(){
    background(200,200,200);

    for (int i = 0; i < pos; i++) {
        ballGroup[i].display();
        ballGroup[i].move();
    }


}

void mousePressed() {
    ballGroup[pos] = new Ball(mouseX, mouseY, 100);
    pos++; //next empty position 
}

void keyPressed() {
    
}
class Ball {
    int x, y, r;
    int dx, dy; //speed or velocity
    int cr, cg, cb; //RGB values
    int grav; //gravity
   
    //Constructor
    Ball(int tempx, int tempy, int tempr) {
        x = tempx; //set x cord
        y = tempy; //set y cord
        r = tempr; //set radius

        //set colour
        cr = int( random(0, 255) );
        cg = int( random(0, 255) );
        cb = int( random(0, 255) );


        // set velocity an gravity
        dx = int( random(-10,10));
        dy = int( random(-10,10));
        grav = -1;
    }

    void display() {
        fill(cr, cg, cb);
        circle(x,y,r*2);
    }

    void move() {
        y = y + dy;
        x = x + dx;
        dy = dy - grav;
        
        if (y >= height - r || y <= 0 + r) {
           dy = dy*-1;
        }

        if (x >= width - r || x <= 0 + r) {
            dx = dx * -1;
        }
    }
}


    
