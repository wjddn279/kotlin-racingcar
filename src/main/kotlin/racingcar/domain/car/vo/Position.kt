package racingcar.domain.car.vo

private const val MINIMUM_POSITION_VALUE = 0
private const val MOVE_UNIT = 1

class Position(private var _value: Int = MINIMUM_POSITION_VALUE) {
    val value
        get() = _value

    init {
        require(_value >= MINIMUM_POSITION_VALUE) {
            "자동차의 위치는 음수일 수 없습니다."
        }
    }

    fun move() {
        this._value = _value + MOVE_UNIT
    }
}
