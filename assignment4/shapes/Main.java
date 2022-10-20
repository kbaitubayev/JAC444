package shapes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	
	private static Shape shapes[];
	private static int numberOfshapes = 0;

	//dynamically resize the array of shapes  
	public static void growArray() {
		
		Shape temp[] = new Shape[numberOfshapes + 1];
		
		for(int i = 0 ; i < numberOfshapes ; i++) {
			temp[i] = shapes[i];
		}
		shapes = temp;
	}
	
	//Filter which shape (Circle, Square, Rectangle, Parallelogram, Triangle)
	public static void shapeFilter(String[] tokens) throws Exception{
		
		try {
			//your code
			if(tokens[0].equalsIgnoreCase("circle") && tokens.length == 2){
				double radius = Double.valueOf(tokens[1]);
				Circle circle = new Circle(radius);	
				growArray();
				shapes[numberOfshapes] = circle;
				numberOfshapes++;
				
			}else if(tokens[0].equalsIgnoreCase("square") && tokens.length == 2) {
				double length = Double.valueOf(tokens[1]);
				Square square = new Square(length);
				growArray();
				shapes[numberOfshapes] = square;
				numberOfshapes++;
				
			}else if(tokens[0].equalsIgnoreCase("rectangle") && tokens.length == 3) {
				double length = Double.valueOf(tokens[1]);
				double width = Double.valueOf(tokens[2]);
				Rectangle rectangle = new Rectangle(length, width);
				growArray();
				shapes[numberOfshapes] = rectangle;
				numberOfshapes++;
				
			}else if(tokens[0].equalsIgnoreCase("parallelogram") && tokens.length == 3) {
				double length = Double.valueOf(tokens[1]);
				double width = Double.valueOf(tokens[2]);
				Parallelogram parallelogram = new Parallelogram(length, width);
				growArray();
				shapes[numberOfshapes] = parallelogram;
				numberOfshapes++;
				
			}else if(tokens[0].equalsIgnoreCase("triangle") && tokens.length == 4) {
				double bottom = Double.valueOf(tokens[1]);
				double high = Double.valueOf(tokens[2]);
				double width = Double.valueOf(tokens[3]);
				Triangle triangle = new Triangle(bottom, high, width);
				growArray();
				shapes[numberOfshapes] = triangle;
				numberOfshapes++;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void readFile(String fileName) throws Exception{
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String s;
			while ((s = br.readLine()) != null) {
			String[] tokens = s.split(",");
			
			//Determine which shape belongs to 
			shapeFilter(tokens);		
		}
		}catch(IOException e) {
			throw new Exception("Fail to open the file!");
		}

	}
	
	private static void task2(Shape[] shapes) {
		
		
		System.out.println();
		System.out.println("------->Task 2 ... <-------");
		
		
		// - delete triangle with minimum perimeter
		double minPerimeter = 10000.0;
		for(Shape triangle: shapes) {
			if(triangle instanceof Triangle) {
				if( minPerimeter > triangle.getPerimeter()) {
					minPerimeter = triangle.getPerimeter();
				}
			}
		}

		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Triangle) {
				if( shapes[i].getPerimeter() == minPerimeter) {
									
					for(int j = i; j < numberOfshapes-1; j++) {
						shapes[j] = shapes[j+1];
					}
					System.out.println("------->Triangle deleted ... <-------");
					numberOfshapes--;
				
				}
			}
		}
		
		// - delete circle with maximum perimeter
		double maxPerimeter = 0.0;
		for(Shape circle: shapes) {
			if(circle instanceof Circle) {
				if( circle.getPerimeter() > maxPerimeter) {
					maxPerimeter = circle.getPerimeter();
				}
			}
		}

		for(int i =0; i < shapes.length; i++) {
			if(shapes[i] instanceof Circle) {
				if( shapes[i].getPerimeter() == maxPerimeter) {
										
						for(int j = i; j < numberOfshapes; j++) {
							shapes[j] = shapes[j+1];
						}
						System.out.println("------->Circle deleted ... <-------");
						numberOfshapes--;
					
				}
			}
		}
		for(int i = 0; i < numberOfshapes; i++) {
			System.out.printf(shapes[i].toString() + "\n"  /*+ "perimeter = %.5f\n\n", shapes[i].getPerimeter()*/);
			//System.out.println(numberOfshapes + " shapes were created:");
		}
		
	}

	private static void task3(Shape[] shapes) {
		
		System.out.println();
System.out.println("------->Task 3 ... <-------");
		
		double totalParallelogramPerimeter = 0;
		double totalTrianglePerimeter = 0;
		
		for(int i = 0; i < numberOfshapes; i++) {
			if(shapes[i].getClass().getSimpleName().equals("Parallelogram")) {
				totalParallelogramPerimeter += shapes[i].getPerimeter();
			}
			else if (shapes[i].getClass().getSimpleName().equals("Triangle")) {
				totalTrianglePerimeter += shapes[i].getPerimeter();
            }
		}
		
		System.out.println("Total perimeter of Parallelogram is: " + totalParallelogramPerimeter);
		System.out.println("Total perimeter of Triangle is: " + totalTrianglePerimeter);
	}
		
		
	
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String fileName = "shapes.txt";
		System.out.println("------->JAC 444 Assignment 1<-------");
		System.out.println("------->Task 1 ... <-------");

		readFile(fileName);
		System.out.println();
		System.out.println(numberOfshapes + " shapes were created:");
		
		for(int i = 0; i < numberOfshapes; i++) {
			System.out.printf(shapes[i].toString() + "\n"  /*+ "perimeter = %.5f\n\n", shapes[i].getPerimeter()*/);
		}

		task2(shapes);
		task3(shapes);
	}
}