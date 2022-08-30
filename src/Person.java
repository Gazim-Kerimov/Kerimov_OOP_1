import java.util.ArrayList;

public class Person {
    private String firstName;
    private String secondName;
    private int age;
    private char sex;
    private Person mother;
    private Person father;
    private ArrayList<Person> childer = new ArrayList<Person>();
    private Person brother;
    private Person sister;
    public Person(String firstName, String secondName, int age, char sex){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.sex = sex;
    }
    public void setParents(Person father, Person mother){
        if(father.getSex() == 'М') {
            this.father = father;
        }
        else System.out.println("Женщина не может быть отцом!");
        if(mother.getSex() == 'Ж'){
            this.mother = mother;
        }
        else System.out.println("Мужчина не может быть матерью!");
    }
    public void addChildren(Person ... person){
        for(int i = 0; i < person.length; i++){
            childer.add(person[i]);
        }
    }
    public void setBrother(Person brother){
        if(brother.getSex() == 'М' && (brother.getMother() == this.getMother() ||
                brother.getFather() == this.getFather())){
            this.brother = brother;
        }
        else System.out.println("Данный человек не может быть братом");
    }
    public void setSister(Person sister){
        if(sister.getSex() == 'Ж' && (sister.getMother() == this.getMother() ||
                sister.getFather() == this.getFather())){
            this.sister = sister;
        }
        else System.out.println("Данный человек не может быть сестрой");
    }


    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        String fullName = this.firstName + " " + this.secondName;
        return fullName;
    }

    public ArrayList<Person> getChildren() {
        return childer;
    }

    public Person getFather() {
        return father;
    }

    public Person getMother() {
        return mother;
    }

    public Person getBrother() {
        return brother;
    }

    public Person getSister() {
        return sister;
    }
}
