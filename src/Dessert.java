// Underneath is the description of the practice problem in Bosnian
/*
   Napravite klasu Dessert koja ima sljedece privatne atribute: name(String),
   weight(double) i calories(int). Dodajte klasi konstruktor koji prima kao
   parametre vrijednosti za sva 3 atributa. Napravite get i set metode za svaki
   atribut, te nadjacajte metodu toString. Napisite i javnu metodu getDessertType
   koja nema argumenata a vraca string "dessert".
 */
public class Dessert {
    private String name;
    private double weight;
    private int calories;

    public Dessert(String name, double weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getCalories() {
        return this.calories;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nWeight: " + this.weight + "\nCalories: " + this.calories;
    }

    public String getDessertType() {
        return "dessert";
    }
}
