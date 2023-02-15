
public class ReviewTest {

	public static void main(String[] args) {
		
		System.out.println(Review.sentimentVal("black"));
		Review.totalSentiment("SimpleReview.txt");
		System.out.println("The total sentiment value is: " + Review.totalSentiment("SimpleReview.txt"));
		System.out.println("The star rating is " + Review.starRating("SimpleReview.text" + "/5 stars"));
		System.out.println(Review.fakeReview("SimpleReview.txt"));
	}

}
