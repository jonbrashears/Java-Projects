/* Author: Jonathan Brashears
 * 5.30 Global Warming
 * This program will administer a test on global warming.
 * 
 */
package global.warming;
import java.util.Scanner;

public class GlobalWarming {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int CorrectAnswers = 1;  //Tracks number of correct answers.
        
        System.out.println("This quiz will test your knowledge on global warming.");
        System.out.printf("\nFollowing each question, please input the number corresponing to the answer you choose.\n\n");
        
        //Beginning of quiz
        //Question 1
        System.out.print("Which of the following greenhouse gasses is most associated with global warming?");
        System.out.printf("\n1: Carbon Monoxide\n2: Carbon Dioxide\n3: Methane\n4: Sulfur\n");
        int Answer1 = sc.nextInt();
        if(Answer1 == 2)
        {
            CorrectAnswers++;
        }
        
        //Question 2
        System.out.print("Which of the following is the world's largest carbon sink?");
        System.out.printf("\n1: Oceans\n2: The Rainforest\n3: The Arctic\n4: Coniferous Forests\n");
        int Answer2 = sc.nextInt();
        if(Answer2 == 1)
        {
            CorrectAnswers++;
        }
        
        //Question 3
        System.out.print("Which of the following countries produce the most greenhouse gasses?");
        System.out.printf("\n1: United States\n2: Russia\n3: India\n4: China\n");
        int Answer3 = sc.nextInt();
        if(Answer3 == 4)
        {
            CorrectAnswers++;
        }
        
        //Question 4
        System.out.print("The amount of ice in Antarctica is currrently: ");
        System.out.printf("\n1: Decreasing\n2: Increasing\n3: Staying the same\n4: Not measured\n");
        int Answer4 = sc.nextInt();
        if(Answer4 == 2)
        {
            CorrectAnswers++;
        }
        
        //Question 5
        System.out.print("Which of the following human activites produces the most greenhouse gasses?");
        System.out.printf("\n1: Electrical production\n2: Transportation\n3: Griculture\n4: Industries\n");
        int Answer5 = sc.nextInt();
        if(Answer5 == 1)
        {
            CorrectAnswers++;
        }
        
        //switch for results
        switch(CorrectAnswers){
            case 6:
                System.out.print("Excellent! You got all 5!");
                break;
            case 5:
                System.out.print("Very Good! You got 4 correct!");
                break;
            case 4:
                System.out.printf("You only got 3 correct.  Time to brush up on your knowledge of global warming. Here are some helpful sources:\nhttps://www3.epa.gov/climatechange/ghgemissions/sources.html\nhttp://www.nasa.gov/content/goddard/antarctic-sea-ice-reaches-new-record-maximum/\nhttps://en.wikipedia.org/wiki/List_of_countries_by_carbon_dioxide_emissions\n");
                break;
            case 3:
                System.out.printf("You only got 2 correct.  Time to brush up on your knowledge of global warming. Here are some helpful sources:\nhttps://www3.epa.gov/climatechange/ghgemissions/sources.html\nhttp://www.nasa.gov/content/goddard/antarctic-sea-ice-reaches-new-record-maximum/\nhttps://en.wikipedia.org/wiki/List_of_countries_by_carbon_dioxide_emissions\n");
                break;
            case 2:
                System.out.printf("You only got 1 correct.  Time to brush up on your knowledge of global warming. Here are some helpful sources:\nhttps://www3.epa.gov/climatechange/ghgemissions/sources.html\nhttp://www.nasa.gov/content/goddard/antarctic-sea-ice-reaches-new-record-maximum/\nhttps://en.wikipedia.org/wiki/List_of_countries_by_carbon_dioxide_emissions\n");
                break;
            case 1:
                System.out.printf("You got 0 correct.  Time to brush up on your knowledge of global warming. Here are some helpful sources:\nhttps://www3.epa.gov/climatechange/ghgemissions/sources.html\nhttp://www.nasa.gov/content/goddard/antarctic-sea-ice-reaches-new-record-maximum/\nhttps://en.wikipedia.org/wiki/List_of_countries_by_carbon_dioxide_emissions\n");
                break;
        }
    }
    
}
