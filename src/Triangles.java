import java.util.ArrayList;

public class Triangles {
    ArrayList<Triangle> triangles;

    public Triangles() {
        triangles= new ArrayList<>();
    }

    public ArrayList<Triangle> getTriangles() {
        return triangles;
    }

    public void setTriangles(ArrayList<Triangle> triangles) {
        this.triangles = triangles;
    }
    public void addTriangle(Triangle triangle) {
        this.triangles.add(triangle);
    }
}
