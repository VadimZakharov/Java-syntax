package src.Enum;

public enum Seasons {
        SUMMER(35),WINTER(-35),AUTUMN(-5),SPRING(15);

    private int temperature;

    Seasons (int temperature){
        this.temperature = temperature;
                   }

    public int getTemperature() {
        return temperature;
    }

    public String toString(){
        return "Средняя температура " + temperature;
    }
}
