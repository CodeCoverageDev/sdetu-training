package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
	// LinkedHash - in order that they were entered
	// HashSet - complete random order
	// Treeset - rearrange to natural order
	// 1. Define the collection
	Set<String> animals = new LinkedHashSet<>(); // random order

	// 2. Adding elements
	animals.add("Dog");
	animals.add("Pig");
	animals.add("Hog");
	animals.add("Cat");
	animals.add("Snake");
	System.out.println(animals.size() + " " + animals);

	animals.add("Cat");
	animals.add("Snake");
	animals.add("Goose");

	// Display unique elements
	System.out.println("Animals: " + animals.size() + " " + animals);

	// Create and new set thar we use for comparison
	Set<String> farmAnimals = new HashSet<String >();
	farmAnimals.add("Chicken");
	farmAnimals.add("Cow");
	farmAnimals.add("Pig");
	farmAnimals.add("Horse");
	farmAnimals.add("Dog");

	System.out.println("Farm Animals: " + farmAnimals.size() + " " + farmAnimals);

	// What is the Intersections animals and farm animals (only anumals and farm animals: "AND")
	// 1. Copy existing set into a new set
	Set<String> intersectionSet = new HashSet<String>(animals);
	// 2. Retain only the elements that are also in other set
	intersectionSet.retainAll(farmAnimals);
	System.out.println("The Intersection is: " + intersectionSet);

	// What is the Union (in both animals and farm animals "OR")
	Set<String> unionSet = new HashSet<String>(farmAnimals);
	unionSet.addAll(animals);
	System.out.println("The union is: " + unionSet);

	// What is the difference (animals but not farm animals)
	Set<String> differentSet = new HashSet<String>(animals);
	differentSet.removeAll(farmAnimals);
	System.out.println("The difference is: " + differentSet);

    }
}
