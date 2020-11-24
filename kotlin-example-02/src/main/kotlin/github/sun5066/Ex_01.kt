package github.sun5066

import io.reactivex.Observable

fun main() {
    Observable // 데이터 생산자
        .just("Hello?", "RxJava!?") // 생성 연산자
        .map { it.dropLast(1) } // 변환 연산자 : 데이터의 가공 (뒷자리 하나 제거)
        .subscribe(::println) // 소비자 : 데이터를 받아서 println 으로 출력


}
