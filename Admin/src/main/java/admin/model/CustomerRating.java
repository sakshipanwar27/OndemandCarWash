package admin.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ratingdb")                                            //used to identify a domain object, which is persisted to MongoDB
public class CustomerRating {
	
	     private String washername;
		 private int rating;
		 private String review;
		public CustomerRating() {
			super();
		}
		public CustomerRating(String washername, int rating, String review) {
			super();
			this.washername = washername;
			this.rating = rating;
			this.review = review;
		}
		public String getWashername() {
			return washername;
		}
		public void setWashername(String washername) {
			this.washername = washername;
		}
		public int getRating() {
			return rating;
		}
		public void setRating(int rating) {
			this.rating = rating;
		}
		public String getReview() {
			return review;
		}
		public void setReview(String review) {
			this.review = review;
		}
		@Override
		public String toString() {
			return "CustomerRating [washername=" + washername + ", rating=" + rating + ", review=" + review + "]";
		}
		 
		
}