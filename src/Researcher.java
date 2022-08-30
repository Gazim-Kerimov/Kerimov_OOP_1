public class Researcher {
    public void findRelatives(Person person){
        System.out.println("Объект исследования: " + person.getFullName() + " | Возраст: "
        + person.getAge() + " | Пол: " + person.getSex());
        if(person.getFather() != null){
            System.out.println("Отец: " + person.getFather().getFullName() + " | Возраст: "
            + person.getFather().getAge());
        }
        else if(person.getFather() == null){
            System.out.println("Данные об отце отсутствуют");
        }
        if (person.getMother()!= null){
            System.out.println("Мать: " + person.getMother().getFullName() + " | Возраст: "
                    + person.getMother().getAge());
        }
        else if(person.getMother() == null){
            System.out.println("Данные о матери отсутствуют");
        }
        if(person.getChildren() != null && !person.getChildren().isEmpty()){
            System.out.println("Дети: ");
            for(Person p : person.getChildren()){
                System.out.print(p.getFullName() + "; ");
            }
            System.out.println();
        }
        else if(person.getChildren() == null || person.getChildren().isEmpty()){
            System.out.println("Данные о детях отсутствуют");
        }
        if(person.getBrother() != null){
            System.out.println("Брат: " + person.getBrother().getFullName() +
                    " | Возраст: " + person.getBrother().getAge());
        }
        else if(person.getBrother() == null){
            System.out.println("Данные о брате отсутствуют");
        }
        if(person.getSister() != null){
            System.out.println("Сестра: " + person.getSister().getFullName() +
                    " | Возраст: " + person.getSister().getAge());
        }
        else if(person.getSister() == null){
            System.out.println("Данные о сестре отсутствуют");
        }

        System.out.println("______________________________");
    }
}
