// Underneath is the description of the practice problem in Bosnian
/*
Nastavnici se natjecu u fakultetskom "Master Chef" natjecanju, u kojem
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
ocjenu svih studenata koji su ocjenili neki CompetitionEntry.
 */

import java.util.List;
import java.util.ArrayList;

public class CompetitionEntry {
    final private Teacher teacher;
    final private Dessert dessert;
    final private List<Student> students;
    final private List<Integer> grades;

    public CompetitionEntry(Teacher teacher, Dessert dessert) {
        this.teacher = teacher;
        this.dessert = dessert;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public Dessert getDessert() {
        return this.dessert;
    }

    public List<Student> getStudents() {
        return this.students;
    }

    public List<Integer> getGrades() {
        return this.grades;
    }

    private boolean checkStudentRepetition(Student checkStudent) {
        for (Student student : this.students) {
            if (student.equals(checkStudent)) {
                return true;
            }
        }
        return false;
    }

    public boolean addRating(Student student, int grade) {
        if(this.students.size() > 3) return false;
        else if(this.checkStudentRepetition(student)) return false;

        this.students.add(student);
        this.grades.add(grade);

        return true;
    }

    public double getRating() {
        int sum = 0;

        for(int grade : this.grades) {
            sum += grade;
        }

        if(this.grades.size() == 0) return 0.0;

        return sum / (double)this.grades.size();
    }
}