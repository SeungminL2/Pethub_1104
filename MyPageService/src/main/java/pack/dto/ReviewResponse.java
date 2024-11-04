package pack.dto;

import lombok.Getter;
import pack.domain.Review;

@Getter
public class ReviewResponse {
	private final Long rating;
	private final String text;
	
	public ReviewResponse(Review review) {
		this.rating = review.getRating();
		this.text = review.getText();
	}
}
