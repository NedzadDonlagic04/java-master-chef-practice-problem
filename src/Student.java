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
public class Student extends Person{
    private String studentId;
    private short academicYear;

    public Student(String name, String surname, int age, String studentId, short academicYear) {
        super(name, surname, age);

        this.studentId = studentId;
        this.academicYear = academicYear;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setAcademicYear(short academicYear) {
        this.academicYear = academicYear;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public short getAcademicYear() {
        return this.academicYear;
    }

    @Override
    public String toString() {
        return super.toString() + ", studentID=" + this.studentId + ", academicYear=" + this.academicYear;
    }

    public boolean equals(Student s) {
        return this.studentId.equals(s.studentId);
    }
}