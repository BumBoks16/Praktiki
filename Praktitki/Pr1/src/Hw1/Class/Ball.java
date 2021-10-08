package Hw1.Class;
public class Ball {
    private String type;
    private String color;
    private int size;

    public Ball(String t, String c, int s) {
        type = t;
        color = c;
        size = s;
    }
    public Ball(String t, String c) {
        type = t;
        color = c;
        size = 1;
    }
    public Ball(String c) {
        type = "";
        color = c;
        size = 1;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getType(String type){
        return type;
    }
    public String getColor(String color){
        return color;
    }
    public int getSize(){
        return size;
    }
    public String toString() {
        return ("This is a " + this.color + " " + this.type + " ball, with " + this.size + " size");
    }
}
