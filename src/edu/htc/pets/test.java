package edu.htc.pets;
public class test {

    public static void main(String[] args) {
        Cat catArray[] = new Cat[3];

        Cat catOne = new Cat();
        catOne.setAge(1);
        catOne.setName("Brian");
        catArray[0] = catOne;

        Cat catTwo = new Cat();
        catTwo.setAge(2);
        catTwo.setName("Carolyn");
        catArray[1] = catTwo;

        Cat catThree = new Cat();
        catThree.setAge(8);
        catThree.setName("Tres");
        catArray[2] = catThree;

        System.out.println("Displaying Cat Information");
        int i;
        int i1;
        for (i = 0; i < 3; i = i + 1)
        {
            i1 = i + 1;
            System.out.println("Cat " + i1 + "'s name is " + catArray[i].getName());
            System.out.println("Their age is " + catArray[i].getAge());
            System.out.println("And their age in cat years is " + catArray[i].getHumanAge());
        }
    }
}