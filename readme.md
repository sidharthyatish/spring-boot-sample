## Sample Spring Project

### What is this?
A sample spring project that explains the power of spring in dependency injection.  
This is my first project to get familiar with Spring framework as I follow course.

### Project Structure
1. ```HelloWorldApplication``` is the starting point of the application  
2. ```SortAlgorithm``` is an interface  
3. ```QuickSort``` and ```BubbleSort``` implements ```SortAlgorithm```  
4. `BinarySearch` contains an instance of ```SortAlgorithm```  

### How does this work?
1. Using Spring, we have declared ```QuickSort``` and `BubbleSort` as `@Components`  
2. We have `@autowired` `SortAlgorithm` to `BinarySearch`  
3. Thus there is no need to explicitly create an instance of `SortAlgorithm` inside `BinarySearch`.  
4. This would be automatically taken care by Spring as **Setter Injection** (due to absence of constructor, the default injection is setter)
5. `BinarySearch` is also a `@Component`. We can get the instance (which is called a Bean) from the `ApplicationContext` itself.
6. All the dependencies and their respective instances are injected by Spring. Yaaay!!!

### How to run?
Run the main function of `HelloWorldApplication.java`
