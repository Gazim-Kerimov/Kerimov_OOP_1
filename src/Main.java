public class Main {
    public static void main(String[] args) {
        Researcher researcher = new Researcher();
        Person david = new Person("Дэвид", "Фишер", 35, 'М');
        Person mary = new Person("Мэри","Фишер", 30, 'Ж');
        Person sam = new Person("Сэм", "Фишер", 12, 'М');
        Person chloe = new Person("Хлоя", "Фишер", 8, 'Ж');
        david.addChildren(sam,chloe);
        mary.addChildren(sam,chloe);
        sam.setParents(david, mary);
        chloe.setParents(david,mary);
        sam.setSister(chloe);
        chloe.setBrother(sam);
        researcher.findRelatives(david);
        researcher.findRelatives(sam);
        researcher.findRelatives(chloe);




    }
}
