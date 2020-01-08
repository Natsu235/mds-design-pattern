package fr.mds.mydigitalfastfood;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		// Initialisation du builder
		MealBuilder mealBuilder1 = new MealBuilder();

		// Création d'un menu végétarien
		Meal vegMeal = mealBuilder1.prepareVegMeal().build();
		System.out.println("- Veggie Meal -");
		vegMeal.showItems();
        vegMeal.getTotalCost();

        // Initialisation du builder
        MealBuilder mealBuilder2 = new MealBuilder();

		// Création d'un menu non-végétarien
		Meal nonVegMeal = mealBuilder2.prepareNonVegMeal().build();
		System.out.println("\n- Chicken Meal -");
		nonVegMeal.showItems();
		nonVegMeal.getTotalCost();

		// Initialisation du builder
		MealBuilder mealBuilder3 = new MealBuilder();

		// Création d'un menu enfant
		Meal happyMeal = mealBuilder3.prepareHappyMeal().build();
		System.out.println("\n- Happy Meal -");
		happyMeal.showItems();
		happyMeal.getTotalCost();

		//Meal vegMeal = mealBuilder.prepareVegMeal().build();
		//System.out.println("Veg Meal");
		//vegMeal.showItems();
		//System.out.println("Total Cost: " + vegMeal.getCost());

		//Meal nonVegMeal = mealBuilder.prepareNonVegMeal().build();
		//System.out.println("\n\nNon Veg Meal");
		//nonVegMeal.showItems();
		//System.out.println("Total Cost: " + nonVegMeal.getCost());

		//Meal customMeal = mealBuilder.prepareNonVegMeal().addItem(new ChickenBurger()).build();
		//System.out.println("\n\nCustom Meal");
		//customMeal.showItems();
		//System.out.println("Total Cost: " + customMeal.getCost());
    }

}
