// Underneath is the description of the practice problem in Bosnian
/*
   Napravite klase Cake i IceCream koje nasljeduju Dessert. Kolac, uz
   sve atribute iz klase Dessert ima i atribute containsGluten (boolean)
   i cakeType (String, moze biti "birthday", "wedding", "regular" i sl.).
   Sladoled ima dodatne atribute flavour (String) i color (String).
   Napravite get i set metoda za svaki atribut, kao i metodu toString koja
   vraca sve sto vraca i metoda toString iz klase Dessert, a dodatno jos i
   atribute za izvedenu klasu. Napisite javnu metodu getDessertType u svakoj
   od izvedenih klasa, koja ce za program s kojim cete testirati sve zadane
   funkcionalnosti.
 */
public class IceCream extends Dessert {
    private String flavour;
    private String color;

    public IceCream(String name, double weight, int calories, String flavour, String color) {
        super(name, weight, calories);

        this.flavour = flavour;
        this.color = color;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlavour() {
        return this.flavour;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFlavour: " + this.flavour + "\nColor: " + this.color;
    }

    @Override
    public String getDessertType() {
        return "ice cream";
    }
}
