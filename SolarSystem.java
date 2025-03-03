package trainig.solar;

public class SolarSystem {

    private Star sun = new Star("خورشید");
    private Planet[] planets = {new Planet("عطارد"), new Planet("ونوس"), new Planet("زمین"), new Planet("مریخ"), new Planet("مشتری"), new Planet("زحل"), new Planet("اورانوس"), new Planet("نپتون")};
    
    public static void main(String[] args) {
        SolarSystem ss = new SolarSystem();
        ss.printPlanets();
        
    }
    
    private void printPlanets() {
        for (Planet planet : planets) {
            System.err.println(" " + planet.getName());
        }
    }
}
