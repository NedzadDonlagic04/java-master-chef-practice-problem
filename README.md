# java-master-chef-practice-problem

This project is a culmination of a lot of projects
which will be listed below in Bosnian:
1. Napravite klasu Dessert koja ima sljedece privatne atribute: name(String),
   weight(double) i calories(int). Dodajte klasi konstruktor koji prima kao
   parametre vrijednosti za sva 3 atributa. Napravite get i set metode za svaki
   atribut, te nadjacajte metodu toString. Napisite i javnu metodu getDessertType
   koja nema argumenata a vraca string "dessert". <br><br>

2. Napravite klase Cake i IceCream koje nasljeduju Dessert. Kolac, uz
   sve atribute iz klase Dessert ima i atribute containsGluten (boolean)
   i cakeType (String, moze biti "birthday", "wedding", "regular" i sl.).
   Sladoled ima dodatne atribute flavour (String) i color (String).
   Napravite get i set metoda za svaki atribut, kao i metodu toString koja
   vraca sve sto vraca i metoda toString iz klase Dessert, a dodatno jos i
   atribute za izvedenu klasu. Napisite javnu metodu getDessertType u svakoj
   od izvedenih klasa, koja ce za program s kojim cete testirati sve zadane
   funkcionalnosti.<br><br>

3. Napravite klasu Person koja opisuje neku osobu. Person sadrzi atribute
   name (String), surname (String), age (int). Napisite konstruktor, get
   i set metode, te metode toString i equals (dvije osobe su jednake ako
   imaju isto ime i prezime te broj godina).<br><br>

4. Napravite klase Student i Teacher koje nasljeduju klasu Person, Student
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
   potrebno povecati placu za zadani postotak.<br><br>

5. Nastavnici se natjecu u fakultetskom "Master Chef" natjecanju, u kojem
   svaki nastavnik priprema jedan desert, a studenti ih ocjenjuju. Za to
   cemo napraviti klasu Competition Entry koja sadrzi referencu na jedan
   objekt tipa Teacher (osoba koja je pripremila desert), referencu na jedan
   objekt tipa Dessert, te polje referenci na studente koji su ocijenili dani
   desert i polje ocjena koje su dali (predpostavite da 3 studenta ocjenjuju
   jedan desert). Napisite konstruktor koji prima referencu na nastavnika i
   desert, sve gettere te metodu addRating koja ima parametre Student i cijeli
   broj (grade), a vraca boolean ovisno o tome je li uspjela ili ne ubaciti novi
   zapis u dani CompetitionEntry (najvise tri ratinga i studenti se ne smiju
   ponavljati). Napisite i metodu getRating koja vraca prosjecnu ocjenu svih
   ocjenu svih studenata koji su ocjenili neki CompetitionEntry.<br><br>

6. Napravite klasu UniMasterChef koja sadrzi polje referenci tipa
   CompetitionEntry, metodu addEntry (po uzoru na metodu addRating),
   metodu getBestDessert koja ce vratiti najbolje ocijenjeni desert,
   kao i staticku metodu getInvolvedPeople koja prima argument tipa
   CompetitionEntry, a vraca referencu na polje osoba koje su sudjelovale
   u izradi ili ocjenjivanju kolaca. Konstruktor za UniMasterChef prima
   jedan cijeli broj (broj prijava na natjecanje). Napisite metodu main
   u kojoj cete testirati danu funkcionalnost.

    Za isjecak koda:
   <br>
    Dessert genericDessert = new Dessert("Chocolate Mousse", 120, 300);<br>
    Cake cake = new Cake("Raspberry chocolate cake #3", 350.5, 400, false, "birthday");<br>
   <br>
    Teacher t1 = new Teacher("Dario", "Tusek", 42, "dario.tusek@fer.hr", "OOP", 10000);<br>
    Teacher t2 = new Teacher("Doris", "Bezmalinovic", 43, "doris.bezmalinovic@fer.hr", "OOP", 10000);<br>
   <br>
    Student s1 = new Student("Janko", "Horvat", 18, "0036312123", (short)1);<br>
    Student s2 = new Student("Ana", "Kovac", 19, "0036387656", (short)2);<br>
    Student s3 = new Student("Ivana", "Stanic", 19, "0036392357", (short)1);<br>
   <br>
    UniMasterChef competition = new UniMasterChef(2);<br>
   <br>
    CompetitionEntry e1 = new CompetitionEntry(t1, genericDessert);<br>
    competition.addEntry(e1);<br>
    System.out.println("Entry 1 rating: " + e1.getRating());<br>
    
    e1.addRating(s1, 4);<br>
    e1.addRating(s2, 5);<br>
    System.out.println("Entry 1 rating: " + e1.getRating());<br>
   <br>
    CompetitionEntry e2 = new CompetitionEntry(t2, cake);<br>
    e2.addRating(s1, 4);<br>
    e2.addRating(s3, 5);<br>
    e2.addRating(s2, 5);<br>
    competition.addEntry(e2);<br>
    System.out.println("Entry 2 rating: " + e2.getRating());<br>
   <br>
    System.out.println("Best dessert is: " + competition.getBestDessert().getName());<br>
   <br>
    Person[] e2person = UniMasterChef.getInvolvedPeople(e2);<br>
   <br>
    for(Person p : e2person)<br>
    System.out.println(p);<br>
   <br>
    Ocekuje se sljedeci ispis:<br>
    Entry 1 rating: 0.0<br>
    Entry 1 rating: 4.5<br>
    Entry 2 rating: 4.666666666666667<br>
    Best dessert is: Raspberry chocolate cake #3<br>
    Doris Bezmalinovic, age=43, email=doris.bezmalinovic@fer.hr, subject=OOP, salary: 10000.0<br>
    Janko Horvat, age=18, studentId=0036312123, academicYear=1<br>
    Ivana Stanic, age=19, studentid=0036392357, academicYear=1<br>
    Ana Kovac, age=19, studentId=0036387656, academicYear=2<br>