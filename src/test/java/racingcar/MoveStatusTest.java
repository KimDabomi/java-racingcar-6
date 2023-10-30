package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.race.MoveStatus;

class MoveStatusTest {
    @Test
    @DisplayName("이동 상태 인스턴스 생성확인")
    void MoveStatus_인스턴스_생성확인() {
        MoveStatus moveStatus = new MoveStatus();
    }

    @Test
    @DisplayName("이동 여부 true인 경우에 대한 동작확인")
    void canMove_동작확인() {
        MoveStatus moveStatus = new MoveStatus();
        moveStatus.setTestMoveStatus(true);
        int randomNumber = 3;
        boolean moveResult = moveStatus.canMove();
        assertThat(moveResult).isEqualTo(true);
    }

    @Test
    @DisplayName("이동 여부 false인 경우에 대한 동작확인")
    void canMove_동작확인2() {
        MoveStatus moveStatus = new MoveStatus();
        moveStatus.setTestMoveStatus(false);
        int randomNumber = 3;
        boolean moveResult = moveStatus.canMove();
        assertThat(moveResult).isEqualTo(false);
    }
}