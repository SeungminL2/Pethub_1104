package pack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pack.domain.Review;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddReviewRequest {
	private Long rating;
	private String text;
	
	public Review toEntity() {
		return Review.builder()
				.rating(rating)
				.text(text)
				.build();
	}
}
