package trainig.shape;

public abstract class Shape {
    
    private final String title;
    
    protected Shape(String name) {
        this.title = name;
}

    public String getTitle() {
        return title;
    }
   
}