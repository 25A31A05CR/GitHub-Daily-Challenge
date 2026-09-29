class Details{
public static void main(String args[]){
System.out.println("Name: Varun sai shanmukh");
   System.out.println("AGE: 20");
   System.out.println("COLLEGE NAME: PRAGATI ENGINEERING COLLEGE");
   System.out.println("BRANCH: CSE");
   System.out.println("HOBBIES: Playing cricket, Listening music, Watching movies");
    System.out.println("FAVORITE FOOD: Biryani, Chicken, Pizza");
    System.out.println("FAVORITE COLOR: Black, Blue");
    System.out.println("FAVORITE PLACE: Beach, Hill station");
    System.out.println("FAVORITE SPORT: Cricket, Football");
    System.out.println("FAVORITE MOVIE: The Shawshank Redemption, Inception");
    System.out.println("FAVORITE SONG: Shape of You, Blinding Lights");
    System.out.println("FAVORITE ACTOR: Robert Downey Jr., Chris Hemsworth");
    System.out.println("FAVORITE ACTRESS: Scarlett Johansson, Emma Watson");
    System.out.println("FAVORITE BOOK: The Alchemist, To Kill a Mockingbird");
    System.out.println("FAVORITE AUTHOR: Paulo Coelho, Harper Lee");
    System.out.println("my 3 subjects marks are:");
    System.out.println("Maths: 95");
    System.out.println("Science: 90");
    System.out.println("English: 85");
    int totalMarks = 95 + 90 + 85;
    System.out.println("Total Marks: " + totalMarks);   
    double Average = totalMarks / 3.0;
    System.out.println("Average Marks: " + Average);
    if (Average >= 90) {
        System.out.println("Grade: A");
    } else if (Average >= 80) {
        System.out.println("Grade: B");
    } else if (Average >= 70) {
        System.out.println("Grade: C");
    } else if (Average >= 60) {
        System.out.println("Grade: D");
    } else {
        System.out.println("Grade: F");
    }
}