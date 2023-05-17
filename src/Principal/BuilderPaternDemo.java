
package Principal;


public class BuilderPaternDemo {
    public static void main (String [] args){
        
        MealBuilder mealBuilder = new MealBuilder();
    
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Custo total: " + vegMeal.gesCost());
        
        Meal nonvegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non veg Meal");
        nonvegMeal.showItems();
        System.out.println("Custo total: " + nonvegMeal.gesCost());
}
}