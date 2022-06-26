import java.util.HashSet;
import java.util.Set;

public class Object {
    private String name;
    private double area;
    private static int objectID = 1;
    private int ID;
    private static Set<Object> objectsList;

    public Object(String name, double area){
        this.name = name;
        this.area = area;
        ID= objectID++;
        addObject();
    }

    public Object(String name, double length, double width, double height){
        this.name = name;
        this.area =(2*length*width)+(2*height*width)+(2*length*height);
        ID= objectID++;
        addObject();
    }

    public void addObject(){
        if(objectsList==null){
            objectsList = new HashSet<>();
            objectsList.add(this);
        }else {
            objectsList.add(this);
        }

    }

    public static Set<Object> getObjectList() {
        return objectsList;
    }

    public double getArea() {
        return area;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "[Obiekt: "+this.name + ", ID:"+ this.ID + ", rozmiar: "+this.area +"] ";
    }
}
