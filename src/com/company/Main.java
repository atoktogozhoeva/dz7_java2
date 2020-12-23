package com.company;
import java.util.*;
import java.util.stream.Collectors;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> A = new ArrayList<>();
        ArrayList<String> B = new ArrayList<>();
        ArrayList<String> C = new ArrayList<>();

        atList(A);

        print(A);

        atList(B);

        Collections.reverse(B);

        print(B);


        // {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
        // 1,2,3,4,5
        //5,4,3,2,1

        Iterator<String> iteratorA = A.iterator();
        Iterator<String> iteratorB = B.iterator();

        while (iteratorA.hasNext() & iteratorB.hasNext()) {
            C.add(iteratorA.next());
            C.add(iteratorB.next());
        }
        print(C);

        ArrayList<String> sorted = (ArrayList<String>) C.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        print(sorted);
    }

    public static void atList(ArrayList<String> list) {
        System.out.println(" Введите 5 слов");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        System.out.println(" Вы заполнили :");
    }

    public static void print(ArrayList<String> list) throws InterruptedException {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            Thread.sleep(1200);
        }
    }
}