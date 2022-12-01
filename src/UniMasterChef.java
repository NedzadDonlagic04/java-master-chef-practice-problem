// Underneath is the description of the practice problem in Bosnian
/*
Napravite klasu UniMasterChef koja sadrzi polje referenci tipa
CompetitionEntry, metodu addEntry (po uzoru na metodu addRating),
metodu getBestDessert koja ce vratiti najbolje ocijenjeni desert,
kao i staticku metodu getInvolvedPeople koja prima argument tipa
CompetitionEntry, a vraca referencu na polje osoba koje su sudjelovale
u izradi ili ocjenjivanju kolaca. Konstruktor za UniMasterChef prima
jedan cijeli broj (broj prijava na natjecanje). Napisite metodu main
u kojoj cete testirati danu funkcionalnost.

Za isjecak koda:

Dessert genericDessert = new Dessert("Chocolate Mousse", 120, 300);
Cake cake = new Cake("Raspberry chocolate cake #3", 350.5, 400, false, "birthday");

Teacher t1 = new Teacher("Dario", "Tusek", 42, "dario.tusek@fer.hr", "OOP", 10000);
Teacher t2 = new Teacher("Doris", "Bezmalinovic", 43, "doris.bezmalinovic@fer.hr", "OOP", 10000);

Student s1 = new Student("Janko", "Horvat", 18, "0036312123", (short)1);
Student s2 = new Student("Ana", "Kovac", 19, "0036387656", (short)2);
Student s3 = new Student("Ivana", "Stanic", 19, "0036392357", (short)1);

UniMasterChef competition = new UniMasterChef(2);

CompetitionEntry e1 = new CompetitionEntry(t1, genericDessert);
competition.addEntry(e1);
System.out.println("Entry 1 rating: " + e1.getRating());

e1.addRating(s1, 4);
e1.addRating(s2, 5);
System.out.println("Entry 1 rating: " + e1.getRating());

CompetitionEntry e2 = new CompetitionEntry(t2, cake);
e2.addRating(s1, 4);
e2.addRating(s3, 5);
e2.addRating(s2, 5);
competition.addEntry(e2);
System.out.println("Entry 2 rating: " + e2.getRating());

System.out.println("Best dessert is: " + competition.getBestDessert().getName());

Person[] e2person = UniMasterChef.getInvolvedPeople(e2);

for(Person p : e2person)
    System.out.println(p);

Ocekuje se sljedeci ispis:
Entry 1 rating: 0.0
Entry 1 rating: 4.5
Entry 2 rating: 4.666666666666667
Best dessert is: Raspberry chocolate cake #3
Doris Bezmalinovic, age=43, email=doris.bezmalinovic@fer.hr, subject=OOP, salary: 10000.0
Janko Horvat, age=18, studentId=0036312123, academicYear=1
Ivana Stanic, age=19, studentid=0036392357, academicYear=1
Ana Kovac, age=19, studentId=0036387656, academicYear=2
 */

import java.util.List;
import java.util.ArrayList;

public class UniMasterChef {
    final private List<CompetitionEntry> competitions;
    final private int size;

    public UniMasterChef(int size) {
        this.size = size;
        competitions = new ArrayList<>();
    }

    public boolean addEntry(CompetitionEntry competition) {
        if(competitions.size() == size) return false;

        competitions.add(competition);
        return true;
    }

    public Dessert getBestDessert() {
        int bestDessertID = 0;
        for(int i=1; i < this.competitions.size(); i++) {
            if(this.competitions.get(i).getRating() > this.competitions.get(bestDessertID).getRating()) {
                bestDessertID = i;
            }
        }

        return this.competitions.get(bestDessertID).getDessert();
    }

    public static Person[] getInvolvedPeople(CompetitionEntry competition) {
        List<Student> students = competition.getStudents();
        int size = students.size() + 1;

        Person[] people = new Person[size];
        people[0] = competition.getTeacher();

        for(int i=1; i < size; i++) {
            people[i] = students.get(i-1);
        }

        return people;
    }
}
