package java_util;

import java_lang.Cat;

import java.util.ArrayList;
import java.util.Collection;

public class arraylist {

    public static void main(String[] args) {

        //CONSTRUCTORS

        //ArrayList()
        //Constructs an empty list with an initial capacity of ten.
        ArrayList arrayListCapacity10 = new ArrayList<>();

        //ArrayList(int initialCapacity)
        //Constructs an empty list with the specified initial capacity.
        ArrayList arrayListWithInitialCapacity = new ArrayList<>(15);

        //ArrayList(Collection<? extends E> c)
        //Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.

        //METHODS

        //void
        //add(int index, E element)
        //Inserts the specified element at the specified position in this list.
        arrayListCapacity10.add(0, "first element");
        arrayListCapacity10.add(1, "second element");
        arrayListCapacity10.forEach(System.out::println);
        arrayListCapacity10.forEach(n -> System.out.println(n));

        //boolean
        //add(E e)
        //Appends the specified element to the end of this list.
        arrayListCapacity10.add("last element");
        arrayListCapacity10.forEach(System.out::println);

        //boolean
        //addAll(int index, Collection<? extends E> c)
        //Inserts all of the elements in the specified collection into this list, starting at the specified position.
        ArrayList otherArrayList = new ArrayList<>();
        otherArrayList.add("one");
        otherArrayList.add("two");
        otherArrayList.add("three");
        arrayListCapacity10.addAll(1, otherArrayList);
        arrayListCapacity10.forEach(System.out::println);

        //boolean
        //addAll(Collection<? extends E> c)
        //Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
        arrayListWithInitialCapacity.addAll(otherArrayList);
        System.out.println(arrayListWithInitialCapacity);

        //void
        //addFirst(E element)
        //Adds an element as the first element of this collection (optional operation).
        arrayListWithInitialCapacity.addFirst("first");
        arrayListWithInitialCapacity.forEach(System.out::println);

        //void
        //addLast(E element)
        //Adds an element as the last element of this collection (optional operation).
        arrayListWithInitialCapacity.addLast("last");
        arrayListWithInitialCapacity.forEach(System.out::println);

        //void
        //clear()
        //Removes all of the elements from this list.
        arrayListWithInitialCapacity.clear();
        arrayListWithInitialCapacity.add("empty array list");
        arrayListWithInitialCapacity.forEach(System.out::println);

        //Object
        //clone()
        //Returns a shallow copy of this ArrayList instance.
        Object arrayListClone = arrayListWithInitialCapacity.clone();
        System.out.println(arrayListClone); //What is a shallow copy?

        //boolean
        //contains(Object o)
        //Returns true if this list contains the specified element.
        System.out.println(arrayListWithInitialCapacity.contains("empty array list"));
        System.out.println(arrayListWithInitialCapacity.contains("one"));

        //void
        //ensureCapacity(int minCapacity)
        //Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
        ArrayList arrayListCapacity3 = new ArrayList<>(3);
        System.out.println(arrayListCapacity3.size());
//        for(int x = 0; x <= 9; x++){
//            arrayListCapacity3.add(x);
//        }
//        arrayListCapacity3.forEach(System.out::println);
        //arrayListCapacity3.ensureCapacity(20);

        //boolean
        //equals(Object o)
        //Compares the specified object with this list for equality.
        System.out.println(arrayListWithInitialCapacity.equals(arrayListClone));
        Cat myCat = new Cat();
        System.out.println(arrayListWithInitialCapacity.equals(myCat));

        //void
        //forEach(Consumer<? super E> action)
        //Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
        ArrayList colorArrayList = new ArrayList<>();
        colorArrayList.add("red");
        colorArrayList.add("orange");
        colorArrayList.add("yellow");
        colorArrayList.forEach(System.out::println);

        //E
        //get(int index)
        //Returns the element at the specified position in this list.
        System.out.println(colorArrayList.get(1));

        //E
        //getFirst()
        //Gets the first element of this collection.
        System.out.println(colorArrayList.getFirst());

        //E
        //getLast()
        //Gets the last element of this collection.
        System.out.println(colorArrayList.getLast());

        //int
        //hashCode()
        //Returns the hash code value for this list.
        System.out.println(colorArrayList.hashCode());

        //int
        //indexOf(Object o)
        //Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
        System.out.println(colorArrayList.indexOf("yellow"));
        System.out.println(colorArrayList.indexOf("green"));

        //boolean
        //isEmpty()
        //Returns true if this list contains no elements.
        System.out.println(colorArrayList.isEmpty());
        colorArrayList.clear();
        System.out.println(colorArrayList.isEmpty());

        //Iterator<E>
        //iterator()
        //Returns an iterator over the elements in this list in proper sequence.
        System.out.println(colorArrayList.iterator()); //???

        //int
        //lastIndexOf(Object o)
        //Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
        ArrayList nameArrayList = new ArrayList<>();
        nameArrayList.add("Bob");
        nameArrayList.add("Tom");
        nameArrayList.add("Henry");
        nameArrayList.add("Bob");
        System.out.println(nameArrayList.lastIndexOf("Bob"));

        //ListIterator<E>
        //listIterator()
        //Returns a list iterator over the elements in this list (in proper sequence).
        System.out.println(nameArrayList.listIterator()); //???

        //ListIterator<E>
        //listIterator(int index)
        //Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
        System.out.println(nameArrayList.listIterator(1)); //???

        //E
        //remove(int index)
        //Removes the element at the specified position in this list.
        nameArrayList.remove(3);
        nameArrayList.forEach(System.out::println);

        //boolean
        //remove(Object o)
        //Removes the first occurrence of the specified element from this list, if it is present.
        nameArrayList.remove("Henry");
        System.out.println(nameArrayList);
        nameArrayList.forEach(System.out::println);

        //



    }
}
