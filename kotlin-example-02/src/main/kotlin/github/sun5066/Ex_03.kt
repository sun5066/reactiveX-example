package github.sun5066

import io.reactivex.Single

/**
 * Single 이란
 * 오직 1개의 데이터를 전달할때 사용하는 생산자이다.
 * Http Get Request 와 같이 결과가 1개의 데이터 or 실패인 경우 사용한다.
 * observer 방식으로 consumer 등록시 SingleObserver 를 구현해 전달한다.
 * consumer 방식을 사용할 시 onSuccess 와 onError 만 있다.
 * */
fun main() {
    /**
     * @param subscribe({0}) onSuccess – the Consumer<T> you have designed to accept the emission from the Single
     * @param subscribe({1}) onError – the Consumer<Throwable> you have designed to accept any error notification from the Single
     * */
    val observer = Single.just(16)
        .subscribe(
            { println("onSuccess $it") },
            { println("onError") }
        )
}