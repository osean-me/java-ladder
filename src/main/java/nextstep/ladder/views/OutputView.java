package nextstep.ladder.views;

import nextstep.ladder.entity.Ladder;
import nextstep.ladder.entity.PrizeResult;

public class OutputView extends View {
	public void showResult(Ladder ladder, PrizeResult prizeResult) {
		out.println("실행 결과");
		out.println(ladder);
		out.println(prizeResult);
	}

	public void showResultParticipant(String result) {
		out.println("실행 결과");
		out.println(result);
	}
}
