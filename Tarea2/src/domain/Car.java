package domain;

public class Car {
    
    //atributos 
    private String name; 
    private int year; 
    private float mileaje; 
    private boolean american; 
    private int series;  
    
    //constructores 
    public Car(){
        
        this.name = ""; 
        this.year = 0; 
        this.mileaje = 0; 
        this.american = false; 
        this.series = 0; 
    }

    
    public Car(String name, int year, float mileaje, boolean american, int series) {
        this.name = name;
        this.year = year;
        this.mileaje = mileaje;
        this.american = american;
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMileaje() {
        return mileaje;
    }

    public void setMileaje(float mileaje) {
        this.mileaje = mileaje;
    }

    public boolean isAmerican() {
        return american;
    }

    public void setAmerican(boolean american) {
        this.american = american;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car: " + "Serie= " + series + " / Marca= " + name + " / Año= " + year + " / Kilometraje= " + mileaje + " / Americano= " + american;
    }
    
    public int sizeInBytes() {
        return 8 + 1 + 4 + this.getName().length()*2; //4 por el float, 1 por booleano, 8 por int, más dos por el método whrite UTF 
    }
    
}
