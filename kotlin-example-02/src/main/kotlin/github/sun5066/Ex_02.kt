package github.sun5066

import io.reactivex.Observable

/**
 * Observable 이란
 * 0 ~ n개의 데이터를 전달하는 생산자.
 * consumer 방식으로 구현하는 코드
 * observer 방식으로 consumer 패턴사용시 Observer 를 구현해서 전달한다.
 * */
fun main() {
    val observer = Observable.just(11, 12, 13, 14, 15)
        .map {
            if (it == 16) {
                throw IllegalStateException()
            } else {
                println("data : $it")
                it
            }
        }
    /**
    * @param subscribe({0}) @ onNext - the Consumer<T> you have designed to accept emissions from the ObservableSource
    * @param subscribe({1}) onError - the Consumer<Throwable> you have designed to accept any error notification from the ObservableSource
    * @param subscribe({2}) onComplete - the Action you have designed to accept a completion notification from the ObservableSource
    * @param subscribe({3}) onSubscribe - the Consumer that receives the upstreams Disposable
    * */
    observer.subscribe(
        { println("onNext ${it}") },
        { println("onError") },
        { println("onComplete") },
        { println("onSubscribe") }
    )
}