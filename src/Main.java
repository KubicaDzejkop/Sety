import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        int number;
        for(int i = 0; i <= 20; i++){
            number = (int)(Math.random()*50) + 50;
            System.out.print(number + ", ");
            hashSet.add(number);
            linkedSet.add(number);
            treeSet.add(number);
        }
        System.out.println("\nHashSet\n" + hashSet);
        System.out.println("LinkedSet\n" + linkedSet);
        System.out.println("TreeSet\n" + treeSet);
        linkedSet.add(20);
        linkedSet.add(30);
        linkedSet.add(61);

        hashSet.addAll(linkedSet);
        System.out.println(hashSet);

        System.out.println(hashSet.contains(78));

        System.out.println("Drukowanie za pomocą iteratora:");
        Iterator<Integer> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }
        System.out.println();

        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(22, 33, 55, 77, 98, 54 ,22, 55, 54, 37);
        System.out.println(list);
        Set<Integer> drugiSet = new HashSet<>(list);
        System.out.print(drugiSet);
        System.out.println();

        Set<Person> treePerson = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getNameSurname().compareTo(p2.getNameSurname());
            }
        });
        treePerson.add(new Person("Przemek Szynal", "11122233344", 18 ));
        treePerson.add(new Person("Kacper Nowaczek", "11122233344", 18 ));
        treePerson.add(new Person("Sławek Siudens", "13122233344", 27 ));
        treePerson.add(new Person("Kuba Sułecik", "14122233344", 29 ));
        treePerson.add(new Person("Patryk Debil", "15122233344", 55 ));

        for(Person person : treePerson){
            System.out.println(person);
        }
        System.out.println();

        Iterator<Person> itr2 = treePerson.iterator();
        Person currentPerson;
        while (itr2.hasNext()){
            currentPerson = itr2.next();
            if(currentPerson.getPesel().equals("13122233344")){
                itr2.remove();
            }
            System.out.println("---");
            for(Person person : treePerson){
                System.out.println(person);
            }

        }




    }
}