public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("s92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    }, "05/11/1985", "Java Masterclass");
//            System.out.println(s);
        }

//        Student pojoStudent = new Student("s923006", "Ann", "05/11/2000", "Java Masterclass");
//        LPAStudent recordStudent = new LPAStudent("s923007", "Bill", "06/12/2000", "Java Masterclass");
//
//        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
////        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829"); -- ei tööta// record on immutable, muutmatu
//
//        System.out.println(pojoStudent.getName() + " is taking class " + pojoStudent.getClassList());
//        System.out.println(recordStudent.name() + " is taking class " + recordStudent.classList());

        AnimalInheritance animal = new AnimalInheritance("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog wolf = new Dog ("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("GoldFish", 0.25, 2, 3);
        doAnimalStuff(goldie, "fast");




    }

    public static void doAnimalStuff(AnimalInheritance animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
