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
public class Cake extends Dessert {
    private boolean containsGluten;
    private String cakeType;

    public Cake(String name, double weight, int calories, boolean containsGluten, String cakeType) {
        super(name, weight, calories);

        this.containsGluten = containsGluten;
        this.cakeType = cakeType;
    }

    public void setContainsGluten(boolean containsGluten) {
        this.containsGluten = containsGluten;
    }

    public void setCakeType(String cakeType) {
        this.cakeType = cakeType;
    }

    public boolean getContainsGluten() {
        return this.containsGluten;
    }

    public String getCakeType() {
        return this.cakeType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nContains Gluten: " + this.containsGluten + "\nCake Type: " + this.cakeType;
    }

    @Override
    public String getDessertType() {
        return "cake";
    }
}
