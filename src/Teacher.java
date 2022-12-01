// Underneath is the description of the practice problem in Bosnian
/*
Napravite klase Student i Teacher koje nasljeduju klasu Person, Student
sadrzi atribut studentId (String) i academicYear (short int), a Teacher
sadrzi atribute email (String), subject (String) i salary (double).
Napisite konstruktore za sve parametre, get i set metode, te metode
toString i equals (dva studenta su jednaka ako imaju isti studentId,
neovisno o ostalim podacima, a dva nastavnika su jednaka ako imaju isti
email, neovisno o ostalim podacima). Dodatno, u klasi Teacher napisite
metodu increaseSalary koja ne vraca nista, a prima jedan argument tipa
integer (koji predstavlja postotak). Metoda treba povecati placu nastavnika
za zadani postotak. Takoder, napisite i staticku metodu increaseSalary
koja prima varijabilni broj argumenata, prvi je argument tipa integer
(koji predstavlja postotak), a ostali su objekt tipa Teacher kojima je
potrebno povecati placu za zadani postotak.
 */
public class Teacher extends Person{
    private String email;
    private String subject;
    private double salary;

    public Teacher(String name, String surname, int age, String email, String subject, double salary) {
        super(name, surname, age);

        this.email = email;
        this.subject = subject;
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return this.email;
    }

    public String getSubject() {
        return this.subject;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", email=" + this.email + ", subject=" + this.subject + ", salary: " + this.salary;
    }

    public boolean equals(Teacher t) {
        return this.email.equals(t.email);
    }

    public void increaseSalary(int percent) {
        double part = percent * this.salary / 100;
        this.salary += part;
    }

    public static void increaseSalary(int percent, Teacher[] teachers) {
        for(Teacher teacher : teachers) {
            teacher.increaseSalary(percent);
        }
    }
}