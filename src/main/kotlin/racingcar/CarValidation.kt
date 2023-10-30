package racingcar

class CarValidation {
    fun checkNameInputValidation(input: List<String>) {
        isInputWithinFiveChar(input)
        hasWhiteSpaceAtEdge(input)
        checkAtLeastTwoNames(input)
    }

    private fun isInputWithinFiveChar(list: List<String>) {
        if (list.any { it.length > 5 }) {
            throw IllegalArgumentException("자동차 이름은 5자 이하만 입력 가능합니다.")
        }
    }

    private fun hasWhiteSpaceAtEdge(list: List<String>) {
        if (list.any { it.startsWith(' ') || it.endsWith(' ') }) {
            throw IllegalArgumentException("이름의 시작과 끝에는 공백 입력이 불가능합니다.")
        }
    }

    private fun checkAtLeastTwoNames(list: List<String>) {
        if (list.count() < 2) {
            throw IllegalArgumentException("최소 2대이상의 자동차 이름이 입력되어야 게임 진행이 가능합니다.")
        }
    }


}