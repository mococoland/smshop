package sm.Manager;

import edu.sm.service.ReviewService;

public class ReviewDelete { // JhKim 테스트
    public static void main(String[] args) {
        ReviewService reviewService = new ReviewService();
        String reviewKey = "1";

        try {
            reviewService.remove(reviewKey);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

