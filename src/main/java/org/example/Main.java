package org.example;

import java.util.*;

import org.example.animals.*;
import org.example.animals.mammals.Mammals;
import org.example.animals.mammals.insectivores.hedgehogs.Hedgehogs;
import org.example.animals.mammals.insectivores.hedgehogs.hedgehog.Hedgehog;
import org.example.animals.mammals.predatory.Predatory;
import org.example.animals.mammals.predatory.feline.lynx.Lynx;
import org.example.animals.mammals.predatory.feline.manul.Manul;

public class Main {

    static <T extends Chordates>
    void segregate(Collection<T> srcCollection,
                   Collection<? super Hedgehog> collection1,
                   Collection<? super Manul> collection2,
                   Collection<? super Lynx> collection3) {

        for (T element : srcCollection) {
            if (element instanceof Hedgehog) {
                collection1.add((Hedgehog)element);
            }
            if (element instanceof Manul) {
                collection2.add((Manul)element);
            }
            if (element instanceof Lynx) {
                collection3.add((Lynx)element);
            }
        }

    }

    public static void main(String[] args) {

        List<Chordates> animals = new ArrayList<>();

        Hedgehog hedgehog = new Hedgehog();

        Manul manul = new Manul();

        Lynx lynx = new Lynx();

        animals.add(hedgehog);
        animals.add(manul);
        animals.add(lynx);
        animals.add(new Hedgehog());
        animals.add(new Manul());

        List<Hedgehog> hedgehogsList = new ArrayList<>();
        List<Manul> manulList = new ArrayList<>();
        List<Lynx> lynxList = new ArrayList<>();
        Set<Lynx> lynxSet = new TreeSet<>(Comparator.comparing(Lynx::getName));
        segregate(animals, hedgehogsList, manulList, lynxList);

        // Выводим результаты
        System.out.println("\tРезультаты сортировки");
        System.out.println("Ежики: " + hedgehogsList.size() + " шт.");
        for (Hedgehog h : hedgehogsList) {
            System.out.println("  - Еж с именем: " + h.getName());
        }

        System.out.println("Манулы: " + manulList.size() + " шт.");
        for (Manul m : manulList) {
            System.out.println("  - Манул с именем: " + m.getName());
        }

        System.out.println("Рыси: " + lynxList.size() + " шт.");
        for (Lynx l : lynxList) {
            System.out.println("  - Рысь с именем: " + l.getName());
        }


        System.out.println("\n\tТестирование с коллекциями общего типа");

        List<Chordates> generalHedgehogs = new ArrayList<>();
        List<Mammals> generalManuls = new ArrayList<>();
        List<Predatory> generalLynxes = new ArrayList<>();

        segregate(animals, generalHedgehogs, generalManuls, generalLynxes);

        System.out.println("Ежики в общей коллекции: " + generalHedgehogs.size() + " шт.");
        System.out.println("Манулы в общей коллекции: " + generalManuls.size() + " шт.");
        System.out.println("Рыси в общей коллекции: " + generalLynxes.size() + " шт.");

        System.out.println("\n\tТестирование с пустой коллекцией");
        List<Chordates> emptyList = new ArrayList<>();
        List<Hedgehogs> emptyHedgehogs = new ArrayList<>();
        List<Manul> emptyManuls = new ArrayList<>();
        List<Lynx> emptyLynxes = new ArrayList<>();

        segregate(emptyList, emptyHedgehogs, emptyManuls, emptyLynxes);

        System.out.println("Ежики после пустой коллекции: " + emptyHedgehogs.size() + " шт.");
        System.out.println("Манулы после пустой коллекции: " + emptyManuls.size() + " шт.");
        System.out.println("Рыси после пустой коллекции: " + emptyLynxes.size() + " шт.");
    }
}