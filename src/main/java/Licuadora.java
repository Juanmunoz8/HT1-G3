public class Licuadora {
    int currentElements = 0;
    boolean state = false;
    boolean full = false;
    int speed = 0;

    public void addElement () {
        if (full) {
            currentElements++;
        }
        full = currentElements > 5 ? true : false;
    }

    public boolean isFull () {
        return full;
    }

    public void changeSpeed(boolean increase) {
        if (increase) {
            speed = (speed + 1) > 10 ? 0 : speed + 1;
        }
        else {
            speed = (speed - 1) < 0 ? 0 : speed - 1;
        }
    }

    public int checkSpeed() {
        if (speed == 0) {
            state = false;
            return speed;
        } else {
            state = true;
            return speed;
        }
    }

    public void IsOn() {
        if (!state) {
            state = true;
            System.out.println("Blender is now ON.");
        } else {
            System.out.println("Blender is already ON.");
        }
    }

    public void empty() {
        currentElements = 0;
        full = false;
        speed = 0;
        state = false;
        System.out.println("Blender is now empty.");
    }
}
