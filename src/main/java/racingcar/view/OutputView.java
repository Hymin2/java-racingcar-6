package racingcar.view;

import java.util.List;
import racingcar.model.RacingCar;

public class OutputView {
    public void printRacingCarNameInputMessage(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printNumberOfTryInputMessage(){
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printResult(){
        System.out.println("실행 결과");
    }

    public void printWinner(){
        System.out.println("최종 우승자 : ");
    }


}
