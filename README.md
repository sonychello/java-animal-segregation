# Java Animal Segregation

A Java project demonstrating work with **class hierarchies, collections, and generic methods**.

The project contains an animal kingdom hierarchy and implements a generic `segregate` method for distributing animals from a source collection into three target collections.

## Task

Implement:

```text
segregate(SrcCollection, Collection1, Collection2, Collection3)
```

where:

* `SrcCollection` is the source collection;
* `Collection1` receives hedgehogs;
* `Collection2` receives manuls;
* `Collection3` receives lynxes.

The method must support different levels of the animal hierarchy as collection types.

For example:

```text
segregate(Млекопитающие, Ежовые, Кошачьи, Хищные)
segregate(Хищные, Хордовые, Манулы, Кошачьи)
segregate(Ежовые, Насекомоядные, Хищные, Хищные)
```

## Main Concepts

The project demonstrates:

* inheritance;
* class hierarchies;
* Java generics;
* collections;
* type parameters and bounds;
* distributing objects between collections.

## Technologies

* Java
* Generics
* Collections Framework
* Object-oriented programming

## Demonstration

The program demonstrates the `segregate` method with different combinations of source and destination collection types.
